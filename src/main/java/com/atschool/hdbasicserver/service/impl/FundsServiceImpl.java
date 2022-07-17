package com.atschool.hdbasicserver.service.impl;


import com.atschool.hdbasicserver.bean.Funds;
import com.atschool.hdbasicserver.mapper.FundsMapper;
import com.atschool.hdbasicserver.service.FundsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundsServiceImpl implements FundsService {
    private static final int NAVIGATEPAGES = 5;

    @Autowired
    FundsMapper fundsMapper;

    @Override
    public void addFunds(String town,String village,int account,int realAccount,boolean available,String comment,String accountant,String functionary){
        fundsMapper.addFunds(town,village,account,realAccount,available,comment,accountant,functionary);
    }

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
