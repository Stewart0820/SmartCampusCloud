package com.stewart.cloud.mapper;

import com.stewart.cloud.model.StoreAuthentication;
import com.stewart.cloud.model.StoreAuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreAuthenticationMapper {
    long countByExample(StoreAuthenticationExample example);

    int deleteByExample(StoreAuthenticationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreAuthentication record);

    int insertSelective(StoreAuthentication record);

    List<StoreAuthentication> selectByExample(StoreAuthenticationExample example);

    StoreAuthentication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreAuthentication record, @Param("example") StoreAuthenticationExample example);

    int updateByExample(@Param("record") StoreAuthentication record, @Param("example") StoreAuthenticationExample example);

    int updateByPrimaryKeySelective(StoreAuthentication record);

    int updateByPrimaryKey(StoreAuthentication record);
}