package com.rg.IDao;

import com.rg.Domain.Bamount;

public interface BamountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bamount record);

    int insertSelective(Bamount record);

    Bamount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bamount record);

    int updateByPrimaryKey(Bamount record);
}