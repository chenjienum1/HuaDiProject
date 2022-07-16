package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Funds;
import com.github.pagehelper.PageInfo;

public interface FundsService {
    public PageInfo<Funds> listPage(int pageNumber,int pageSize);
    public void deleteByID(int id);
}
