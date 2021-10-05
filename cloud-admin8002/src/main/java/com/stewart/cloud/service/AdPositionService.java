package com.stewart.cloud.service;

import com.stewart.cloud.model.AdPosition;
import com.stewart.cloud.params.adposition.AdPositionCreateParams;
import com.stewart.cloud.params.adposition.AdPositionUpdateIsOpenByIdParams;
import com.stewart.cloud.params.adposition.AdPositionUpdateParams;

import java.util.List;

/**
 * @author Stewart
 * @create 2021/9/30
 */
public interface AdPositionService {
    List<AdPosition> selectAll();

    int create(AdPositionCreateParams adPositionParams);

    int update(Integer id, AdPositionUpdateParams adPositionUpdateParams);

    int deleteById(Integer id);

    int updateIsOpenById(Integer id, AdPositionUpdateIsOpenByIdParams adPositionUpdateIsOpenByIdParams);

    AdPosition findById(Integer pid);
}
