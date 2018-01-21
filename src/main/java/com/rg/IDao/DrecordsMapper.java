package com.rg.IDao;

import com.rg.Domain.Drecords;

public interface DrecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drecords record);

    int insertSelective(Drecords record);

    Drecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drecords record);

    int updateByPrimaryKey(Drecords record);
}