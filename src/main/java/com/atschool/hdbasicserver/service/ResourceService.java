package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Resource;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public interface ResourceService {

    public void addResource(String town,String village,String variety,String position,int area,String charger);
    public PageInfo<Resource> listPage(int pageNumber,int pageSize);
    public void deleteByID(int id);
    public Resource getResourceByID(int id);
}
