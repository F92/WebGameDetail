package com.example.androidgame.controller;

import com.example.androidgame.entity.Game;
import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.ArticalService;
import com.example.androidgame.service.GameService;
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
@RequestMapping(value = "/Game")
public class GameController {

    @Autowired(required = false)
    GameService gameService;

    @RequestMapping(value = "/GetList")
    public void GetList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = (Userall)session.getAttribute("LoginInfo");
        String list = gameService.GetList(userall);
        if(list.equals("NotAdmin")){
            response.getWriter().write("error");
        }else {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(list);
        }
    }

    @RequestMapping(value = "/GetDetail")
    public void GetDetail(@RequestParam(name = "gameId")int gameId, HttpServletResponse response) throws IOException {
        String gameList = gameService.GetDetail(gameId);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(gameList);
    }
}
