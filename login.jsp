<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.button {
  background-color: #555555; 
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  width:100%;
}
body{
font-family: verdana;
background-color:#66ffcc;
}
</style>
</head>
<body>
	<center><h2>LogIn Form</h2></center>
	<center>
	<form action="./LoginServlet">
		<table border='1'>
			<tr>
				<td>Roll Number:</td>
				<td><input type="text" name="roll"
					placeholder="Enter Your Roll Number" required></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><input type="text" name="pwd"
					placeholder="Enter Your Password" required></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Login" class="button"></td>
				<td><input type="reset" value="Clear" class="button"></td>
			</tr>
		</table>
		<p>If not registered yet please <a href="registration.jsp">Click here...</a></p>
	</form>
	</center>
</body>
</html>