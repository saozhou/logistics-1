package com.rg.IDao;

import com.rg.Domain.Car;

public interface CarMapper {
    int deleteByPrimaryKey(String pnumber);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(String pnumber);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}