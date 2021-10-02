package com.stewart.cloud.service.Impl;

import com.stewart.cloud.dao.UserDao;
import com.stewart.cloud.model.User;
import com.stewart.cloud.service.UserService;
import com.stewart.cloud.params.UserLoginParams;
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


    @Override
    public User findByEmail(UserLoginParams user) {
        return userDao.findByEmail(user.getEmail());
    }

    @Override
    public User findUserById(String userId) {
        return userDao.findUserById(userId);
    }
}
