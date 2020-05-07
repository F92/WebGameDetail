package com.example.androidgame.controller

import com.example.androidgame.service.ArticalService
import com.example.androidgame.service.MArticalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import java.io.IOException
import javax.servlet.http.HttpServletResponse

@Controller
@CrossOrigin
@RequestMapping("/AndroidArtical")
class MArticalController {

    @Autowired(required = false)
    lateinit var mArticalService: MArticalService
    @Autowired(required = false)
    lateinit var articalService: ArticalService

    @RequestMapping("/GetArticalList")
    fun GetArticalList(@RequestParam("gameName")gameName:String,response: HttpServletResponse){
        var s:String = mArticalService.GetList(gameName)
        response.characterEncoding = "UTF-8"
        response.writer.write(s)
    }

    @RequestMapping( "/GetArticalDetail")
    fun GetDetail(@RequestParam(name = "articalId") articalId: Int, response: HttpServletResponse) {
        val gameList: String = articalService.GetDetail(articalId)
        response.characterEncoding = "UTF-8"
        response.writer.write(gameList)
    }


}