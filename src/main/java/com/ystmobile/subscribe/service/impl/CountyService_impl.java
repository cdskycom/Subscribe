package com.ystmobile.subscribe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ystmobile.subscribe.mapper.CountyMapper;
import com.ystmobile.subscribe.model.County;
import com.ystmobile.subscribe.model.ResultData;
import com.ystmobile.subscribe.service.CountyService;

@Service
public class CountyService_impl implements CountyService{
	@Autowired
	private CountyMapper countyMapper;
	
	@Override
	public ResultData findByLeaderid(int leader_id) {
		ResultData rd = new ResultData();
		List<County> counties = countyMapper.findByLeaderid(leader_id);
		if (counties != null){
			rd.setResult(ResultData.SUCCESS);
			rd.setData(counties);
		}else{
			rd.setResult(ResultData.OTHER);
			rd.setMessage(ResultData.OTHERDMESSAGE);
		}
		return rd;
	}

}
