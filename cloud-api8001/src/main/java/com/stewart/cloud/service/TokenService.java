package com.stewart.cloud.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.stewart.cloud.model.User;

/**
 * @author Stewart
 * @create 2021/9/29
 */
public interface TokenService {
    public String getToken(User user);
}
