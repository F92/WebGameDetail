package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
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
@RequestMapping(value = "/GameDevelop")
public class GameDevelopController {

    @Autowired(required = false)
    GameService gameService;

    @RequestMapping(value = "/Publish")
    public void Publish(@RequestParam(name = "gameName")String gameName, @RequestParam(name = "gameIntroduce")String gameIntroduce,
                        @RequestParam(name = "gamePrice")String gamePrice,@RequestParam(name = "gameDetail")String gameDetail, @RequestParam(name = "gameImage") MultipartFile file, HttpSession session, HttpServletResponse response) throws IOException, ParseException {
        Userall userall = (Userall) session.getAttribute("LoginInfo");
        String end = gameService.PublishGame(userall,gameName,gameIntroduce,gamePrice,gameDetail,file);
        if(end.equals("success")){
            response.getWriter().write("suceess");
        }else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping(value = "/GetList")
    public void GetList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = (Userall) session.getAttribute("LoginInfo");
        String List = gameService.GetDevelopGameList(userall);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(List);
    }
}
