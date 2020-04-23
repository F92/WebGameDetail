package com.example.androidgame.serviceimpl;


import com.example.androidgame.dto.ArticalList;
import com.example.androidgame.entity.*;
import com.example.androidgame.mapper.ArticalMapper;
import com.example.androidgame.mapper.GameMapper;
import com.example.androidgame.mapper.UserallMapper;
import com.example.androidgame.mapper.UserarticalMapper;
import com.example.androidgame.service.ArticalService;
import com.google.gson.Gson;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ArticalServiceImpl implements ArticalService {

    @Autowired(required = false)
    ArticalMapper articalMapper;
    @Autowired(required = false)
    UserallMapper userallMapper;
    @Autowired(required = false)
    UserarticalMapper userarticalMapper;
    @Autowired(required = false)
    GameMapper gameMapper;
    @Value("${file.uploadFolder}")
    private String uploadFolder;

    @Override
    public String GetList(Userall userall) {
        if(userall.getUserType().equals("admin")){
            List<Artical> articalList = articalMapper.selectAll();
            List<ArticalList> articalLists = new ArrayList<>();
            for(int i=0 ; i<articalList.size() ; i++){
                ArticalList articalList1 = new ArticalList();
                articalList1.setUserName(userallMapper.selectUserByArtical(articalList.get(i).getArticalId()).getUserName());
                articalList1.setArticalId(articalList.get(i).getArticalId());
                articalList1.setArticalIntroduce(articalList.get(i).getArticalIntroduce());
                articalList1.setArticalName(articalList.get(i).getArticalName());
                articalLists.add(articalList1);
            }
            String list = new Gson().toJson(articalLists);
            return list;
        }else {
            return "NotAdmin";
        }
    }

    @Override
    public String GetDetail(int articalId) throws IOException {
        Artical artical = articalMapper.selectByPrimaryKey(articalId);
        String path = artical.getArticalDetail();
        FileInputStream fin = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader buffReader = new BufferedReader(reader);
        String str = "";
        str = buffReader.readLine();
        buffReader.close();
        return str;
    }

    @Override
    public String PublishArtical(Userall userall,String articalName, String articalIntroduce, String gameName, String articalDetail, MultipartFile file) throws IOException, ParseException {
        String fileName = file.getOriginalFilename();
        String filePath = uploadFolder;
        File img = new File(filePath+fileName);
        file.transferTo(img);
        Artical artical = new Artical();
        Userartical userartical = new Userartical();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date articalDate = df.parse(df.format(new Date()));

        String articalPath = uploadFolder+Math.random()+".txt";
        FileWriter fwriter = null;
        try {
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
            fwriter = new FileWriter(articalPath, true);
            fwriter.write(articalDetail);
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
        artical.setArticalDetail(articalPath);
        artical.setArticalDate(articalDate);
        artical.setArticalImage(filePath+fileName);
        artical.setArticalIntroduce(articalIntroduce);
        artical.setArticalName(articalName);
        articalMapper.insertSelective(artical);

        GameExample gameExample = new GameExample();
        GameExample.Criteria criteria1 = gameExample.createCriteria();
        criteria1.andGameNameEqualTo(gameName);
        List<Game> gameList = gameMapper.selectByExample(gameExample);
        int gameId = gameList.get(0).getGameId();

        ArticalExample articalExample = new ArticalExample();
        ArticalExample.Criteria criteria = articalExample.createCriteria();
        criteria.andArticalNameEqualTo(articalName);
        List<Artical> articalList = articalMapper.selectByExample(articalExample);
        int articalId = articalList.get(0).getArticalId();

        int userId = userall.getUserId();

        userartical.setArticalId(articalId);
        userartical.setUserId(userId);
        userartical.setGameId(gameId);
        userartical.setUserarticalDate(articalDate);
        userarticalMapper.insertSelective(userartical);

        return "success";
    }
}
