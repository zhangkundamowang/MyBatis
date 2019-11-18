package com.qianfeng.mybatis;

import com.qianfeng.mybatis.dao.CommentMapper;
import com.qianfeng.mybatis.dao.UserMapper;
import com.qianfeng.mybatis.entity.Comment;
import com.qianfeng.mybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

//指定JUnit版本
@RunWith(SpringJUnit4ClassRunner.class)
//引入Spring的配置文件
@ContextConfiguration(locations = "classpath:spring.xml")
public class MyBatisSpringTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CommentMapper commentMapper;
    @Test
    public void testUserMapper(){
       /* List<User> users = userMapper.selectAll();
        users.forEach((user)->System.out.println(user));*/
       /*User user =userMapper.selectById(2);
        System.out.println(user);
        System.out.println(user.getComments());*/
        Comment comment=commentMapper.selectById(1);
        System.out.println(comment);
        System.out.println(comment.getUser().getRealname());

    }


    @Test
    public void testInsert(){
        User user=new User(1,"zs","zs","张三","zs",null);
        userMapper.insert(user);

    }

    @Test
    public void testSelectUser(){
        User user = new User();
//        user.setUsername("freedom");
//        user.setRealname("张三");
        List<User> users = userMapper.selectUser(user);
        users.forEach((u)->System.out.println(u));
    }

    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setUserId(1);
        user.setRealname("张大三");
//        user.setAddress("南京");
        userMapper.update(user);
        User user1 = userMapper.selectById(1);
        System.out.println(user1);
    }

    @Test
    public void testSelectUser2(){
        List<String> usernames = new ArrayList<>();
        usernames.add("user1");
        usernames.add("user2");
        usernames.add("freedom");
        List<User> users = userMapper.selectUserByUsernames(usernames);
        System.out.println(users);
    }




}
