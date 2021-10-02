package com.stewart.cloud.service.impl;

import com.stewart.cloud.mapper.AdPositionMapper;
import com.stewart.cloud.model.AdPosition;
import com.stewart.cloud.model.AdPositionExample;
import com.stewart.cloud.params.AdPosition.AdPositionCreateParams;
import com.stewart.cloud.params.AdPosition.AdPositionUpdateIsOpenByIdParams;
import com.stewart.cloud.params.AdPosition.AdPositionUpdateParams;
import com.stewart.cloud.service.AdPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Stewart
 * @create 2021/9/30
 */
@Service
public class AdPositionServiceImpl implements AdPositionService {

    @Autowired
    private AdPositionMapper adPositionMapper;

    @Override
    public List<AdPosition> selectAll() {
        return adPositionMapper.selectByExample(new AdPositionExample());
    }

    @Override
    public int create(AdPositionCreateParams adPositionParams) {
        AdPosition adPosition = new AdPosition();
        BeanUtils.copyProperties(adPositionParams,adPosition);
        return adPositionMapper.insertSelective(adPosition);
    }

    @Override
    public int update(Integer id, AdPositionUpdateParams adPositionUpdateParams) {
        AdPosition adPosition = new AdPosition();
        BeanUtils.copyProperties(adPositionUpdateParams,adPosition);
        adPosition.setId(id);
        return adPositionMapper.updateByPrimaryKeySelective(adPosition);
    }


    @Override
    public int deleteById(Integer id) {
        return adPositionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateIsOpenById(Integer id, AdPositionUpdateIsOpenByIdParams adPositionUpdateIsOpenByIdParams) {
        AdPosition adPosition = new AdPosition();
        BeanUtils.copyProperties(adPositionUpdateIsOpenByIdParams,adPosition);
        adPosition.setId(id);
        return adPositionMapper.updateByPrimaryKey(adPosition);
    }
}
