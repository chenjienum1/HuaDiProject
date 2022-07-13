package com.atschool.hdbasicserver;

import com.atschool.hdbasicserver.bean.User;
import com.atschool.hdbasicserver.mapper.FundsMapper;
import com.atschool.hdbasicserver.mapper.LoginMapper;
import com.atschool.hdbasicserver.mapper.PropertyMapper;
import com.atschool.hdbasicserver.mapper.ResourceMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HdBasicServerApplicationTests {

    @Autowired
    ResourceMapper resourceMapper;
    @Test
    void contextLoads() {
        resourceMapper.addResource("a","b","c","d",1,"f");
    }

}
