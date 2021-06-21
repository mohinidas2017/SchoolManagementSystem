package com.gcect.SMS.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gcect.SMS.Bean.Student_Result;
import com.gcect.SMS.DAO.AdminDAO;

/**
 * Servlet implementation class AddingMarks
 */
@WebServlet("/AddingMarks")
public class AddingMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddingMarks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String ecom = request.getParameter("ecom");
		String ind = request.getParameter("ind");
		String cyber = request.getParameter("cyber");
		String crpt = request.getParameter("crpt");
		String total = request.getParameter("total");
		AdminDAO obj=new AdminDAO();
		Student_Result res=new Student_Result();
		res.setRoll_number(roll);
		res.setFull_name(name);
		res.setEcommerce(Double.parseDouble(ecom));
		res.setIndustrial_management(Double.parseDouble(ind));
		res.setCyberlaw(Double.parseDouble(cyber));
		res.setCryptography(Double.parseDouble(crpt));
		res.setGrand_total(Double.parseDouble(total));
		int status=obj.insert(res);
		if(status!=0) {
			PrintWriter p = response.getWriter();
			p.print("<h3><font color='green'>Student record successfully added.</font></h3>");
		}
		else {
			PrintWriter p = response.getWriter();
			p.print("<h3><font color='red'>No student record added.</font></h3>");
		}
		
	}

}
