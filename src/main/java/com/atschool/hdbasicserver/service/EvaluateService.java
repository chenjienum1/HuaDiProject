package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Evaluate;
import com.github.pagehelper.PageInfo;

public interface EvaluateService {

    public PageInfo<Evaluate> listPage(int pageNumber, int pageSize);
    public void deleteByID(int id);
}
