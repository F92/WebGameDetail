package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.mapper.GameMapper;
import com.example.androidgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;

@Controller
@CrossOrigin
@RequestMapping(value = "/GameUser")
public class GameUserController {

    @Autowired(required = false)
    GameService gameService;

    @RequestMapping(value = "/GetList")
    public void GetList(HttpSession session,HttpServletResponse response) throws IOException {
        Userall userall = (Userall)session.getAttribute("LoginInfo");
        String List = gameService.GetUserGameList(userall);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(List);
    }


}
