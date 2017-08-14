package com.speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liupengtao on 2017/8/13.
 */

@Controller
public class JDController {

    @RequestMapping("jd")
    public String showJD(){

        return "index";
    }
}
