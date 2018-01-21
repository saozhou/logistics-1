package com.rg.IDao;

import com.rg.Domain.Atransport;

public interface AtransportMapper {
    int deleteByPrimaryKey(String aonumber);

    int insert(Atransport record);

    int insertSelective(Atransport record);

    Atransport selectByPrimaryKey(String aonumber);

    int updateByPrimaryKeySelective(Atransport record);

    int updateByPrimaryKey(Atransport record);
}