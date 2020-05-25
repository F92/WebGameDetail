package com.example.androidgame.controller

import com.example.androidgame.service.GameService
import com.example.androidgame.service.MGameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletResponse

@Controller
@CrossOrigin
@RequestMapping("/AndroidGame")
class MGameController {
    @Autowired(required = false)
    lateinit var mGameService:MGameService
    @Autowired(required = false)
    lateinit var gameService: GameService

    @RequestMapping("/GetHomeList")
    fun GetHomeList(response:HttpServletResponse){
        var mg:String = mGameService.GetList()
        response.characterEncoding = "UTF-8"
        response.writer.write(mg)
    }

    @RequestMapping( "/GetGameDetail")
    fun GetDetail(@RequestParam(name = "gameId") gameId: Int, response: HttpServletResponse) {
        val gameList: String = gameService.GetDetail(gameId)
        response.characterEncoding = "UTF-8"
        response.writer.write(gameList)
    }

    @RequestMapping( "/Buy")
    fun Buy(@RequestParam(name = "userName") userName:String, @RequestParam(name = "gameName") gameName:String, response: HttpServletResponse) {
        val gameList: String = mGameService.Buy(userName,gameName)
        response.characterEncoding = "UTF-8"
        response.writer.write(gameList)
    }
}