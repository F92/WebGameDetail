package com.example.androidgame.serviceimpl

import com.example.androidgame.entity.Artical
import com.example.androidgame.entity.ArticalExample
import com.example.androidgame.entity.Userartical
import com.example.androidgame.entity.UserarticalExample
import com.example.androidgame.mapper.ArticalMapper
import com.example.androidgame.mapper.UserarticalMapper
import com.example.androidgame.service.MArticalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MArticalServiceImpl : MArticalService {

    @Autowired(required = false)
    lateinit var articalMapper:ArticalMapper
    @Autowired(required = false)
    lateinit var userArticalMapper: UserarticalMapper

    override fun GetDetail(gameId: Int): String {
        return ""
    }
}