package com.rg.IDao;

import com.rg.Domain.Performance;

public interface PerformanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Performance record);

    int insertSelective(Performance record);

    Performance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Performance record);

    int updateByPrimaryKey(Performance record);
}