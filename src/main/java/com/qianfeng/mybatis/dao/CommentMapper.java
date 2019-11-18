package com.qianfeng.mybatis.dao;

import com.qianfeng.mybatis.entity.Comment;
import com.qianfeng.mybatis.entity.User;

import java.util.List;

/**
 * 评论的映射
 */
public interface CommentMapper {
    List<Comment> selectCommentsByUserId(int userId);
    Comment selectById(int commentId);
}
