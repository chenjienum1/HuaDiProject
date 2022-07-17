package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Hotspot;
import com.github.pagehelper.PageInfo;

public interface HotspotService {

    public void addHotspot(String title,String time,String picture,String content);
    public PageInfo<Hotspot> listPage(int pageNumber,int pageSize);
    public void deleteByID(int id);
}
