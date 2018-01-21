package com.rg.IDao;

import com.rg.Domain.Profit;

public interface ProfitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Profit record);

    int insertSelective(Profit record);

    Profit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Profit record);

    int updateByPrimaryKey(Profit record);
}