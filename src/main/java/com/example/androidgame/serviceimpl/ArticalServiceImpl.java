package com.example.androidgame.serviceimpl;


import com.example.androidgame.entity.Artical;
import com.example.androidgame.entity.ArticalExample;
import com.example.androidgame.entity.Userall;
import com.example.androidgame.mapper.ArticalMapper;
import com.example.androidgame.service.ArticalService;
import com.google.gson.Gson;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;
@Service
public class ArticalServiceImpl implements ArticalService {

    @Autowired(required = false)
    ArticalMapper articalMapper;

    @Override
    public String GetList(Userall userall) {
        if(userall.getUserType().equals("admin")){
            List<Artical> articalList = articalMapper.selectAll();
            String list = new Gson().toJson(articalList);
            return list;
        }else {
            return "NotAdmin";
        }
    }

    @Override
    public String GetDetail(int articalId) throws IOException {
        Artical artical = articalMapper.selectByPrimaryKey(articalId);
        String path = artical.getArticalDetail();
        ClassPathResource classPathResource = new ClassPathResource(path);
        InputStream inputStream =classPathResource.getInputStream();

        byte[] bytes = new byte[0];
        bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String str = new String(bytes);
        return str;
    }
}
