package com.ystmobile.subscribe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.ystmobile.subscribe.model.ResultData;
import com.ystmobile.subscribe.service.CountyService;

@CrossOrigin
@RestController
public class CountyRestController {
	@Autowired
	private CountyService countyService;
	
	@Autowired
	private Gson json;
	
	@RequestMapping("/subscribe/findcounty")
	public String findCounty(int leader_id){
		ResultData rd = countyService.findByLeaderid(leader_id);
		return json.toJson(rd);
	}
	
}
