package com.stewart.cloud.mapper;

import com.stewart.cloud.model.AdPosition;
import com.stewart.cloud.model.AdPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdPositionMapper {
    long countByExample(AdPositionExample example);

    int deleteByExample(AdPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdPosition record);

    int insertSelective(AdPosition record);

    List<AdPosition> selectByExampleWithBLOBs(AdPositionExample example);

    List<AdPosition> selectByExample(AdPositionExample example);

    AdPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    int updateByExampleWithBLOBs(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    int updateByExample(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    int updateByPrimaryKeySelective(AdPosition record);

    int updateByPrimaryKeyWithBLOBs(AdPosition record);

    int updateByPrimaryKey(AdPosition record);
}