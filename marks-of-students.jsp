<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.gcect.SMS.Bean.*" %>
<!DOCTYPE html>
<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Student List</title>
  </head>
  <body bgcolor="#00cc00">
      <center><h1>Displaying Student List</h1></center>
      <table border ="1" width="500" align="center">
         <tr bgcolor="00FF7F">
          <th><b>Student Roll</b></th>
          <th><b>Ecommerce</b></th>
          <th><b>Indutrial Management</b></th>
          <th><b>Cyber Law</b></th>
          <th><b>Cryptography</b></th>
          <th><b>Grand Total</b></th>
         </tr>
        <%ArrayList<Student_Result> std = 
            (ArrayList<Student_Result>)request.getAttribute("result");
        for(Student_Result s:std){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=s.getRoll_number()%></td>
                <td><%=s.getEcommerce()%></td>
                <td><%=s.getIndustrial_management()%></td>
                <td><%=s.getCyberlaw()%></td>
                <td><%=s.getCryptography()%></td>
                <td><%=s.getGrand_total()%></td>
            </tr>
            <%}%>
        </table> 
        
    </body>
</html>