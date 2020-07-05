package com.atguigu.springboot.ssm;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@MapperScan(basePackages="com.atguigu.springboot.ssm")
@SpringBootApplication
public class SpringbootSsmConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSsmConfigApplication.class, args);
    }

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource getDataSource(){
        return new DruidDataSource();
    }

}
