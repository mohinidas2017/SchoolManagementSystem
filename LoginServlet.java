package com.gcect.SMS.Service;

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
import com.gcect.SMS.Bean.Student_Result;
import com.gcect.SMS.DAO.*;
import com.gcect.SMS.DBUtil.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String password = request.getParameter("pwd");
		String roll = request.getParameter("roll");
		StudentDAO obj = new StudentDAO();
		boolean f = obj.login(roll, password);
		if(f) {
			Student_Result res = new Student_Result();
			res = obj.viewResult(roll);
			request.setAttribute("result", res);
			
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("student-record.jsp");
		        dispatcher.forward(request, response);
		
	}
	@Override
    protected void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

        service(request, response);
    }

    @Override
    protected void doPost(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

        service(request, response);
    }

}
