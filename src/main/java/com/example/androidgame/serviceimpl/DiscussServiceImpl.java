package com.example.androidgame.serviceimpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.androidgame.dto.DiscussDetail;
import com.example.androidgame.dto.DiscussList;
import com.example.androidgame.dto.GameList;
import com.example.androidgame.entity.*;
import com.example.androidgame.mapper.CommentMapper;
import com.example.androidgame.mapper.DiscussMapper;
import com.example.androidgame.mapper.UserallMapper;
import com.example.androidgame.mapper.UserdiscussMapper;
import com.example.androidgame.service.DiscussService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiscussServiceImpl implements DiscussService {

    @Autowired(required = false)
    DiscussMapper discussMapper;
    @Autowired(required = false)
    UserallMapper userallMapper;
    @Autowired(required = false)
    UserdiscussMapper userdiscussMapper;
    @Autowired(required = false)
    CommentMapper commentMapper;


    @Override
    public String GetList(Userall userall) {
        if(userall.getUserType().equals("admin")){
            List<Discuss> discussList = discussMapper.selectAll();
            List<DiscussList> discussLists = new ArrayList<>();
            for(int i=0 ; i<discussList.size() ; i++){
                DiscussList discussList1 = new DiscussList();
                discussList1.setUserName(userallMapper.selectUserByGame(discussList.get(i).getDiscussId()).getUserName());
                discussList1.setDiscussId(discussList.get(i).getDiscussId());
                discussList1.setDiscussDetail(discussList.get(i).getDiscussDetail());
                discussList1.setDiscussTitle(discussList.get(i).getDiscussTitle());
                discussLists.add(discussList1);
            }
            String list = new Gson().toJson(discussLists);
            return list;
        }else {
            return "NotAdmin";
        }
    }

    @Override
    public String GetDetail(int discussId) throws IOException {

        JSONObject jsonObject = new JSONObject();
        Userall userall = userallMapper.selectUserByDiscuss(discussId);
        Discuss discuss = discussMapper.selectByPrimaryKey(discussId);
        DiscussDetail discussDetail = new DiscussDetail();
        discussDetail.setUserId(userall.getUserId());
        discussDetail.setUserName(userall.getUserName());
        discussDetail.setUserImage(userall.getUserImage());
        discussDetail.setDiscussId(discussId);
        discussDetail.setDiscussType(discuss.getDiscussType());
        discussDetail.setDiscussDetail(discuss.getDiscussDetail());

        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andDiscussIdEqualTo(discussId);
        List<Comment> commentList = commentMapper.selectByExample(commentExample);

        jsonObject.put("discuss",discussDetail);
        jsonObject.put("comment",commentList);



        return jsonObject.toJSONString();
    }


    @Override
    public String GetUserDiscussList(Userall userall) {

        List<Discuss> discussList = discussMapper.selectByUserId(userall.getUserId());
        String List = new Gson().toJson(discussList);
        return List;

    }

    @Override
    public String GetDevelopDiscussList(Userall userall) {

        UserdiscussExample userdiscussExample = new UserdiscussExample();
        UserdiscussExample.Criteria criteria1 = userdiscussExample.createCriteria();
        criteria1.andUserIdEqualTo(userall.getUserId());
        List<Userdiscuss> userdiscussList = userdiscussMapper.selectByExample(userdiscussExample);
        List<Discuss> discussList = new ArrayList<>();
        for (int i=0;i<userdiscussList.size();i++){
            Discuss discuss = discussMapper.selectByPrimaryKey(userdiscussList.get(i).getDiscussId());
            discussList.add(discuss);
        }
        String List = new Gson().toJson(discussList);
        return List;

    }
}
