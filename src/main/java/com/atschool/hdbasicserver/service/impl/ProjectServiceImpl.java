package com.atschool.hdbasicserver.service.impl;

import com.atschool.hdbasicserver.bean.Project;
import com.atschool.hdbasicserver.mapper.ProjectMapper;
import com.atschool.hdbasicserver.service.ProjectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private static final int NAVIGATEPAGES =5;

    @Autowired
    ProjectMapper projectMapper;

    @Override
    public void addProject(String town,String village,String company,int area,int cost,String beginTime,String completeTime,String manager){
        projectMapper.addProject(town,village,company,area,cost,beginTime,completeTime,manager);
    }
    @Override
    public PageInfo<Project> listPage(int pageNumber,int pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<Project> project = projectMapper.getProject();
        PageInfo<Project> page = new PageInfo<>(project,NAVIGATEPAGES);
        return page;
    }


    @Override
    public void deleteByID(int id){projectMapper.deleteProject(id);}

    @Override
    public Project getProjectByID(int id){
        Project project = projectMapper.getProjectByID(id);
        return project;
    }
}
