package com.rg.IDao;

import com.rg.Domain.Sdictionary;

public interface SdictionaryMapper {
    int deleteByPrimaryKey(String ecode);

    int insert(Sdictionary record);

    int insertSelective(Sdictionary record);

    Sdictionary selectByPrimaryKey(String ecode);

    int updateByPrimaryKeySelective(Sdictionary record);

    int updateByPrimaryKey(Sdictionary record);
}