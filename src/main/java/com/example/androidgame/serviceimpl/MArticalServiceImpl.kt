package com.example.androidgame.serviceimpl

import com.example.androidgame.dto.MArticalList
import com.example.androidgame.entity.Artical
import com.example.androidgame.entity.ArticalExample
import com.example.androidgame.entity.Userartical
import com.example.androidgame.entity.UserarticalExample
import com.example.androidgame.mapper.ArticalMapper
import com.example.androidgame.mapper.GameMapper
import com.example.androidgame.mapper.UserallMapper
import com.example.androidgame.mapper.UserarticalMapper
import com.example.androidgame.service.MArticalService
import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MArticalServiceImpl : MArticalService {

    @Autowired(required = false)
    lateinit var articalMapper:ArticalMapper
    @Autowired(required = false)
    lateinit var gameMapper: GameMapper
    @Autowired(required = false)
    lateinit var userallMapper: UserallMapper

    override fun GetList(gameName: String): String {
        var mArticalLists:MutableList<MArticalList> = ArrayList()
        var articalList:MutableList<Artical> = articalMapper.selectByGameName(gameName)
        for (i in articalList){
            var mArticalList:MArticalList = MArticalList()
            mArticalList.articalId = i.articalId
            mArticalList.articalImage = i.articalImage
            mArticalList.articalName = i.articalName
            mArticalList.articalIntroduce = i.articalIntroduce
            mArticalList.userName = userallMapper.selectUserByArtical(i.articalId).userName
            mArticalLists.add(mArticalList)
        }
        return Gson().toJson(mArticalLists)
    }


}