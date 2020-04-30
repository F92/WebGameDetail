package com.example.androidgame.controller

import com.example.androidgame.service.ArticalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import java.io.IOException
import javax.servlet.http.HttpServletResponse

@Controller
@CrossOrigin
@RequestMapping("/AndroidArtical")
class MArticalController {

    @Autowired(required = false)
    lateinit var articalService:ArticalService




}