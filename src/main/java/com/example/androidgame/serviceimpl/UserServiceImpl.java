package com.example.androidgame.serviceimpl;

import com.example.androidgame.entity.Userall;
import com.example.androidgame.entity.UserallExample;
import com.example.androidgame.mapper.UserallMapper;
import com.example.androidgame.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserallMapper userallMapper;

    @Override
    public String Login(String username, String password, String usertype, HttpSession session) {
        UserallExample example = new UserallExample();
        UserallExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(username);
        List<Userall> useralls = userallMapper.selectByExample(example);
        if(useralls.get(0).getUserPwd().equals(password)){
            if(useralls.get(0).getUserType().equals(usertype)){
                session.setAttribute("LoginInfo",useralls.get(0));
                return "success";
            }else {
                return "typeerror";
            }
        }else{
            return "false";
        }
    }

    @Override
    public String Register(String username, String password, String usertype) {
        Userall userall = new Userall();
        userall.setUserName(username);
        userall.setUserPwd(password);
        userall.setUserType(usertype);
        userall.setUserImage("http://localhost:443/upload/222.jpg");
        userallMapper.insertSelective(userall);


        return "success";
    }

    @Override
    public String GetList(Userall userall) {
        if(userall.getUserType().equals("admin")){
            List<Userall> userallList = userallMapper.selectAll();
            String userJson = new Gson().toJson(userallList);
            return  userJson;
        }else {
            return "NotAdmin";
        }
    }
}
