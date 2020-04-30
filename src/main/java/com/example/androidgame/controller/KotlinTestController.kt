package com.example.androidgame.controller

import com.example.androidgame.service.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletResponse

@Controller
@CrossOrigin
@RequestMapping("/KotlinTest")
class KotlinTestController {

    @Autowired(required = false)
    lateinit var userService: UserService
    @Autowired(required = false)
    lateinit var articalService: ArticalService
    @Value("\${file.uploadFolder}")
    lateinit var uploadFolder: String
    @Autowired(required = false)
    lateinit var gameService: GameService
    @Autowired(required = false)
    lateinit var discussService: DiscussService
    @Autowired(required = false)
    lateinit var mGameService: MGameService
    @Autowired(required = false)
    lateinit var mDiscussService: MDiscussService

    @RequestMapping("/GetHomeList")
    fun GetHomeList(response: HttpServletResponse){
        var mg:String = mGameService.GetList()
        response.characterEncoding = "UTF-8"
        response.writer.write(mg)
    }
    @RequestMapping("/GetDiscussList")
    fun GetList(response:HttpServletResponse){
        var s:String = mDiscussService.GetList()
        response.characterEncoding = "UTF-8"
        response.writer.write(s)
    }
    @RequestMapping( "/GetGameDetail")
    fun GetDetail(@RequestParam(name = "gameId") gameId: Int, response: HttpServletResponse) {
        val gameList: String = gameService.GetDetail(gameId)
        response.characterEncoding = "UTF-8"
        response.writer.write(gameList)
    }

}