package com.wipro.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	private static Connection con;
	public static Connection getConnection() {
		try{
			if(con==null){
				Class.forName("com.mysql.jdbc.Driver");		
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codit","root","");				
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
		
	}
}
