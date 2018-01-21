package com.rg.IDao;

import com.rg.Domain.Sroom;

public interface SroomMapper {
    int deleteByPrimaryKey(String wnumber);

    int insert(Sroom record);

    int insertSelective(Sroom record);

    Sroom selectByPrimaryKey(String wnumber);

    int updateByPrimaryKeySelective(Sroom record);

    int updateByPrimaryKey(Sroom record);
}