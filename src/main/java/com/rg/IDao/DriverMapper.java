package com.rg.IDao;

import com.rg.Domain.Driver;

public interface DriverMapper {
    int deleteByPrimaryKey(String driverid);

    int insert(Driver record);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(String driverid);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);
}