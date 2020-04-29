package com.example.androidgame.controller

import com.example.androidgame.service.MGameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletResponse

@Controller
@CrossOrigin
@RequestMapping("/AndroidGame")
class MGameController {
    @Autowired(required = false)
    lateinit var mGameService:MGameService

    @RequestMapping("/GetHomeList")
    fun GetHomeList(response:HttpServletResponse){
        var mg:String = mGameService.GetList()
        response.characterEncoding = "UTF-8"
        response.writer.write(mg)
    }
}