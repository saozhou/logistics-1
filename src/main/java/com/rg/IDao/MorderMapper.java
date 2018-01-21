package com.rg.IDao;

import com.rg.Domain.Morder;

public interface MorderMapper {
    int deleteByPrimaryKey(String cnumber);

    int insert(Morder record);

    int insertSelective(Morder record);

    Morder selectByPrimaryKey(String cnumber);

    int updateByPrimaryKeySelective(Morder record);

    int updateByPrimaryKey(Morder record);
}