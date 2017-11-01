package com.mcg.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mcg.ssh.entities.Employee;

public class EmployeeDao extends BaseDao {

	public void delete(Integer id) {
		String hql = "DELETE FROM Employee e WHERE e.id = ?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}

	public List<Employee> getAll() {
		String hql = "FROM Employee e LEFT JOIN FETCH e.department";
		return getSession().createQuery(hql).list();
	}
}
