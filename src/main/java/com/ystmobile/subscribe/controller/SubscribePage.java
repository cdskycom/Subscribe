package com.ystmobile.subscribe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubscribePage {
	@RequestMapping("/subscribe")
    public String index(){
        return "/index";
    }
	@RequestMapping("/subscribe/list")
    public String list(){
        return "/list";
    }

}
