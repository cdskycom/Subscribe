package com.ystmobile.subscribe.service;

import com.ystmobile.subscribe.model.ResultData;
import com.ystmobile.subscribe.model.Subscribelog;

public interface SubscribeService {
	ResultData add(Subscribelog subscribelog);
	ResultData findByPhone(String phone);
	ResultData findByDate(String startdate, String enddate);

}
