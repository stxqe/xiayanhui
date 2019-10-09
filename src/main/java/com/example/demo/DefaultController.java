package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 默认主页
 * @author XYH
 * @date 2019/9/04
 */
@Controller
@RequestMapping("/")
public class DefaultController{
    @RequestMapping("/")
    public String index()  {
        return "forward:select.html";
    }
}



