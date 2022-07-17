package com.atschool.hdbasicserver.service.impl;

import com.atschool.hdbasicserver.bean.Funds;
import com.atschool.hdbasicserver.bean.Resource;
import com.atschool.hdbasicserver.mapper.ResourceMapper;
import com.atschool.hdbasicserver.service.ResourceService;
import com.baomidou.mybatisplus.extension.api.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    private static final int NAVIGATEPAGES = 5;

    @Autowired
    ResourceMapper resourceMapper;

    @Override
    public void addResource(String town,String village,String variety,String position,int area,String charger){
        resourceMapper.addResource(town,village,variety,position,area,charger);
    }

    @Override
    public PageInfo<Resource> listPage(int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Resource> resources = resourceMapper.getResource();
        PageInfo<Resource> page = new PageInfo<>(resources,NAVIGATEPAGES);
        return page;
    }

    @Override
    public void deleteByID(int id) {
        resourceMapper.deleteResource(id);
    }
}
