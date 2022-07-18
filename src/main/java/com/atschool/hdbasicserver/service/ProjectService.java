package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Project;
import com.github.pagehelper.PageInfo;

public interface ProjectService {

    public void addProject(String town,String village,String company,int area,int cost,String beginTime,String completeTime,String manager);
    public PageInfo<Project> listPage(int pageNumber,int pageSize);

    public void deleteByID(int id);

    public Project getProjectByID(int id);
}
