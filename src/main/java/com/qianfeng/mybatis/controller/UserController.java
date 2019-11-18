package com.qianfeng.mybatis.controller;

import com.qianfeng.mybatis.dao.UserMapper;
import com.qianfeng.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("selectAll")
    public String selectAll(Model model){
        List<User> users = userMapper.selectAll();
        model.addAttribute("users",users);
        return "users";
    }

    @RequestMapping("selectUser")
    public String selectUser(Model model,User user){
        List<User> users = userMapper.selectUser(user);
        model.addAttribute("users",users);
        return "users";
    }


}
