package com.atschool.hdbasicserver;

import com.atschool.hdbasicserver.bean.Affair;
import com.atschool.hdbasicserver.bean.Evaluate;
import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.bean.User;
import com.atschool.hdbasicserver.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HdBasicServerApplicationTests {

    @Autowired
    EvaluateMapper evaluateMapper;
    @Test
    void contextLoads() {
        List<Evaluate> evaluateList = evaluateMapper.getEvaluate();
        for (Evaluate e: evaluateList
             ) {
            System.out.println(e.toString());
        }

    }

}
