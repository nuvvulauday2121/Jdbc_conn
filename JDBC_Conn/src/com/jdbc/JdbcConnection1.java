package com.jdbc;

import java.sql.*;

public class JdbcConnection1 {
	
	public static void main(String[] args) throws Exception {
		String url ="jdbc:mysql://localhost:3306/emp1";
		String uname="root";
		String pass ="2121";
		String query ="select * from emp_details";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String userData ="";
		
		while (rs.next()) {

			userData =rs.getInt(1)+" : "+ rs.getString(2)+" : " + rs.getInt(3)+" : "+rs.getDouble(4)+" : "+rs.getCharacterStream(5);
			System.out.println(userData);
			
			
		}
		
		
		st.close();
		con.close();
     
	}
	
	

}
