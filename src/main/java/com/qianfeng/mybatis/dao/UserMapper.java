package com.qianfeng.mybatis.dao;

import com.qianfeng.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User表映射接口
 */
public interface UserMapper {

    void insert(User user);
    void delete(int userId);
    void update(User user);
    User selectById(int userId);
    List<User> selectAll();

    /**
     * 按用户属性进行多条件查询
     * @param user
     * @return
     */
    List<User> selectUser(User user);

    /**
     * 查询多个用户名
     * @param usernames
     * @return
     */
    List<User> selectUserByUsernames(@Param("usernames") List<String> usernames);

}
