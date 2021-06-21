<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registraion Page</title>
<style>
table {
	border: 1px solid black;
}
.button {
  background-color: #008CBA; 
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  width:100%;
}
</style>
</head>
<body bgcolor="#6666ff">
<center><h2>Registration Form</h2></center>
	<center>
		<table border="1">
			<form action="./Registration">
				<tr>
					<th bgcolor="sky blue">Roll Number:</th>
					<td><input type="text" name="roll"
						placeholder="Enter your roll number" required></td>
				</tr>
				<tr>
					<th bgcolor="sky blue">Full Name:</th>
					<td><input type="text" name="name"
						placeholder="Enter Your Full Name" required></td>
				</tr>
				<tr>
					<th bgcolor="sky blue">Email Id:</th>
					<td><input type="text" name="email"
						placeholder="Enter your email id" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></td>
				</tr>
				<tr>
					<th bgcolor="sky blue">Department:</th>
					<td><input type="text" name="dept"
						placeholder="Enter your department" required></td>
				</tr>
				<tr>
					<th bgcolor="sky blue">Current Year Of Study:</th>
					<td><input type="number" name="year"
						placeholder="Enter your current year of studying" required></td>
				</tr>
				<tr>
					<th bgcolor="sky blue">Password:</th>
					<td><input type="text" name="pwd"
						placeholder="Create a password for you" required></td>
				</tr>
				<tr>
				<td><input type="submit" value="Submit" class="button"></td>
				<td><input type="reset" value="Clear" class="button"></td>
			</tr>
			</form>
		</table>
	</center>
</body>
</html>