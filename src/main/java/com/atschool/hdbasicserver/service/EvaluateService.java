package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Evaluate;
import com.github.pagehelper.PageInfo;

public interface EvaluateService {

    public void addEvaluate(String title,String kind,int satisfaction,String time,String evaluate);

    public PageInfo<Evaluate> listPage(int pageNumber, int pageSize);
    public void deleteByID(int id);

    public Evaluate getEvaluateByID(int id);
}
