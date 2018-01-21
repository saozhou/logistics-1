package com.rg.IDao;

import com.rg.Domain.Rbids;

public interface RbidsMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Rbids record);

    int insertSelective(Rbids record);

    Rbids selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Rbids record);

    int updateByPrimaryKey(Rbids record);
}