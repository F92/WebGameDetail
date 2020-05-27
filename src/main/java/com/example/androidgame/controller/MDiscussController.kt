package com.example.androidgame.controller

import com.example.androidgame.entity.Publish
import com.example.androidgame.service.DiscussService
import com.example.androidgame.service.MDiscussService
import org.apache.ibatis.annotations.Param
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
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

    @RequestMapping("/GetNewDiscussList")
    fun GetDiscussList(@RequestParam(name = "gameName")gameName:String,response: HttpServletResponse){
        var s:String = mDiscussService.GetDiscussList(gameName)
        response.characterEncoding = "UTF-8"
        response.writer.write(s)
    }

    @RequestMapping("/GetQAList")
    fun GetQAList(@RequestParam(name = "gameName")gameName:String,response: HttpServletResponse){
        var s:String = mDiscussService.GetQAList(gameName)
        response.characterEncoding = "UTF-8"
        response.writer.write(s)
    }

    @RequestMapping("/GetCommentList")
    fun GetCommentList(@RequestParam(name = "discussId")discussId:Int,response: HttpServletResponse){
        var s:String = mDiscussService.GetCommentList(discussId)
        response.characterEncoding = "UTF-8"
        response.writer.write(s)
    }

    @RequestMapping("/Reply")
    fun Reply(@RequestParam(name="comment")comment:String ,@RequestParam(name="userName")userName:String ,@RequestParam(name="replyName")replyName:String ,@RequestParam(name="discussId")discussId:Int,@RequestParam(name="rcommentId")rcommentId:Int,response: HttpServletResponse){
        mDiscussService.Reply(comment,userName,replyName,discussId,rcommentId)
        var s:String = mDiscussService.GetCommentList(discussId)
        response.characterEncoding = "UTF-8"
        response.writer.write(s)
    }

    @RequestMapping("/Publish")
    fun Publish(@RequestParam(name = "title")title:String, @RequestParam("content")content:String, @RequestParam(name="type")type:String,@RequestParam(name="gameName")gameName:String, @RequestParam(name="userName")userName: String, response: HttpServletResponse){
        var s:String = mDiscussService.Publish(title,content,type,gameName,userName)
        response.writer.write(s)
    }
}