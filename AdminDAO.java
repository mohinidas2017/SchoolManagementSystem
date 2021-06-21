package com.gcect.SMS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gcect.SMS.Bean.Admin;
import com.gcect.SMS.Bean.Student_Result;
import com.gcect.SMS.DBUtil.DBManager;

public class AdminDAO {
	public boolean login(String email, String password)
	{
		boolean f = false;
		Admin obj = new Admin();
		if(email.equals(obj.getEmail()) && password.equals(obj.getPassword()))
		{
			f = true;
		}
		return f;
	}
	public int insert(Student_Result result)
	{
		int status = 0;
		Connection conn = (new DBManager()).getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement("insert into STUDENT_RESULT values(?,?,?,?,?,?,?);");
			stmt.setString(1, result.getRoll_number());
			stmt.setString(2, result.getFull_name());
			stmt.setDouble(3, result.getEcommerce());
			stmt.setDouble(4, result.getIndustrial_management());
			stmt.setDouble(5, result.getCyberlaw());
			stmt.setDouble(6, result.getCryptography());
			stmt.setDouble(7, result.getGrand_total());
			status = stmt.executeUpdate();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	public ArrayList<Student_Result> display()
	{
		ArrayList <Student_Result> list = new ArrayList <Student_Result>();
		Connection conn = (new DBManager()).getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement("select * from student_result;");
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				String roll = rs.getString(1);
				String name = rs.getString(2);
				double ecom = rs.getDouble(3);
				double ind = rs.getDouble(4);
				double cyber = rs.getDouble(5);
				double crpt = rs.getDouble(6);
				double total = rs.getDouble(7);
				
				Student_Result r = new Student_Result();
				r.setRoll_number(roll);
				r.setFull_name(name);
				r.setEcommerce(ecom);
				r.setIndustrial_management(ind);
				r.setCyberlaw(cyber);
				r.setCryptography(crpt);
				r.setGrand_total(total);
				
				list.add(r);
			}
			rs.close();
			stmt.close();
			conn.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
		
		
	}

}
