package com.example.androidgame.controller

import com.example.androidgame.service.DiscussService
import com.example.androidgame.service.MDiscussService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletResponse

@Controller
@CrossOrigin
@RequestMapping("/AndroidDiscuss")
class MDiscussController {

    @Autowired(required = false)
    lateinit var mDiscussService: MDiscussService

    @RequestMapping("/GetDiscussList")
    fun GetList(response:HttpServletResponse){
        var s:String = mDiscussService.GetList()
        response.characterEncoding = "UTF-8"
        response.writer.write(s)
    }
}