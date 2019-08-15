package com.frank.lmsg.mybatis.mapper;

import com.frank.lmsg.mybatis.domain.FormId;
import com.frank.lmsg.mybatis.domain.FormIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormIdDao {
    long countByExample(FormIdExample example);

    int deleteByExample(FormIdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FormId record);

    int insertSelective(FormId record);

    List<FormId> selectByExample(FormIdExample example);

    FormId selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FormId record, @Param("example") FormIdExample example);

    int updateByExample(@Param("record") FormId record, @Param("example") FormIdExample example);

    int updateByPrimaryKeySelective(FormId record);

    int updateByPrimaryKey(FormId record);
}