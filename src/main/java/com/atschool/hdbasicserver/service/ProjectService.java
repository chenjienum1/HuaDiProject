package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Project;
import com.github.pagehelper.PageInfo;

public interface ProjectService {

    public PageInfo<Project> listPage(int pageNumber,int pageSize);

    public void deleteByID(int id);
}
