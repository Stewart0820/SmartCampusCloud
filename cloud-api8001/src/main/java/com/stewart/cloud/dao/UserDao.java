package com.stewart.cloud.dao;

import com.stewart.cloud.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Stewart
 * @create 2021/9/29
 */
public interface UserDao {
    User findByEmail(@Param("email") String email);
    User findUserById(@Param("Id") String Id);
}
