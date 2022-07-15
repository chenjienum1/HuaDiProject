package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Hotspot;
import com.github.pagehelper.PageInfo;

public interface HotspotService {
    public PageInfo<Hotspot> listPage(int pageNumber,int pageSize);
    public void deleteByTitle(String title);
}
