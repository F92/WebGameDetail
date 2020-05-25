package com.example.androidgame.serviceimpl

import com.example.androidgame.dto.MGameHomeList
import com.example.androidgame.entity.Game
import com.example.androidgame.entity.GameExample
import com.example.androidgame.entity.Userall
import com.example.androidgame.entity.UserallExample
import com.example.androidgame.mapper.BuyMapper
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
    @Autowired(required = false)
    lateinit var buyMapper: BuyMapper

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
                mGameHomeList?.gamePrice = i.gamePrice
                print(mGameHomeList)
                if (mGameHomeList != null) {
                    mGameList?.add(mGameHomeList)
                }
            }
        }
        return Gson().toJson(mGameList)
    }

    override fun Buy(userName: String, gameName: String): String {
        var buy = com.example.androidgame.entity.Buy()
        var example1:UserallExample = UserallExample()
        var criteria1:UserallExample.Criteria = example1.createCriteria()
        criteria1.andUserNameEqualTo(userName)
        var userList:MutableList<Userall> = userallMapper.selectByExample(example1)
        buy.userId = userList[0].userId
        var example2: GameExample = GameExample()
        var criteria2:GameExample.Criteria = example2.createCriteria()
        criteria2.andGameNameEqualTo(gameName)
        var gameList:MutableList<Game> = gameMapper.selectByExample(example2)
        buy.gameId = gameList[0].gameId
        buyMapper.insertSelective(buy)
        return "success"
    }
}