package com.stewart.cloud.service.Impl;

import com.stewart.cloud.mapper.AdMapper;
import com.stewart.cloud.model.Ad;
import com.stewart.cloud.model.AdExample;
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
    public List<Ad> selectHome() {
        AdExample adExample = new AdExample();
        adExample.createCriteria().andPidEqualTo(5160).andEnabledEqualTo((byte) 1);
        return adMapper.selectByExample(adExample);
    }

    @Override
    public int addCilckCount(Integer id) {

        Ad ad = adMapper.selectByPrimaryKey(id);
        Integer clickCount = ad.getClickCount();
        ad.setClickCount(clickCount+1);
        return adMapper.updateByPrimaryKey(ad);
    }
}
