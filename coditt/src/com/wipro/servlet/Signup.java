package com.wipro.servlet;
import com.wipro.db.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Signup")
public class Signup extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con;
		Statement st;
		ResultSet rs;
		String username=request.getParameter("uname");
		String password=request.getParameter("psw");
		String email=request.getParameter("email");
		String fullname=request.getParameter("fname");
		String option=request.getParameter("option");
	    response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try{
			con=DBUtil.getConnection();
			st=con.createStatement();
			if(con!=null)
			{
				if(option.equals("signups"))
				{
					String result="insert into signup values('"+username+ "' ,'" +password+ "','" +email+ "', '" +fullname+ "')";
					st.executeUpdate(result);
							                                     
					response.sendRedirect("Success.html");
				}
			}
		}catch(Exception e)
		{
			response.sendRedirect("Error.html");
		}
	}

}
