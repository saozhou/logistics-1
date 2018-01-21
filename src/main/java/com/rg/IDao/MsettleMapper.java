package com.rg.IDao;

import com.rg.Domain.Msettle;

public interface MsettleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Msettle record);

    int insertSelective(Msettle record);

    Msettle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msettle record);

    int updateByPrimaryKey(Msettle record);
}