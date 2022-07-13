package com.atschool.hdbasicserver.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResourceMapper {
    public void addResource(String town, String village, String variety, String position, int area, String charger);
}
