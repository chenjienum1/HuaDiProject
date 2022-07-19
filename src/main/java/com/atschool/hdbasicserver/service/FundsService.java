package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Funds;
import com.atschool.hdbasicserver.bean.Hotspot;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FundsService {

    public void addFunds(String town,String village,int account,int realAccount,boolean available,String comment,String accountant,String functionary);
    public PageInfo<Funds> listPage(int pageNumber,int pageSize);
    public void deleteByID(int id);
    public Funds getFundsByID(int id);
}
