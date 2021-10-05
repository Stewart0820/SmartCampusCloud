package com.stewart.cloud.mapper;

import com.stewart.cloud.model.AdminLog;
import com.stewart.cloud.model.AdminLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminLogMapper {
    long countByExample(AdminLogExample example);

    int deleteByExample(AdminLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(AdminLog record);

    int insertSelective(AdminLog record);

    List<AdminLog> selectByExample(AdminLogExample example);

    AdminLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") AdminLog record, @Param("example") AdminLogExample example);

    int updateByExample(@Param("record") AdminLog record, @Param("example") AdminLogExample example);

    int updateByPrimaryKeySelective(AdminLog record);

    int updateByPrimaryKey(AdminLog record);
}