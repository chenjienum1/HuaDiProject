package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Affair;
import com.github.pagehelper.PageInfo;

public interface AffairService {

    public PageInfo<Affair> listPage(int pageNumber, int pageSize);

    public void deleteByID(int id);
}
