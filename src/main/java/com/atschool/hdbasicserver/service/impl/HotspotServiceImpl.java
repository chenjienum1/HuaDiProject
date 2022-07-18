package com.atschool.hdbasicserver.service.impl;

import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.mapper.HotspotMapper;
import com.atschool.hdbasicserver.service.HotspotService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotspotServiceImpl implements HotspotService {

    private static final int NAVIGATEPAGES =5;

    @Autowired
    HotspotMapper hotspotMapper;

    @Override
    public void addHotspot(String title,String time,String picture,String content){
        hotspotMapper.addHotspot(title,time,picture,content);
    }

    @Override
    public PageInfo<Hotspot> listPage(int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Hotspot> hotspot = hotspotMapper.getHotspot();
        PageInfo<Hotspot> page=new PageInfo<>(hotspot,NAVIGATEPAGES);
        return page;
    }

    @Override
    public void deleteByID(int id) {
        hotspotMapper.deleteByID(id);
    }

    @Override
    public Hotspot getHotspotById(int id) {
        Hotspot hotspotById = hotspotMapper.getHotspotById(id);
        return hotspotById;
    }
}
