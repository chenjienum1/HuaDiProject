package com.atschool.hdbasicserver.mapper;

import com.atschool.hdbasicserver.bean.Resource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResourceMapper {
    public void addResource(String town, String village, String variety, String position, int area, String charger);
    public void deleteResource(int id);
    public List<Resource> getResource();
}
