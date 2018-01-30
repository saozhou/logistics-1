package com.rg.IDao;

import com.rg.Domain.Fchange;

/**
 * 固定资产记录Dao
 * @author Zhou
 *
 */
public interface FchangeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fchange record);

    int insertSelective(Fchange record);

    Fchange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fchange record);

    int updateByPrimaryKey(Fchange record);
}