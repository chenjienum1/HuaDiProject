package com.atschool.hdbasicserver;

import com.atschool.hdbasicserver.bean.*;
import com.atschool.hdbasicserver.mapper.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        for (int i =21; i <41 ; i++) {
            hotspotMapper.addHotspot(""+i,"1-1-1",""+i,""+i);
        }
    }


    /**
     * limit index,pageSize
     * index:当前页的起始索引
     * pageSize：每页显示的条数
     * pageNumber:当前页的页码
     * index=(pageNumber-1)*pageSize
     * 1、在查询开始前开启分页
     * 2、在查询结束后获取分页信息
     */



    @Test
    void testPage(){
        //Page<Object> page = PageHelper.startPage(1, 4);
        //System.out.println(page);
        PageHelper.startPage(2,4);
        List<Hotspot> hotspot = hotspotMapper.getHotspot();
        PageInfo<Hotspot> page=new PageInfo<>(hotspot,5); //第二个参数：设置导航分页的页码数

        System.out.println(page);
        List<Hotspot> list = page.getList();
        list.forEach(hot -> System.out.println(hot));

    }

}
