package com.ystmobile.subscribe.service;

import com.ystmobile.subscribe.model.ResultData;
import com.ystmobile.subscribe.model.Subscribelog;

public interface SubscribeService {
	ResultData add(Subscribelog subscribelog);
	ResultData findByPhone(String phone);
	ResultData findByDate(int leader_id, String startdate, String enddate);
	ResultData findByCityAndDate(String city, String startdate, String enddate);

}
