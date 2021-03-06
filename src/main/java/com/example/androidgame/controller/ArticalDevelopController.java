package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.ArticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@CrossOrigin
@RequestMapping(value = "/ArticalDevelop")
public class ArticalDevelopController {

    @Autowired(required = false)
    ArticalService articalService;

    @RequestMapping(value = "/GetList")
    public void GetList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = (Userall) session.getAttribute("LoginInfo");
        String List = articalService.GetDevelopArticalList(userall);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(List);
    }
}
