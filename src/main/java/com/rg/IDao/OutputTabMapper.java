package com.rg.IDao;

import com.rg.Domain.OutputTab;

public interface OutputTabMapper {
    int deleteByPrimaryKey(String id);

    int insert(OutputTab record);

    int insertSelective(OutputTab record);

    OutputTab selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OutputTab record);

    int updateByPrimaryKey(OutputTab record);
}