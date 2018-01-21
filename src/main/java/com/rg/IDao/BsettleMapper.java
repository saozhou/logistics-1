package com.rg.IDao;

import com.rg.Domain.Bsettle;

public interface BsettleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bsettle record);

    int insertSelective(Bsettle record);

    Bsettle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bsettle record);

    int updateByPrimaryKey(Bsettle record);
}