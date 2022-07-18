package com.atschool.hdbasicserver.mapper;


import com.atschool.hdbasicserver.bean.Evaluate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EvaluateMapper {

    public void addEvaluate(String title, String kind, Integer satisfaction, String time, String evaluate);

    public List<Evaluate> getEvaluate();

    public void deleteByID(int id);

    public Evaluate getEvaluateByID(int id);
}
