package com.example.androidgame.service;

import com.example.androidgame.entity.Userall;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;

public interface GameService {

    String GetList(Userall userall);

    String GetDetail(int gameId) throws IOException;

    String PublishGame(Userall userall,String gameName, String gameIntroduce,String gamePrice, String gameDetail, MultipartFile file) throws IOException, ParseException;

    String GetUserGameList(Userall userall);

    String GetDevelopGameList(Userall userall);

}
