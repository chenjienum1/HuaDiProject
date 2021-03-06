package com.atschool.hdbasicserver.mapper;

import com.atschool.hdbasicserver.bean.Affair;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AffairMapper {
    public void addAffair(String title, String time, String laiyuan, String content);

    public List<Affair> getAffair();

    public void deleteByID(int id);

    public Affair getAffairByID(int id);
}
