<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.example.demo.pojo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Employee Details as below</i></h1>
<%
List<Employee> list=(List<Employee>)request.getAttribute("list");
%>
<table border="1">
<tr><th>Empno</th><th>Empname</th><th>Empphno</th></tr>

<%for(Employee ee:list){ %>
<td><%=ee.getEid() %></td>
<td><%=ee.getEname() %></td>
<td><%=ee.getPhono() %></td>

</tr>

<%} %>
</table>

</body>
</html>