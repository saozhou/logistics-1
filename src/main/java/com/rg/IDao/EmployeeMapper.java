package com.rg.IDao;

import java.util.List;

import com.rg.Domain.Employee;
import com.rg.Domain.EmployeeKey;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(EmployeeKey key);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

	List<Employee> selectAll();

	Employee selectById(Employee employees);

	List<Employee> likeSelectById(String id);

	List<Employee> likeSelectByname(String name);

	void setEmployeeUe(String id, String string);
}