package com.rg.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rg.Domain.Cwork;
import com.rg.Domain.Employee;
import com.rg.IDao.CworkMapper;
import com.rg.IDao.EmployeeMapper;
import com.rg.Service.PersonnelService;

/**
 * 
 * @author Zhou
 *人事ServiceImpl
 */
@Service("personnelService")
public class PersonnelServiceImpl implements PersonnelService {

	@Resource
	private EmployeeMapper employeeDao;
	@Resource
	private CworkMapper cworkDao;
	
	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		List<Employee>list = employeeDao.selectAll();
		return list;
	}

	@Override
	public List<Employee> likeSelectById(String id) {
		// TODO Auto-generated method stub
		List<Employee>list = employeeDao.likeSelectById(id);
		return list;
	}

	@Override
	public List<Employee> likeSelectByname(String name) {
		// TODO Auto-generated method stub
		List<Employee>list = employeeDao.likeSelectByname(name);
		return list;
	}

	@Override
	public Employee selectById(Employee employees) {
		// TODO Auto-generated method stub
		Employee employee = employeeDao.selectById(employees);
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.insert(employee);
	}

	@Override
	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
		employeeDao.setEmployeeUe(id,"0");
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.updateByPrimaryKeySelective(employee);
	}

	@Override
	public void checkAttendance(Cwork cwork) {
		// TODO Auto-generated method stub
		cworkDao.insert(cwork);
	}
	
	 
	

}
