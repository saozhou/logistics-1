package com.rg.IDao;

import com.rg.Domain.Warm;

public interface WarmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Warm record);

    int insertSelective(Warm record);

    Warm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Warm record);

    int updateByPrimaryKey(Warm record);
}