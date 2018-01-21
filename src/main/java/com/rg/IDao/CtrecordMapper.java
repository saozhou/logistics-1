package com.rg.IDao;

import com.rg.Domain.Ctrecord;

public interface CtrecordMapper {
    int deleteByPrimaryKey(Integer ctype);

    int insert(Ctrecord record);

    int insertSelective(Ctrecord record);

    Ctrecord selectByPrimaryKey(Integer ctype);

    int updateByPrimaryKeySelective(Ctrecord record);

    int updateByPrimaryKey(Ctrecord record);
}