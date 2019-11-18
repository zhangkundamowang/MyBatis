package com.qianfeng.mybatis;

import com.qianfeng.mybatis.dao.UserMapper;
import com.qianfeng.mybatis.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class MyBatisTest {

    @Test
    public void testInsertUser(){
        //创建工厂构建器
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //通过构建器创建工厂
        SqlSessionFactory factory = builder.build(MyBatisTest.class.getClassLoader()
                .getResourceAsStream("mybatis-config.xml"));
        //通过工厂创建SqlSession对象（类似连接对象）
        SqlSession sqlSession = factory.openSession();
        //通过SqlSession创建代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用插入功能
//        mapper.insert(new User(0,"mybatis-user","老张","上海","18997776666","xxx.jpg"));
        mapper.update(new User(1,"老张","老张三","上海","18997776666","xxx.jpg"));
        mapper.delete(5);
        //提交修改
        sqlSession.commit();
        //关闭Session
        sqlSession.close();
    }

    @Test
    public void testSelectUser(){
        //创建工厂构建器
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //通过构建器创建工厂
        SqlSessionFactory factory = builder.build(MyBatisTest.class.getClassLoader()
                .getResourceAsStream("mybatis-config.xml"));
        //通过工厂创建SqlSession对象（类似连接对象）
        SqlSession sqlSession = factory.openSession();
        //通过SqlSession创建代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //查询一个用户
        User user = mapper.selectById(1);
        System.out.println("用户：" + user);
        user.setAddress("北京");
        mapper.update(user);
        //查询所有用户
        List<User> users = mapper.selectAll();
        users.forEach((u)->System.out.println(u));
        //提交修改
        sqlSession.commit();
        //关闭Session
        sqlSession.close();
    }

    @Test
    public void testSelect2(){
        //创建工厂构建器
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //通过构建器创建工厂
        SqlSessionFactory factory = builder.build(MyBatisTest.class.getClassLoader()
                .getResourceAsStream("mybatis-config.xml"));
        //通过工厂创建SqlSession对象（类似连接对象）
        SqlSession sqlSession = factory.openSession();
        SqlSession sqlSession2 = factory.openSession();
        System.out.println(sqlSession==sqlSession2);
    }
}
