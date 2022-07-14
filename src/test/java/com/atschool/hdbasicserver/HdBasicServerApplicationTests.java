package com.atschool.hdbasicserver;

import com.atschool.hdbasicserver.bean.*;
import com.atschool.hdbasicserver.mapper.*;
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
        List<Hotspot> hotspotList = hotspotMapper.getHotspot();
        for (Hotspot h: hotspotList
             ) {
            System.out.println(h.toString());
        }
    }

}
