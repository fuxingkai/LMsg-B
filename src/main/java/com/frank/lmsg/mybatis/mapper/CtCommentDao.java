package com.frank.lmsg.mybatis.mapper;

import com.frank.lmsg.mybatis.domain.CtComment;
import com.frank.lmsg.mybatis.domain.CtCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtCommentDao {
    long countByExample(CtCommentExample example);

    int deleteByExample(CtCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CtComment record);

    int insertSelective(CtComment record);

    List<CtComment> selectByExample(CtCommentExample example);

    CtComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CtComment record, @Param("example") CtCommentExample example);

    int updateByExample(@Param("record") CtComment record, @Param("example") CtCommentExample example);

    int updateByPrimaryKeySelective(CtComment record);

    int updateByPrimaryKey(CtComment record);
}