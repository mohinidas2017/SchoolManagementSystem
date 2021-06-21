<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.gcect.SMS.Bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Record</title>
</head>
<body style="font-family : verdana; background-color : #99ff66;">
	<%
	if (request.getAttribute("result") != null) {
		Student_Result result = (Student_Result) request.getAttribute("result");
	%>

	<center><h1><font color="green">Result</font></h1></center>
	<center>
	<table border='1'>
		<tr><th bgcolor="yellow">Roll Number:</th>
		<td><%=result.getRoll_number()%></td></tr>
	
		<tr><th bgcolor="yellow">First Name:</th>
		<td><%=result.getFull_name()%></td></tr>
		
		<tr><th bgcolor="yellow">Ecommerce:</th>
		<td><%=result.getEcommerce()%></td></tr>
		
		<tr><th bgcolor="yellow">Industrial Management:</th>
		<td><%=result.getIndustrial_management()%></td></tr>
		
		<tr><th bgcolor="yellow">Cyber Law & Security:</th>
		<td><%=result.getCyberlaw()%></td></tr>
		
		<tr><th bgcolor="yellow">Cryptography:</th>
		<td><%=result.getCryptography()%></td></tr>
		
		<tr><th bgcolor="yellow">Total Marks:</th>
		<td>400.00</td></tr>
		
		<tr><th bgcolor="yellow">Your Score:</th>
		<td><%=result.getGrand_total()%></td></tr>
		</table>
		</center>

	<%
	} else {
	%>


	<h1>No student record found.</h1>

	<%
	}
	%>
</body>
</html>

