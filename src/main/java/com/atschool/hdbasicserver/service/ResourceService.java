package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Resource;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public interface ResourceService {
    public PageInfo<Resource> listPage(int pageNumber,int pageSize);
    public void deleteByID(int id);
}
