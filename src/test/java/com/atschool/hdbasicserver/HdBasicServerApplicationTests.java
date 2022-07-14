package com.atschool.hdbasicserver;

import com.atschool.hdbasicserver.bean.*;
import com.atschool.hdbasicserver.mapper.*;
import com.github.pagehelper.PageHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HdBasicServerApplicationTests {

    @Autowired
    HotspotMapper hotspotMapper;
    @Test
    void contextLoads() {
        for (int i=13;i<=20;i++){
        hotspotMapper.addHotspot(""+i,"1-1-1",i+"",""+i);}
    }


    /**
     * limit index,pageSize
     * index:当前页的起始索引
     * pageSize：每页显示的条数
     * pageNumber:当前页的页码
     * index=(pageNumber-1)*pageSize
     */



    @Test
    void testPage(){
        PageHelper.startPage(1,4);
        List<Hotspot> hotspot = hotspotMapper.getHotspot();

        hotspot.forEach(hot -> System.out.println(hot));
    }

}
