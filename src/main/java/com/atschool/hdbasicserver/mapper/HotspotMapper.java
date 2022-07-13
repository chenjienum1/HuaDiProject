package com.atschool.hdbasicserver.mapper;

import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface HotspotMapper {

    public void addHotspot(String title, String time, String picture, String content);
}
