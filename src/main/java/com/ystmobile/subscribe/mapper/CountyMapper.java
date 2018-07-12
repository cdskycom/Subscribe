package com.ystmobile.subscribe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ystmobile.subscribe.model.County;


@Mapper
public interface CountyMapper {
   
    List<County> findByLeaderid(@Param("leader_id")int leader_id);
}
