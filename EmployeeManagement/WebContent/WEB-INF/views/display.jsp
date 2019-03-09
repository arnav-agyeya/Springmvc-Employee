<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@page import="arn.first.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of employees</title>
</head>
<body>
 <% ArrayList<EmployeePojo> empList=(ArrayList<EmployeePojo>)request.getAttribute("EmployeeList");
for(EmployeePojo emp:empList){
%>
<tr>
           <td><% out.println(emp.geteId()) ; %></td>
           <td><% out.println(emp.geteName()); %></td>
           <td><% out.println(emp.getDesignation()); %></td>
           <td><% out.println(emp.getDeoartment()); %></td>
           <td><% out.println(emp.getBasic()); %></td>
     <tr>

<%} %>

</body>
</html>