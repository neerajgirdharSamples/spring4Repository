<%@page import="main.java.com.example.spring4.vo.Employee"%>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="main.java.com.example.spring4.services.ServiceImpl" %>

<html>
<body>
<h2>Hello World!Changes done Bug Fix 100</h2>

<%
ApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"beans.xml"});

ServiceImpl serviceImpl = (ServiceImpl)context.getBean("serviceImpl");

Employee employee = (Employee)context.getBean("employee");
employee.setEmpCode("676033");
employee.setLocation("Chandigarh");
employee.setName("Neeraj");
employee.setUnit("FS-STAR");
employee.getTechnology().setPrimaryExpertise("Java/J2EE");
employee.getTechnology().setSecondaryExpertise("BigData");

String dbStatus = serviceImpl.checkDBConnection();

serviceImpl.insertEmployeeInfo(employee);

out.println("dbStatus --->"+dbStatus);
%>
</body>
</html>
