package com.rg.IDao;

import com.rg.Domain.Eturnover;

public interface EturnoverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Eturnover record);

    int insertSelective(Eturnover record);

    Eturnover selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Eturnover record);

    int updateByPrimaryKey(Eturnover record);
}