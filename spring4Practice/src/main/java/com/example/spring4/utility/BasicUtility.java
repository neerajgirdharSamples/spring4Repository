package main.java.com.example.spring4.utility;

public class BasicUtility {
	
	public  static boolean checkNull(String str)
	{
		System.out.println("In Static Method.....>>>>");
		
		if(null!=str && !("".equals(str.trim())))
		{
			return true;
		}
		return false;
	}

}
