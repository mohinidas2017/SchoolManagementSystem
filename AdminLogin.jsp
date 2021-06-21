<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin LogIn Form</title>
<style>
.button {
  background-color:#ffcc00; 
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
font-family:verdana;
background-color:#ff8000;
}

</style>
</head>
<body>
<center><h2>Admin LogIn Form</h2></center>
<center>
	<form action="./AdminLoginServlet">
		<table border='1'>
			<tr>
				<td bgcolor="#ffff00">Email:</td>
				<td><input type="text" name="email"
					placeholder="Enter Your Email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></td>
			</tr>
			
			<tr>
				<td bgcolor="#ffff00">Password:</td>
				<td><input type="text" name="pwd"
					placeholder="Enter Your Password" required></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Login" class="button"></td>
				<td><input type="reset" value="Clear" class="button"></td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>