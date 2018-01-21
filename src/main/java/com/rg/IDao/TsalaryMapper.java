package com.rg.IDao;

import com.rg.Domain.Tsalary;

public interface TsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tsalary record);

    int insertSelective(Tsalary record);

    Tsalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tsalary record);

    int updateByPrimaryKey(Tsalary record);
}