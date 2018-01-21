package com.rg.IDao;

import com.rg.Domain.Cwork;

public interface CworkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cwork record);

    int insertSelective(Cwork record);

    Cwork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cwork record);

    int updateByPrimaryKey(Cwork record);
}