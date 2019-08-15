package com.frank.lmsg.mybatis.mapper;

import com.frank.lmsg.mybatis.domain.CtCommentLike;
import com.frank.lmsg.mybatis.domain.CtCommentLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtCommentLikeDao {
    long countByExample(CtCommentLikeExample example);

    int deleteByExample(CtCommentLikeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CtCommentLike record);

    int insertSelective(CtCommentLike record);

    List<CtCommentLike> selectByExample(CtCommentLikeExample example);

    CtCommentLike selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CtCommentLike record, @Param("example") CtCommentLikeExample example);

    int updateByExample(@Param("record") CtCommentLike record, @Param("example") CtCommentLikeExample example);

    int updateByPrimaryKeySelective(CtCommentLike record);

    int updateByPrimaryKey(CtCommentLike record);
}