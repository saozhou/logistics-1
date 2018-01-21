package com.rg.IDao;

import com.rg.Domain.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String eid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String eid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}