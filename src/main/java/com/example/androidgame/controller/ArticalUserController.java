package com.example.androidgame.controller;

import com.example.androidgame.entity.Artical;
import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.ArticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;

@Controller
@CrossOrigin
@RequestMapping(value = "/ArticalUser")
public class ArticalUserController {
    @Autowired(required = false)
    ArticalService articalService;

    @RequestMapping(value = "/Publish")
    public void Publish(@RequestParam(name = "articalName")String articalName, @RequestParam(name = "articalIntroduce")String articalIntroduce,
                        @RequestParam(name = "gameName")String gameName, @RequestParam(name = "articalDetail")String articalDetail, @RequestParam(name = "articalImage")MultipartFile file, HttpSession session, HttpServletResponse response) throws IOException, ParseException {
        Userall userall = (Userall) session.getAttribute("LoginInfo");
        String end = articalService.PublishArtical(userall,articalName,articalIntroduce,gameName,articalDetail,file);
        if(end.equals("success")){
            response.getWriter().write("suceess");
        }else {
            response.getWriter().write("error");
        }
    }
}
