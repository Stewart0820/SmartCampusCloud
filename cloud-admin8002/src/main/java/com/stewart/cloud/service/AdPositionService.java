package com.stewart.cloud.service;

import com.stewart.cloud.model.AdPosition;
import com.stewart.cloud.params.AdPosition.AdPositionCreateParams;
import com.stewart.cloud.params.AdPosition.AdPositionUpdateIsOpenByIdParams;
import com.stewart.cloud.params.AdPosition.AdPositionUpdateParams;

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
}
