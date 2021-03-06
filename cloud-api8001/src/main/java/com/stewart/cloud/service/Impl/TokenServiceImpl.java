package com.stewart.cloud.service.Impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.stewart.cloud.model.User;
import com.stewart.cloud.service.TokenService;
import org.springframework.stereotype.Service;

/**
 * @author Stewart
 * @create 2021/9/29
 */
@Service
public class TokenServiceImpl implements TokenService {
    @Override
    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(user.getId()+"")// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getPassword()));// 以 password 作为 token 的密钥
        return token;
    }
}
