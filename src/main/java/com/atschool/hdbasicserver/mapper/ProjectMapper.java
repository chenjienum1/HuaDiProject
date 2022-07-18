package com.atschool.hdbasicserver.mapper;

import com.atschool.hdbasicserver.bean.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {
    public void addProject(String town, String village, String company, int area, int cost, String startTime, String completeTime, String manager);
    public void deleteProject(int id);
    public List<Project> getProject();

    public Project getProjectByID(int id);
}
