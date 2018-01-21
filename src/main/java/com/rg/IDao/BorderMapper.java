package com.rg.IDao;

import com.rg.Domain.Border;

public interface BorderMapper {
    int deleteByPrimaryKey(String bnumber);

    int insert(Border record);

    int insertSelective(Border record);

    Border selectByPrimaryKey(String bnumber);

    int updateByPrimaryKeySelective(Border record);

    int updateByPrimaryKey(Border record);
}