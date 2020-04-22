package com.example.androidgame.service;

import com.example.androidgame.entity.Userall;

import javax.servlet.http.HttpSession;

public interface UserService {

    String Login(String username, String password, String usertype, HttpSession session);

    String Register(String username,String password,String usertype);

    String GetList(Userall userall);
}
