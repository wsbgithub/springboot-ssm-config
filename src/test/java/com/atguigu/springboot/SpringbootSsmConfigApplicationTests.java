package com.atguigu.springboot;

import com.atguigu.springboot.ssm.SpringbootSsmConfigApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest(classes = SpringbootSsmConfigApplication.class)
class SpringbootSsmConfigApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    void test01(){
        System.out.println("dataSource = " + dataSource.getClass().getName());
    }
    @Test
    void contextLoads() {
    }

}
