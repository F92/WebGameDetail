package com.example.androidgame.service;

import com.example.androidgame.entity.Userall;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;

public interface ArticalService {

    String GetList(Userall userall);

    String GetDetail(int articalid) throws IOException;

    String PublishArtical(Userall userall,String articalName, String articalIntroduce, String gameName, String articalDetail, MultipartFile file) throws IOException, ParseException;

    String GetUserArticalList(Userall userall);

    String GetDevelopArticalList(Userall userall);
}
