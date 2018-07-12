package com.ystmobile.subscribe.service.impl;


import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ystmobile.subscribe.aop.LogAspect;
import com.ystmobile.subscribe.mapper.SubscribeMapper;
import com.ystmobile.subscribe.model.ResultData;
import com.ystmobile.subscribe.model.Subscribelog;
import com.ystmobile.subscribe.service.SubscribeService;

@Service
@EnableTransactionManagement
public class SubscribeService_impl implements SubscribeService {
	
	protected final org.slf4j.Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Autowired
	private SubscribeMapper subscribeMapper;

	@Override
	@Transactional
	public ResultData add(Subscribelog subscribelog) {
		ResultData rd = new ResultData();
		
		if(subscribeMapper.findByPhone(subscribelog.getPhone()) != null){
			rd.setResult(ResultData.SUBSCRIBED);
			rd.setMessage(ResultData.SUBSCRIBEDMESSAGE);
		}else{
			
				int id = subscribeMapper.add(subscribelog);
				if(id > 0){
					rd.setResult(ResultData.SUCCESS);
					rd.setMessage(ResultData.SUCCESSMESSAGE);
				}else{
					rd.setResult(ResultData.OTHER);
					rd.setMessage(ResultData.OTHERDMESSAGE);
				}
			
		}
		return rd;
	}

	@Override
	public ResultData findByPhone(String phone) {
		ResultData rd = new ResultData();
		Subscribelog subscribelog = subscribeMapper.findByPhone(phone);
		if(subscribelog != null){
			rd.setResult(ResultData.SUCCESS);
			rd.setMessage(subscribelog.getPhone());
		}else{
			rd.setResult(ResultData.OTHER);
			rd.setMessage(ResultData.OTHERDMESSAGE);
		}

		return rd;
	}
	@Override
	public ResultData findByDate(String startdate, String enddate) {
		ResultData rd = new ResultData();
		List<Subscribelog> subscribelogs = subscribeMapper.findByDate(startdate, enddate);
		if(subscribelogs != null){
			rd.setResult(ResultData.SUCCESS);
			rd.setData(subscribelogs);
		}else{
			rd.setResult(ResultData.OTHER);
			rd.setMessage(ResultData.OTHERDMESSAGE);
		}

		return rd;
	}

}
