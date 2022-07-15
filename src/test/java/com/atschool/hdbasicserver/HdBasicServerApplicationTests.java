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
    AffairMapper affairMapper;
    @Test
    void contextLoads() {
        affairMapper.addAffair("鸡你太美","2020-1-1","123","篮球和鸡");
    }


}
