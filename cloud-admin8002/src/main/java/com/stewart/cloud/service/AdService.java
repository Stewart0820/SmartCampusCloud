package com.stewart.cloud.service;

import com.stewart.cloud.model.Ad;
import com.stewart.cloud.params.ad.AdCreateParams;
import com.stewart.cloud.params.ad.AdUpdateParams;

import java.util.List;

/**
 * @author Stewart
 * @create 2021/10/5
 */
public interface AdService {

    List<Ad> list(Integer pageNum, Integer pageSize);

    int create(AdCreateParams adCreateParams);

    int update(Integer id, AdUpdateParams adUpdateParams);

    int deleteById(Integer id);
}
