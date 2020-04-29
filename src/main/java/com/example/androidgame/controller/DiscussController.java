package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.DiscussService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@CrossOrigin
@RequestMapping(value = "/Discuss")
public class DiscussController {

    @Autowired(required = false)
    DiscussService discussService;

    @RequestMapping(value = "/GetList")
    public void GetList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = (Userall)session.getAttribute("LoginInfo");
        String list = discussService.GetList(userall);
        if(list.equals("NotAdmin")){
            response.getWriter().write("error");
        }else {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(list);
        }
    }

    @RequestMapping(value = "/GetDetail")
    public void GetDetail(@RequestParam(name = "discussId")int discussId, HttpServletResponse response) throws IOException {
        String discussList = discussService.GetDetail(discussId);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(discussList);
    }
}
