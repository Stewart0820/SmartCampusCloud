package com.stewart.cloud.service;

import com.stewart.cloud.model.User;
import com.stewart.cloud.params.user.UserLoginParams;
import com.stewart.cloud.params.user.UserRegisterGetCodeParams;
import com.stewart.cloud.params.user.UserRegisterParams;
import org.apache.ibatis.annotations.Param;

/**
 * @author Stewart
 * @create 2021/9/29
 */
public interface UserService {

    User findByEmail(UserLoginParams user);

    User findUserById(@Param("Id") String Id);

    User findExistEmail(UserRegisterGetCodeParams userRegisterGetCodeParams);

    int register(UserRegisterParams registerParams);
}
