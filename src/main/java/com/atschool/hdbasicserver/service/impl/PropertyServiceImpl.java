package com.atschool.hdbasicserver.service.impl;

import com.atschool.hdbasicserver.bean.Funds;
import com.atschool.hdbasicserver.bean.Property;
import com.atschool.hdbasicserver.mapper.PropertyMapper;
import com.atschool.hdbasicserver.service.PropertyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    private static final int NAVIGATEPAGES = 5;

    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public PageInfo<Property> listPage(int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Property> properties = propertyMapper.getProperty();
        PageInfo<Property> page = new PageInfo<>(properties,NAVIGATEPAGES);
        return page;
    }

    @Override
    public void deleteByID(int id) {
        propertyMapper.deleteProperty(id);
    }
}
