package com.rg.IDao;

import com.rg.Domain.Cfbids;

public interface CfbidsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cfbids record);

    int insertSelective(Cfbids record);

    Cfbids selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cfbids record);

    int updateByPrimaryKey(Cfbids record);
}