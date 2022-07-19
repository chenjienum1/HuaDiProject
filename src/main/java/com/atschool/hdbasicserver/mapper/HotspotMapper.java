package com.atschool.hdbasicserver.mapper;

import com.atschool.hdbasicserver.bean.Hotspot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface HotspotMapper {

    public void addHotspot(String title, String time, String laiyuan, String content);

    public List<Hotspot> getHotspot();

    public void deleteByID(int id);

    public Hotspot getHotspotById(int id);

}
