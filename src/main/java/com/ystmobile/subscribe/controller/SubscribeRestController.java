package com.ystmobile.subscribe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.ystmobile.subscribe.model.ResultData;
import com.ystmobile.subscribe.model.Subscribelog;
import com.ystmobile.subscribe.service.SubscribeService;

@CrossOrigin
@RestController
public class SubscribeRestController {
	@Autowired
	private SubscribeService subscribeService;
	
	@Autowired
	private Gson json;
	
	
	@RequestMapping("/subscribe/add")
	public String add(Subscribelog subscribelog){
		ResultData rd = subscribeService.add(subscribelog);
		return json.toJson(rd);
	}
	
	@RequestMapping("/subscribe/find")
	public String find(String phone){
		ResultData rd = subscribeService.findByPhone(phone);
		return json.toJson(rd);
	}
	
	@RequestMapping("/subscribe/findall")
	public String findAll(String startdate,String enddate){
		ResultData rd = subscribeService.findByDate(startdate, enddate);
		return json.toJson(rd);
	}
}
