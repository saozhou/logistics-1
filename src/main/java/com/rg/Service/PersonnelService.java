package com.rg.Service;

import java.util.List;

import com.rg.Domain.Cwork;
import com.rg.Domain.Employee;

/**
 * 
 * @author Zhou
 *人事Service
 *员工纪律管理（）
员工奖惩管理（）
处理员工投诉（）
员工档案（）
人事统计（）
员工入职（）
员工离职（）
 */
public interface PersonnelService {

	List<Employee> selectAll();

	List<Employee> likeSelectById(String id);

	List<Employee> likeSelectByname(String name);

	Employee selectById(Employee employee);

	void addEmployee(Employee employee);

	void deleteEmployee(String id);

	void update(Employee employee);

	void checkAttendance(Cwork cwork);

}
