package com.atschool.hdbasicserver;

import com.atschool.hdbasicserver.mapper.LoginMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HdBasicServerApplicationTests {

    @Autowired
        LoginMapper loginmapper;
    @Test
    void contextLoads() {
    }

}
