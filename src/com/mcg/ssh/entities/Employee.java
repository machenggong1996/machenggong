package com.mcg.ssh.entities;

import java.util.Date;

public class Employee {
	private Integer id;
	// ����֮���ܱ��޸�
	private String lastName;
	private String email;
	// ��ǰ�˴�����string������Ҫת��
	private Date brith;
	// ���ܱ��޸�
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBrith() {
		return brith;
	}

	public void setBrith(Date brith) {
		this.brith = brith;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private Department department;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", brith=" + brith
				+ ", createTime=" + createTime + ", department.id=" + department + "]";
	}

}
