package com.stewart.cloud.service.impl;

import com.github.pagehelper.PageHelper;
import com.stewart.cloud.mapper.AdMapper;
import com.stewart.cloud.model.Ad;
import com.stewart.cloud.model.AdExample;
import com.stewart.cloud.model.AdPosition;
import com.stewart.cloud.params.ad.AdCreateParams;
import com.stewart.cloud.params.ad.AdUpdateParams;
import com.stewart.cloud.service.AdService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Stewart
 * @create 2021/10/5
 */
@Service
public class AdServiceImpl implements AdService {

    @Autowired
    private AdMapper adMapper;

    @Override
    public List<Ad> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adMapper.selectByExample(new AdExample());
    }

    @Override
    public int create(AdCreateParams adCreateParams) {
        Ad ad = new Ad();
        BeanUtils.copyProperties(adCreateParams,ad);
        ad.setSchool(0);
        return adMapper.insertSelective(ad);
    }

    @Override
    public int update(Integer id, AdUpdateParams adUpdateParams) {
        Ad ad = new Ad();
        BeanUtils.copyProperties(adUpdateParams,ad);
        ad.setId(id);
        return adMapper.updateByPrimaryKeySelective(ad);
    }

    @Override
    public int deleteById(Integer id) {
        return adMapper.deleteByPrimaryKey(id);
    }
}
