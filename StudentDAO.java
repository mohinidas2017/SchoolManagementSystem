package com.gcect.SMS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.gcect.SMS.DBUtil.DBManager;
import com.gcect.SMS.Bean.Student;
import com.gcect.SMS.Bean.Student_Result;

public class StudentDAO {
	
	public int insert(Student student)
	{	
		int status = 0;
		Connection conn = (new DBManager()).getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement("insert into STUDENT(roll_number,full_name,email,department,year,password) values(?,?,?,?,?,?);");
			stmt.setString(1, student.getRoll_number());
			stmt.setString(2, student.getFull_name());
			stmt.setString(3, student.getEmail());
			stmt.setString(4,student.getDepartment());
			stmt.setInt(5,student.getYear());
			stmt.setString(6, student.getPassword());
			status = stmt.executeUpdate();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	public boolean login(String roll, String password) {
		boolean f = false;
		Connection con = (new DBManager()).getConnection();
		try {
		PreparedStatement ps=con.prepareStatement("select * from student where roll_number = ? and password = ?;");
		ps.setString(1, roll);
		ps.setString(2, password);
		ResultSet r=ps.executeQuery();
		while(r.next())
		{

			f = true;
		}
		r.close();
		ps.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return f;
		
	}
	public Student_Result viewResult(String roll_number)
	{
		Student_Result result = new Student_Result();
		Connection con = (new DBManager()).getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from student_result where roll_number = ?;");
			ps.setString(1, roll_number);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String roll = rs.getString(1);
				String name = rs.getString(2);
				double ecomm = rs.getDouble(3);
				double industrial = rs.getDouble(4);
				double cyber = rs.getDouble(5);
				double crpt = rs.getDouble(6);
				double total = rs.getDouble(7);
				result.setRoll_number(roll);
				result.setFull_name(name);
				result.setEcommerce(ecomm);
				result.setIndustrial_management(industrial);
				result.setCyberlaw(cyber);
				result.setCryptography(crpt);
				result.setGrand_total(total);
				
			}
			rs.close();
			ps.close();
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace(); 
		}
		
		return result;
	}

}
