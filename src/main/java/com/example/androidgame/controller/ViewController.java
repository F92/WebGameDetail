package com.example.androidgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@CrossOrigin
@RequestMapping(value = "/View")
public class ViewController {

    @RequestMapping(value = "/Login")
    public String Login(){
        return "login";
    }
    @RequestMapping(value = "/User")
    public String User(){
        return "ui-user";
    }
    @RequestMapping(value = "/Artical")
    public String Artical(){
        return "ui-artical";
    }
    @RequestMapping(value = "/ArticalUser")
    public String ArticalUser(){
        return "ui-artical-user";
    }
    @RequestMapping(value = "/ArticalDevelop")
    public String ArticalDevelop(){
        return "ui-artical-develop";
    }


}
