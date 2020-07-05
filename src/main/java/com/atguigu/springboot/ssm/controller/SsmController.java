package com.atguigu.springboot.ssm.controller;

import com.atguigu.springboot.ssm.bean.TAdmin;
import com.atguigu.springboot.ssm.mapper.TAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SsmController {
    @Autowired
    TAdminMapper adminMapper;

    @GetMapping("/ssmController")
    public List<TAdmin> ssmController(){
        System.out.println("ssmController");
        return adminMapper.selectByExample(null);
    }
    @GetMapping("testGit")
    public String testGit(){
        return "Hello git";
    }
}
