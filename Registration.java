package com.gcect.SMS.Service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gcect.SMS.*;
import com.gcect.SMS.Bean.Student;
import com.gcect.SMS.Bean.Student_Result;
import com.gcect.SMS.DAO.*;
import com.gcect.SMS.DBUtil.*;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDAO obj = new StudentDAO();
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String dept = request.getParameter("dept");
		int year = Integer.parseInt(request.getParameter("year"));
		String password = request.getParameter("pwd");
		
		Student s = new Student();
		s.setRoll_number(roll);
		s.setFull_name(name);
		s.setEmail(email);
		s.setDepartment(dept);
		s.setYear(year);
		s.setPassword(password);
		
		int status = obj.insert(s);
		if(status != 0)
		{
			PrintWriter p = response.getWriter();
			p.print("<h3><Font color='green'>Registration Successfull...</Font></h3>");
		}
		else {
			PrintWriter p = response.getWriter();
			p.print("<h3><Font color='red'>Some error occured please try again after some time...</Font></h3>");
			
		}
	}

}
