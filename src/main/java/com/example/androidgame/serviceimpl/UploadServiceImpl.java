package com.example.androidgame.serviceimpl;

import com.alibaba.fastjson.JSONObject;
import com.example.androidgame.service.UploadService;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UploadServiceImpl implements UploadService {

    @Value("${file.uploadFolder}")
    private String uploadFolder;

    @Override
    public String UploadImage(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        String filePath = uploadFolder;
        File img = new File(filePath+fileName);
        file.transferTo(img);
        String[] httpimg = new String[1];
        httpimg[0] = "http://localhost:443/uploadImage/"+fileName;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errno",0);
        jsonObject.put("data",httpimg);

        return jsonObject.toJSONString();
    }
}
