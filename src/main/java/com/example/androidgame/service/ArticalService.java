package com.example.androidgame.service;

import com.example.androidgame.entity.Userall;

import java.io.IOException;

public interface ArticalService {

    String GetList(Userall userall);

    String GetDetail(int articalid) throws IOException;

}
