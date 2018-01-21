package com.rg.IDao;

import com.rg.Domain.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(String cid);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}