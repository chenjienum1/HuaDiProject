package com.atschool.hdbasicserver.service.impl;


import com.atschool.hdbasicserver.bean.Funds;
import com.atschool.hdbasicserver.mapper.FundsMapper;
import com.atschool.hdbasicserver.service.FundsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundsServiceImpl implements FundsService {
    private static final int NAVIGATEPAGES = 5;

    @Autowired
    FundsMapper fundsMapper;

    @Override
    public PageInfo<Funds> listPage(int pageNumber,int pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<Funds> funds = fundsMapper.getFunds();
        PageInfo<Funds> page = new PageInfo<>(funds,NAVIGATEPAGES);
        return page;
    }

    @Override
    public void deleteByID(int id){
        fundsMapper.deleteFunds(id);
    }

}
