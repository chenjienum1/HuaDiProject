package com.atschool.hdbasicserver.mapper;

import com.atschool.hdbasicserver.bean.Property;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PropertyMapper {
    public void addProperty(String town, String village, String name, String unit, int amount, int jinZhi, String time, String principal);
    public List<Property> getProperty();
}