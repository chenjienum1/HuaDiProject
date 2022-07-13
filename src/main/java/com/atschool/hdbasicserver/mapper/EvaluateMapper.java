package com.atschool.hdbasicserver.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EvaluateMapper {

    public void addEvaluate(String title, String kind, Integer satisfaction, String time, String evaluate);
}
