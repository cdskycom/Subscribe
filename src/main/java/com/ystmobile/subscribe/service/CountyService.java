package com.ystmobile.subscribe.service;

import com.ystmobile.subscribe.model.ResultData;

public interface CountyService {
	ResultData findByLeaderid(int leader_id);
	ResultData findByCityName(String cityname);
}
