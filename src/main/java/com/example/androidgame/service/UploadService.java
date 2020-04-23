package com.example.androidgame.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {

    String UploadImage(MultipartFile file) throws IOException;
}
