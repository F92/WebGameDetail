package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@CrossOrigin
@RequestMapping(value = "/DiscussDevelop")
public class DiscussDevelopController {

    @Autowired(required = false)
    DiscussService discussService;

    @RequestMapping(value = "/GetList")
    public void GetList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = (Userall) session.getAttribute("LoginInfo");
        String List = discussService.GetDevelopDiscussList(userall);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(List);
    }
}
