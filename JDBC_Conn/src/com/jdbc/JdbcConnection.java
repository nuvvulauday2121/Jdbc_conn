package com.jdbc;


import java.sql.*;

/*load and register driver
 * create connection
 * create statement
 * 
 */

public class JdbcConnection{
	
	public static void main(String[] args) throws Exception {
		String url ="jdbc:mysql://localhost:3306/emp1";
		String uname ="root";
		String pass ="2121";
		String query ="select Name from emp_details where ID=1";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url, uname, pass);
		Statement st =con.createStatement();
		ResultSet rs= st.executeQuery(query);
		rs.next();
		String name =rs.getString("name");
		
		System.out.println(name);
		st.close();
		con.close();
		
		
		
	}
	

}
