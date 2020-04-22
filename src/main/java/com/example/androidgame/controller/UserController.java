package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.UserService;
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
@RequestMapping(value = "/User")
public class UserController {

    @Autowired(required = false)
    UserService userService;

    @RequestMapping(value = "/Login")
    public String Login(@RequestParam(name = "username")String username, @RequestParam(name = "password")String password,
                        @RequestParam(name = "usertype")String usertype, HttpSession session){
        String s = userService.Login(username,password,usertype,session);
        if(s.equals("success")){
            if(usertype.equals("admin")){
                return "redirect:/View/Artical";
            }else {
                return "redirect:/View/ArticalUser";
            }
        }else {
            return "redirect:/View/Login";
        }
    }

    @RequestMapping(value = "/Register")
    public String Register(@RequestParam(name = "username")String username,@RequestParam(name = "password")String password,@RequestParam(name = "usertype")String usertype){
        userService.Register(username,password,usertype);

        return "redirect:/View/Login";
    }

    @RequestMapping(value = "/GetList")
    public void GetList(HttpSession session,HttpServletResponse response) throws IOException {
        Userall userall = (Userall) session.getAttribute("LoginInfo");
        String userList = userService.GetList(userall);
        if(userList.equals("NotAdmin")){
            response.getWriter().write("error");
        }else {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(userList);
        }
    }


}
