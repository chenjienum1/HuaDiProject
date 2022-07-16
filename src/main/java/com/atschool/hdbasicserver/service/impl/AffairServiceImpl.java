package com.atschool.hdbasicserver.service.impl;

import com.atschool.hdbasicserver.bean.Affair;
import com.atschool.hdbasicserver.mapper.AffairMapper;
import com.atschool.hdbasicserver.service.AffairService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AffairServiceImpl implements AffairService {

    private static final int NAVIGATEPAGES =5;

    @Autowired
    AffairMapper affairMapper;

    @Override
    public PageInfo<Affair> listPage(int pageNumber, int pageSize){
        PageHelper.startPage(pageNumber, pageSize);
        List<Affair> affair = affairMapper.getAffair();
        PageInfo<Affair> page=new PageInfo<>(affair,NAVIGATEPAGES);
        return page;
    }


    @Override
    public void deleteByID(int id){
        affairMapper.deleteByID(id);
    }



}
