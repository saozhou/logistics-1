package com.rg.IDao;

import com.rg.Domain.Fsettle;

public interface FsettleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fsettle record);

    int insertSelective(Fsettle record);

    Fsettle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fsettle record);

    int updateByPrimaryKey(Fsettle record);
}