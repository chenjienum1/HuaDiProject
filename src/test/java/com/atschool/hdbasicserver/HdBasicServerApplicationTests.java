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
    AffairMapper affairMapper;
    @Test
    void contextLoads() {
        affairMapper.deleteByID(1);
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


}
