package com.example.jpabook.jpashop.test.controller;

import com.example.jpabook.jpashop.test.vo.TestVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("parse")
public class TestController {

    @RequestMapping("test")
    public TestVo test() {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            TestVo testVo = objectMapper.readValue(new File("C:\\Users\\HongJunPyo\\Documents\\test.json"), TestVo.class);
            // testVo 객체에 JSON 데이터가 매핑됩니다.
            System.out.println("testVo = " + testVo);
            return testVo;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    /**
     * <dependency>
     *     <groupId>com.fasterxml.jackson.core</groupId>
     *     <artifactId>jackson-databind</artifactId>
     *     <version>2.12.5</version> <!-- Jackson 버전은 프로젝트에 맞게 조정하세요. -->
     * </dependency>
     */
}
