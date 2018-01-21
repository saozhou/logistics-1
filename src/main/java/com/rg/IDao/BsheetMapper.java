package com.rg.IDao;

import com.rg.Domain.Bsheet;

public interface BsheetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bsheet record);

    int insertSelective(Bsheet record);

    Bsheet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bsheet record);

    int updateByPrimaryKey(Bsheet record);
}