package com.example.androidgame.controller;

import com.example.androidgame.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@CrossOrigin
@RequestMapping(value = "/Upload")
public class UploadController {

    @Autowired(required = false)
    UploadService uploadService;

    @RequestMapping(value = "/Image")
    public void Image(@RequestParam("file")MultipartFile multipartFile, HttpServletResponse response) throws IOException {
        String json = uploadService.UploadImage(multipartFile);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }
}
