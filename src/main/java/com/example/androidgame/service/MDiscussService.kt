package com.example.androidgame.service

interface MDiscussService {
    fun GetList():String
    fun GetDiscussList(game:String):String
    fun GetQAList(game: String):String
    fun GetCommentList(discussId:Int):String
    fun Reply(commentDetail:String,userName:String,replyName:String,discussId: Int,rcommentId:Int)
    fun Publish(title:String, content:String, type:String, gameName:String, userName:String):String
}