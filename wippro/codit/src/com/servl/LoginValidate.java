package com.servl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DBUtil;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginValidate() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try(PrintWriter out=response.getWriter()){
			String username=request.getParameter("user");
			String password=request.getParameter("pass");
			out.println(username);
			out.println(password);
			out.println("Test web sevlet");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con;
		Statement st;
		ResultSet rs;
		String username=request.getParameter("uname");
		String password=request.getParameter("psw");
		String option=request.getParameter("option");
		   response.setContentType("text/html");
			PrintWriter out=response.getWriter();

			 
			try{
				con=DBUtil.getConnection();
				st=con.createStatement();
				if(con!=null)
				{
					if(option.equals("signins"))
					{
						rs=st.executeQuery("select * from signup where username='"+username+"'");
						if(rs.next())
						{
							if(rs.getString(2).equals(password))
							{
								Cookie loginc=new Cookie("login",username);
								loginc.setMaxAge(120*60);
								response.addCookie(loginc);
								response.sendRedirect("signedin.html");
							}
						}
					}
				}
				}catch(Exception e)
			{
					response.sendRedirect("Error.html");	
					
			}
	}
}
