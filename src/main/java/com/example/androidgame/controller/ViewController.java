package com.example.androidgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/View")
public class ViewController {

    @RequestMapping(value = "/Login")
    public String Login(){
        return "login";
    }
}
