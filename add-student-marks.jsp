<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Marks</title>
<style>
.button {
  background-color: #0055ff; 
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
<body>
<center><h2><font color="#000099">Adding Marks Of Student</font></h2></center>
	<center>
		<table border="1">
			<form action="./AddingMarks">
				<tr>
					<th bgcolor="#b3ccff">Roll Number:</th>
					<td><input type="text" name="roll" required></td>
				</tr>
				<tr>
					<th bgcolor="#b3ccff">Full Name:</th>
					<td><input type="text" name="name" required></td>
				</tr>
				<tr>
					<th bgcolor="#b3ccff">Ecommerce:</th>
					<td><input type="number" name="ecom" required></td>
				</tr>
				<tr>
					<th bgcolor="#b3ccff">Industrial Managent:</th>
					<td><input type="number" name="ind" required></td>
				</tr>
				<tr>
					<th bgcolor="#b3ccff">Cyber Law & Security:</th>
					<td><input type="number" name="cyber" required></td>
				</tr>
				<tr>
					<th bgcolor="#b3ccff">Cryptography:</th>
					<td><input type="number" name="crpt" required></td>
				</tr>
				<tr>
					<th bgcolor="#b3ccff">Grand Total:</th>
					<td><input type="number" name="total" required></td>
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