package com.rg.IDao;

import com.rg.Domain.Fchange;

public interface FchangeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fchange record);

    int insertSelective(Fchange record);

    Fchange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fchange record);

    int updateByPrimaryKey(Fchange record);
}