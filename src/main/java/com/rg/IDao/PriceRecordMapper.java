package com.rg.IDao;

import com.rg.Domain.PriceRecord;

public interface PriceRecordMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(PriceRecord record);

    int insertSelective(PriceRecord record);

    PriceRecord selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(PriceRecord record);

    int updateByPrimaryKey(PriceRecord record);
}