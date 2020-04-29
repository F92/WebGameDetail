package com.example.androidgame.service;

import com.example.androidgame.entity.Userall;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;

public interface DiscussService {
    String GetList(Userall userall);

    String GetDetail(int discussId) throws IOException;

    String GetUserDiscussList(Userall userall);

    String GetDevelopDiscussList(Userall userall);
}
