package com.example.demo.controller;

import com.example.demo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户接口")
public class UserController {
    @RequestMapping("/hello")
    public String query(){
        return "ok";
    }
    @RequestMapping("/user")
    @ApiOperation("根据用户ID查询")
    public User getUserById(Integer id){
        User user=new User();
        return user;
    }
}
