package com.stewart.cloud.service.impl;

import com.stewart.cloud.mapper.AdMapper;
import com.stewart.cloud.mapper.AdPositionMapper;
import com.stewart.cloud.model.Ad;
import com.stewart.cloud.model.AdExample;
import com.stewart.cloud.model.AdPosition;
import com.stewart.cloud.model.AdPositionExample;
import com.stewart.cloud.params.adposition.AdPositionCreateParams;
import com.stewart.cloud.params.adposition.AdPositionUpdateIsOpenByIdParams;
import com.stewart.cloud.params.adposition.AdPositionUpdateParams;
import com.stewart.cloud.service.AdPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Stewart
 * @create 2021/9/30
 */
@Service

public class AdPositionServiceImpl implements AdPositionService {

    @Autowired
    private AdPositionMapper adPositionMapper;

    @Autowired
    private AdMapper adMapper;

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


    @Transactional
    @Override
    public int deleteById(Integer id) {
        AdExample adExample = new AdExample();
        adExample.createCriteria().andPidEqualTo(id);
        //查询广告表中要删除这个广告位置id的数据
        List<Ad> adList = adMapper.selectByExample(adExample);
        if(adList.size()!=0){
            for (int i = 0; i < adList.size(); i++) {
                Ad ad = new Ad();
                ad.setId(adList.get(i).getId());
                ad.setPid(0);
                //修改广告表中广告位置的值
                adMapper.updateByPrimaryKeySelective(ad);
            }
        }
        return adPositionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateIsOpenById(Integer id, AdPositionUpdateIsOpenByIdParams adPositionUpdateIsOpenByIdParams) {
        AdPosition position = adPositionMapper.selectByPrimaryKey(id);
        position.setIsOpen(adPositionUpdateIsOpenByIdParams.getIsOpen());

        AdPositionExample adPositionExample = new AdPositionExample();
        adPositionExample.createCriteria().andIdEqualTo(id);
        return adPositionMapper.updateByExample(position,adPositionExample);
    }

    @Override
    public AdPosition findById(Integer pid) {
        return adPositionMapper.selectByPrimaryKey(pid);
    }
}
