package com.ystmobile.subscribe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ystmobile.subscribe.model.Subscribelog;

@Mapper
public interface SubscribeMapper {
	Integer add(Subscribelog subscribelog);
    Integer delete(int id);
    Subscribelog findByPhone(String phone);
    List<Subscribelog> findByDate(@Param("startdate")String startdate, @Param("enddate")String enddate);
    
}
