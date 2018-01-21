package com.rg.IDao;

import com.rg.Domain.Srecord;

public interface SrecordMapper {
    int deleteByPrimaryKey(String rid);

    int insert(Srecord record);

    int insertSelective(Srecord record);

    Srecord selectByPrimaryKey(String rid);

    int updateByPrimaryKeySelective(Srecord record);

    int updateByPrimaryKey(Srecord record);
}