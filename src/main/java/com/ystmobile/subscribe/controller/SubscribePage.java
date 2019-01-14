package com.ystmobile.subscribe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping("/subscribe/neijianglist")
    public String neijiangList(){
        return "/neijianglist";
    }
	@RequestMapping("/subscribe/{cityname}/list")
    public String listByName(@PathVariable(value = "cityname") String cityname, Model model){
		model.addAttribute("cityname",cityname);
        return "/list";
    }
}
