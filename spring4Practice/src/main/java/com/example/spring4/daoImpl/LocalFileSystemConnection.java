package main.java.com.example.spring4.daoImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import main.java.com.example.spring4.dao.BaseDAO;
import main.java.com.example.spring4.vo.Employee;

public class LocalFileSystemConnection implements BaseDAO {

	private String path = "D:\\spring4TestData\\Data.txt";

	@Override
	public String getConnection() {
		System.out.println("getConnection in LocalFileSystemConnection");

		File file = new File(path);
		if (file.exists()) {
			return "success in Finding Local Data File";
		}
		return "Failure in finding Local Data File";
	}

	@Override
	public void insertEmployeeInfo(Employee emp1) {
		System.out.println("insertEmployeeInfo in LocalFileSystemConnection");
		
		Map<String, Employee> map = new LinkedHashMap<String, Employee>();
		map.put(emp1.getEmpCode(), emp1);
		Iterator<String> itr =map.keySet().iterator();
		String content ="";
		while(itr.hasNext())
		{
			String empCode = itr.next();
			Employee emp = map.get(empCode);
			content = content + emp.getEmpCode()+","+emp.getName()+","+emp.getLocation()+","+emp.getUnit()+","+Employee.getOrganization()+","+emp.getTechnology().getPrimaryExpertise()+","+emp.getTechnology().getSecondaryExpertise()+"||";
		
		}
		BufferedWriter bw = null;
		FileWriter fw = null;

		

			try 
			{
				fw = new FileWriter(path);
				bw = new BufferedWriter(fw);				
				System.out.println(content);
				bw.write(content);

			} catch (IOException e) {

				e.printStackTrace();

			}finally {

				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}

	}
}

}
