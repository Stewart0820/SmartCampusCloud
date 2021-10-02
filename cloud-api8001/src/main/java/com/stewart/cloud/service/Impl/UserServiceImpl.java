package com.stewart.cloud.service.Impl;

import com.stewart.cloud.common.utils.SecurityUtils;
import com.stewart.cloud.dao.UserDao;
import com.stewart.cloud.mapper.UserMapper;
import com.stewart.cloud.model.User;
import com.stewart.cloud.params.user.UserRegisterGetCodeParams;
import com.stewart.cloud.params.user.UserRegisterParams;
import com.stewart.cloud.service.UserService;
import com.stewart.cloud.params.user.UserLoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Stewart
 * @create 2021/9/29
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByEmail(UserLoginParams user) {
        return userDao.findByEmail(user.getEmail());
    }

    @Override
    public User findUserById(String userId) {
        return userDao.findUserById(userId);
    }

    @Override
    public User findExistEmail(UserRegisterGetCodeParams userRegisterGetCodeParams) {
        return userDao.findExistEmail(userRegisterGetCodeParams.getEmail());
    }

    @Override
    public int register(UserRegisterParams registerParams) {
        User user = new User();
        user.setEmail(registerParams.getEmail());
        user.setPassword(SecurityUtils.encodePassword(registerParams.getPassword()));
        user.setRegTime((int) System.currentTimeMillis());
        return userMapper.insertSelective(user);
    }
}
