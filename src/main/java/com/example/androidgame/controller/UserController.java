package com.example.androidgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/User")
public class UserController {
    @RequestMapping(value = "/Login")
    public void Login(@RequestParam(name = "username")String username,@RequestParam(name = "password")String password,@RequestParam(name = "usertype")String usertype){

    }
}
