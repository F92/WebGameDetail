package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@CrossOrigin
@RequestMapping(value = "/Test")
public class TestController {

    @Autowired(required = false)
    UserService userService;

    @RequestMapping(value = "/GetList")
    public void GetList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = new Userall();
        userall.setUserType("admin");
        String userList = userService.GetList(userall);
        if(userList.equals("NotAdmin")){
            response.getWriter().write("error");
        }else {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(userList);
        }
    }
}
