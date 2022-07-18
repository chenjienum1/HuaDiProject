package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Property;
import com.github.pagehelper.PageInfo;

public interface PropertyService {

    public void addProperty(String town,String village,String name,String unit,int amount,int jinZhi,String time,String principal);
    public PageInfo<Property> listPage(int pageNumber,int pageSize);
    public void deleteByID(int id);
    public Property getPropertyByID(int id);
}
