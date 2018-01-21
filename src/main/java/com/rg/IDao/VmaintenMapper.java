package com.rg.IDao;

import com.rg.Domain.Vmainten;

public interface VmaintenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Vmainten record);

    int insertSelective(Vmainten record);

    Vmainten selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Vmainten record);

    int updateByPrimaryKey(Vmainten record);
}