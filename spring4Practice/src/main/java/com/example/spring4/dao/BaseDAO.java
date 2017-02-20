package main.java.com.example.spring4.dao;

import main.java.com.example.spring4.vo.Employee;

public interface BaseDAO {

	public String getConnection();
	public void insertEmployeeInfo(Employee emp);
	
}
