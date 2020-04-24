package com.example.androidgame.serviceimpl;

import com.alibaba.fastjson.JSONObject;
import com.example.androidgame.dto.ArticalList;
import com.example.androidgame.dto.GameList;
import com.example.androidgame.entity.*;
import com.example.androidgame.mapper.GameMapper;
import com.example.androidgame.mapper.PublishMapper;
import com.example.androidgame.mapper.UserallMapper;
import com.example.androidgame.service.GameService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired(required = false)
    GameMapper gameMapper;
    @Autowired(required = false)
    UserallMapper userallMapper;
    @Autowired(required = false)
    PublishMapper publishMapper;
    @Value("${file.uploadFolder}")
    private String uploadFolder;

    @Override
    public String GetList(Userall userall) {
        if(userall.getUserType().equals("admin")){
            List<Game> gameList = gameMapper.selectAll();
            List<GameList> gameLists = new ArrayList<>();
            for(int i=0 ; i<gameList.size() ; i++){
                GameList gameList1 = new GameList();
                gameList1.setUserName(userallMapper.selectUserByGame(gameList.get(i).getGameId()).getUserName());
                gameList1.setGameId(gameList.get(i).getGameId());
                gameList1.setGameIntroduce(gameList.get(i).getGameIntroduce());
                gameList1.setGameName(gameList.get(i).getGameName());
                gameLists.add(gameList1);
            }
            String list = new Gson().toJson(gameLists);
            return list;
        }else {
            return "NotAdmin";
        }
    }

    @Override
    public String GetDetail(int articalId) throws IOException {
        Game game = gameMapper.selectByPrimaryKey(articalId);
        String path = game.getGameDetail();
        FileInputStream fin = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader buffReader = new BufferedReader(reader);
        String str = "";
        str = buffReader.readLine();
        buffReader.close();
        return str;
    }

    @Override
    public String PublishGame(Userall userall, String gameName, String gameIntroduce, String gamePrice, String gameDetail, MultipartFile file) throws IOException, ParseException {

        String fileName = file.getOriginalFilename();
        String filePath = uploadFolder;
        File img = new File(filePath+fileName);
        file.transferTo(img);
        Game game = new Game();
        Publish publish = new Publish();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date gameDate = df.parse(df.format(new Date()));

        String gamePath = uploadFolder+Math.random()+".txt";
        FileWriter fwriter = null;
        try {
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
            fwriter = new FileWriter(gamePath, true);
            fwriter.write(gameDetail);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        game.setGameDetail(gamePath);
        game.setGameDate(gameDate);
        game.setGameImage(filePath+fileName);
        game.setGamePrice(gamePrice);
        game.setGameIntroduce(gameIntroduce);
        game.setGameName(gameName);
        gameMapper.insertSelective(game);

        GameExample gameExample = new GameExample();
        GameExample.Criteria criteria = gameExample.createCriteria();
        criteria.andGameNameEqualTo(gameName);
        List<Game> gameList = gameMapper.selectByExample(gameExample);
        int gameId = gameList.get(0).getGameId();

        int userId = userall.getUserId();

        publish.setGameId(gameId);
        publish.setUserId(userId);
        publish.setPublishDate(gameDate);
        publishMapper.insertSelective(publish);

        return "success";
    }

    @Override
    public String GetUserGameList(Userall userall) {

        List<Game> gameList = gameMapper.selectByUserId(userall.getUserId());
        String List = new Gson().toJson(gameList);
        return List;
    }

    @Override
    public String GetDevelopGameList(Userall userall) {
        PublishExample publishExample = new PublishExample();
        PublishExample.Criteria criteria1 = publishExample.createCriteria();
        criteria1.andUserIdEqualTo(userall.getUserId());
        List<Publish> publishList = publishMapper.selectByExample(publishExample);
        List<Game> gameList = new ArrayList<>();
        for (int i=0;i<publishList.size();i++){
            Game game = gameMapper.selectByPrimaryKey(publishList.get(i).getGameId());
            gameList.add(game);
        }
        String List = new Gson().toJson(gameList);
        return List;
    }


}
