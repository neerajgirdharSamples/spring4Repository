package main.java.com.example.spring4.daoImpl;

import main.java.com.example.spring4.dao.BaseDAO;
import main.java.com.example.spring4.vo.Employee;

public class OracleConnection implements BaseDAO {

	@Override
	public String getConnection() {
		System.out.println("getConnection in OracleConnection");
		return "success";
	}

	@Override
	public void insertEmployeeInfo(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
