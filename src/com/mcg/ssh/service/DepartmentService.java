package com.mcg.ssh.service;

import java.util.List;

import com.mcg.ssh.dao.DepartmentDao;
import com.mcg.ssh.entities.Department;

public class DepartmentService {
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	public List<Department> getAll() {
		return departmentDao.getAll();
	}
}
