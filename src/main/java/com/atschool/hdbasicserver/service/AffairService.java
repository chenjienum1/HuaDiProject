package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.Affair;
import com.github.pagehelper.PageInfo;

public interface AffairService {

    public void addAffair(String title,String time,String laiyuan,String content);

    public PageInfo<Affair> listPage(int pageNumber, int pageSize);

    public void deleteByID(int id);

    public Affair getAffairByID(int id);


}
