package com.job.post;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProviderr {

	static Connection con;
	public static Connection createConnection() {
		
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbccrud";
			String username = "root";
			String password = "root";
			con = DriverManager.getConnection(url, username, password);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
