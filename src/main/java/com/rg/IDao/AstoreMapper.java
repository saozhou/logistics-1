package com.rg.IDao;

import com.rg.Domain.Astore;

public interface AstoreMapper {
    int deleteByPrimaryKey(String aid);

    int insert(Astore record);

    int insertSelective(Astore record);

    Astore selectByPrimaryKey(String aid);

    int updateByPrimaryKeySelective(Astore record);

    int updateByPrimaryKey(Astore record);
}