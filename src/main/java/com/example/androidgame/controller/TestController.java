package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

@Controller
@CrossOrigin
@RequestMapping(value = "/Test")
public class TestController {

    @Autowired(required = false)
    UserService userService;
    @Autowired(required = false)
    ArticalService articalService;
    @Value("${file.uploadFolder}")
    private String uploadFolder;
    @Autowired(required = false)
    GameService gameService;
    @Autowired(required = false)
    DiscussService discussService;


    @RequestMapping(value = "/GetArticalList")
    public void AGetList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = new Userall();
        userall.setUserType("admin");
        String list = articalService.GetList(userall);
        if(list.equals("NotAdmin")){
            response.getWriter().write("error");
        }else {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(list);
        }
    }

    @RequestMapping(value = "/Save")
    public void Save(@RequestParam(name = "value")String value,HttpServletResponse response) throws IOException {
        String articalPath = uploadFolder+Math.random()+".txt";
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(articalPath, true);
            fwriter.write(value);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(value);
    }

    @RequestMapping(value = "/Publish")
    public void Publish(@RequestParam(name = "articalName")String articalName, @RequestParam(name = "articalIntroduce")String articalIntroduce,
                        @RequestParam(name = "gameName")String gameName, @RequestParam(name = "articalDetail")String articalDetail, @RequestParam(name = "articalImage") MultipartFile file, HttpSession session, HttpServletResponse response) throws IOException, ParseException {
        Userall userall = new Userall();
        userall.setUserId(1);
        userall.setUserType("admin");
        String end = articalService.PublishArtical(userall,articalName,articalIntroduce,gameName,articalDetail,file);
        if(end.equals("success")){
            response.getWriter().write("suceess");
        }else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping(value = "/GetUserArticalList")
    public void GetUserList(HttpSession session,HttpServletResponse response) throws IOException {
        Userall userall = new Userall();
        userall.setUserId(1);
        userall.setUserType("admin");
        String List = articalService.GetUserArticalList(userall);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(List);
    }

    @RequestMapping(value = "/GetDevelopArticalList")
    public void GetDevelopArticalList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = new Userall();
        userall.setUserId(1);
        userall.setUserType("admin");
        String List = articalService.GetDevelopArticalList(userall);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(List);
    }

    @RequestMapping(value = "/GetDetail")
    public void GetDetail(@RequestParam(name = "articalId")int articalId,HttpServletResponse response) throws IOException {
        String articalList = articalService.GetDetail(articalId);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(articalList);
    }

    @RequestMapping(value = "/GetGameList")
    public void GetGameList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = new Userall();
        userall.setUserId(1);
        userall.setUserType("admin");
        String list = gameService.GetList(userall);
        if(list.equals("NotAdmin")){
            response.getWriter().write("error");
        }else {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(list);
        }
    }

    @RequestMapping(value = "/GamePublish")
    public void GamePublish(@RequestParam(name = "gameName")String gameName, @RequestParam(name = "gameIntroduce")String gameIntroduce,
                        @RequestParam(name = "gamePrice")String gamePrice,@RequestParam(name = "gameDetail")String gameDetail, @RequestParam(name = "gameImage") MultipartFile file, HttpSession session, HttpServletResponse response) throws IOException, ParseException {
        Userall userall = new Userall();
        userall.setUserId(1);
        userall.setUserType("admin");
        String end = gameService.PublishGame(userall,gameName,gameIntroduce,gamePrice,gameDetail,file);
        if(end.equals("success")){
            response.getWriter().write("suceess");
        }else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping(value = "/GetGameUserList")
    public void GetGameUserList(HttpSession session,HttpServletResponse response) throws IOException {
        Userall userall = new Userall();
        userall.setUserId(1);
        userall.setUserType("admin");
        String List = gameService.GetUserGameList(userall);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(List);
    }

    @RequestMapping(value = "/GetDevelopGameList")
    public void GetDevelopGameList(HttpSession session, HttpServletResponse response) throws IOException {
        Userall userall = new Userall();
        userall.setUserId(2);
        userall.setUserType("admin");
        String List = gameService.GetDevelopGameList(userall);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(List);
    }

    @RequestMapping(value = "/GetDiscussDetail")
    public void GetDiscussDetail(@RequestParam(name = "discussId")int discussId, HttpServletResponse response) throws IOException {
        String discussList = discussService.GetDetail(discussId);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(discussList);
    }


}
