package com.example.androidgame.controller;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.service.ArticalService;
import com.example.androidgame.service.UserService;
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
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
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
}