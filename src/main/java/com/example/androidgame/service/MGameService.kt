package com.example.androidgame.service

interface MGameService {
    fun GetList():String
    fun Buy(userName:String,gameName:String):String
    fun SearchDiscuss(gameName: String):String;
}