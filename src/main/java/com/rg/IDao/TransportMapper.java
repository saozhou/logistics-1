package com.rg.IDao;

import com.rg.Domain.Transport;

public interface TransportMapper {
    int deleteByPrimaryKey(String dnumber);

    int insert(Transport record);

    int insertSelective(Transport record);

    Transport selectByPrimaryKey(String dnumber);

    int updateByPrimaryKeySelective(Transport record);

    int updateByPrimaryKey(Transport record);
}