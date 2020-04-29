package com.example.androidgame.serviceimpl

import com.example.androidgame.dto.MGameHomeList
import com.example.androidgame.entity.Game
import com.example.androidgame.entity.Userall
import com.example.androidgame.mapper.GameMapper
import com.example.androidgame.mapper.UserallMapper
import com.example.androidgame.service.MGameService
import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MGameServiceImpl : MGameService{

    @Autowired(required = false)
    lateinit var gameMapper:GameMapper
    @Autowired(required = false)
    lateinit var userallMapper: UserallMapper

    override fun GetList():String {
        var gamelist:List<Game>? = gameMapper.selectAll();
        val mGameList = ArrayList<MGameHomeList>()
        if (gamelist != null) {
            for (i in gamelist){
                var mGameHomeList = MGameHomeList()
                var userall = userallMapper.selectUserByGame(i.gameId)
                mGameHomeList?.gameId = i.gameId
                mGameHomeList?.gameImage = i.gameImage
                mGameHomeList?.gameIntroduce = i.gameIntroduce
                mGameHomeList?.gameName = i.gameName
                mGameHomeList?.userName = userall.userName
                print(mGameHomeList)
                if (mGameHomeList != null) {
                    mGameList?.add(mGameHomeList)
                }
            }

        }
        return Gson().toJson(mGameList)
    }
}