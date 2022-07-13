package com.atschool.hdbasicserver.mapper;

import com.atschool.hdbasicserver.bean.Hotspot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface HotspotMapper {

    public void addHotspot(String title, String time, String picture, String content);

    public List<Hotspot> getHotspot();
}