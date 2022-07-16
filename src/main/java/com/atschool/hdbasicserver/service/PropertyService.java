package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Property;
import com.github.pagehelper.PageInfo;

public interface PropertyService {
    public PageInfo<Property> listPage(int pageNumber,int pageSize);
    public void deleteByID(int id);
}
