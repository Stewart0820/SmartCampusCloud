package com.stewart.cloud.service;

import com.stewart.cloud.model.Ad;
import java.util.List;

/**
 * @author Stewart
 * @create 2021/10/5
 */
public interface AdService {
    List<Ad> selectHome();

    int addCilckCount(Integer id);
}
