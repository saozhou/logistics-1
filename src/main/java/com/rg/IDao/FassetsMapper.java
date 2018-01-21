package com.rg.IDao;

import com.rg.Domain.Fassets;

public interface FassetsMapper {
    int deleteByPrimaryKey(String fcode);

    int insert(Fassets record);

    int insertSelective(Fassets record);

    Fassets selectByPrimaryKey(String fcode);

    int updateByPrimaryKeySelective(Fassets record);

    int updateByPrimaryKey(Fassets record);
}