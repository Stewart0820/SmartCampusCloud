package com.stewart.cloud.service;

import com.stewart.cloud.model.User;
import com.stewart.cloud.params.UserLoginParams;
import org.apache.ibatis.annotations.Param;

/**
 * @author Stewart
 * @create 2021/9/29
 */
public interface UserService {
    User findByEmail(UserLoginParams user);
    User findUserById(@Param("Id") String Id);
}
