package main.java.com.example.spring4.services;

import main.java.com.example.spring4.dao.BaseDAO;
import main.java.com.example.spring4.utility.BasicUtility;
import main.java.com.example.spring4.vo.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl {

	@Autowired
	private BaseDAO baseDAO;
	
	public String checkDBConnection()
	{
		System.out.println("checkDBConnection in ServiceImpl");
		String status =baseDAO.getConnection();
		if(BasicUtility.checkNull(status))
		{
			return status;
		}
		return "Failure";
	}
	
	
	public void insertEmployeeInfo(Employee emp)
	{
		System.out.println("insertEmployeeInfo in ServiceImpl");
		
		baseDAO.insertEmployeeInfo(emp);
	}
}
