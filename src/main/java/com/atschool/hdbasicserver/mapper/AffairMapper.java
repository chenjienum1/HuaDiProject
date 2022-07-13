package com.atschool.hdbasicserver.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AffairMapper {
    public void addAffair(String title, String time, String picture, String content);
}
