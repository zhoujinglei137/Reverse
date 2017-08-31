package com.qf.dao;

import com.qf.domain.TbGcExample;
import com.qf.domain.TbGcKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGcMapper {
    long countByExample(TbGcExample example);

    int deleteByExample(TbGcExample example);

    int deleteByPrimaryKey(TbGcKey key);

    int insert(TbGcKey record);

    int insertSelective(TbGcKey record);

    List<TbGcKey> selectByExample(TbGcExample example);

    int updateByExampleSelective(@Param("record") TbGcKey record, @Param("example") TbGcExample example);

    int updateByExample(@Param("record") TbGcKey record, @Param("example") TbGcExample example);
}