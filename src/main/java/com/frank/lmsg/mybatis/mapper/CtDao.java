package com.frank.lmsg.mybatis.mapper;

import com.frank.lmsg.mybatis.domain.Ct;
import com.frank.lmsg.mybatis.domain.CtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtDao {
    long countByExample(CtExample example);

    int deleteByExample(CtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Ct record);

    int insertSelective(Ct record);

    List<Ct> selectByExample(CtExample example);

    Ct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ct record, @Param("example") CtExample example);

    int updateByExample(@Param("record") Ct record, @Param("example") CtExample example);

    int updateByPrimaryKeySelective(Ct record);

    int updateByPrimaryKey(Ct record);
}