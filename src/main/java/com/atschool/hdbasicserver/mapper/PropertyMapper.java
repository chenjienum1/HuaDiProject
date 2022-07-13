package com.atschool.hdbasicserver.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PropertyMapper {
    public void addProperty(String town, String village, String name, String unit, int amount, int jinZhi, String time, String principal);
}
