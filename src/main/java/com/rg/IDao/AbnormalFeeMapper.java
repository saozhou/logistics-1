package com.rg.IDao;

import com.rg.Domain.AbnormalFee;

public interface AbnormalFeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AbnormalFee record);

    int insertSelective(AbnormalFee record);

    AbnormalFee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbnormalFee record);

    int updateByPrimaryKey(AbnormalFee record);
}