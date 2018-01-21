package com.rg.IDao;

import com.rg.Domain.Sales;

public interface SalesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sales record);

    int insertSelective(Sales record);

    Sales selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sales record);

    int updateByPrimaryKey(Sales record);
}