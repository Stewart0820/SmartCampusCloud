package com.stewart.cloud.service;

import com.stewart.cloud.model.User;
import com.stewart.cloud.vo.UserLoginVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author Stewart
 * @create 2021/9/29
 */
public interface UserService {
    User findByEmail(UserLoginVo user);
    User findUserById(@Param("Id") String Id);
}
