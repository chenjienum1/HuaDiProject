package com.atschool.hdbasicserver.service.impl;


import com.atschool.hdbasicserver.bean.Evaluate;
import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.mapper.EvaluateMapper;
import com.atschool.hdbasicserver.service.EvaluateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluateServiceImpl implements EvaluateService {

    private static final int NAVIGATEPAGES =5;

    @Autowired
    EvaluateMapper evaluateMapper;

    public void addEvaluate(String title,String kind,int satisfaction,String time,String evaluate){
        evaluateMapper.addEvaluate(title,kind,satisfaction,time,evaluate);
    }

    @Override
    public PageInfo<Evaluate> listPage(int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Evaluate> evaluate = evaluateMapper.getEvaluate();
        PageInfo<Evaluate> page=new PageInfo<>(evaluate,NAVIGATEPAGES);
        return page;
    }

    @Override
    public void deleteByID(int id) {
        evaluateMapper.deleteByID(id);
    }





}
