package com.example.androidgame.serviceimpl

import com.example.androidgame.dto.MDiscussList
import com.example.androidgame.dto.MDiscussNewList
import com.example.androidgame.entity.*
import com.example.androidgame.mapper.DiscussMapper
import com.example.androidgame.mapper.GameMapper
import com.example.androidgame.mapper.UserallMapper
import com.example.androidgame.mapper.UserdiscussMapper
import com.example.androidgame.service.MDiscussService
import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MDiscussServiceImpl : MDiscussService{

    @Autowired(required = false)
    lateinit var discussMapper:DiscussMapper
    @Autowired(required = false)
    lateinit var userdiscussMapper: UserdiscussMapper
    @Autowired(required = false)
    lateinit var gameMapper: GameMapper
    @Autowired(required = false)
    lateinit var userallMapper: UserallMapper

    override fun GetList(): String {
        var discussList:MutableList<Discuss> = discussMapper.selectAll()
        var mDiscussList = ArrayList<MDiscussList>()
        for (i in discussList){
            var mDiscuss = MDiscussList()
            var example1: UserdiscussExample = UserdiscussExample()
            var criteria:UserdiscussExample.Criteria = example1.createCriteria()
            criteria.andDiscussIdEqualTo(i.discussId)
            var userdiscussList:MutableList<Userdiscuss> = userdiscussMapper.selectByExample(example1)
            var game:Game = gameMapper.selectByPrimaryKey(userdiscussList[0].gameId)
            var user:Userall = userallMapper.selectByPrimaryKey(userdiscussList[0].userId)
            mDiscuss.discussId = i.discussId
            mDiscuss.discussDetail = i.discussDetail
            mDiscuss.discussTitle = i.discussTitle
            mDiscuss.userImage = user.userImage
            mDiscuss.gameName = game.gameName
            mDiscussList.add(mDiscuss)
        }
        return Gson().toJson(mDiscussList)
    }

    override fun GetDiscussList(gameName:String): String {
        var mDiscussNewLists:MutableList<MDiscussNewList> = ArrayList()
        var discussList:MutableList<Discuss> = discussMapper.selectByGameName(gameName)
        for (i in discussList){
            var mDiscussNewList:MDiscussNewList = MDiscussNewList()
            mDiscussNewList.userImage = userallMapper.selectUserByDiscuss(i.discussId).userImage
            mDiscussNewList.userName = userallMapper.selectUserByDiscuss(i.discussId).userName
            mDiscussNewList.discussId = i.discussId
            mDiscussNewList.discussTitle = i.discussTitle
            mDiscussNewList.discussDetail = i.discussDetail
            mDiscussNewLists.add(mDiscussNewList)
        }
        return Gson().toJson(mDiscussNewLists)
    }
}