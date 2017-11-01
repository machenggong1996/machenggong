package com.mcg.ssh.service;

import java.util.List;

import com.mcg.ssh.dao.EmployeeDao;
import com.mcg.ssh.entities.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void saveOrUpdate(Employee employee) {
		employeeDao.saveOrUpdate(employee);
	}

	public void delete(Integer id) {
		employeeDao.delete(id);
	}

	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

}
