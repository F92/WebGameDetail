package com.example.androidgame;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.androidgame.mapper")
public class AndroidgameApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidgameApplication.class, args);
    }

}
