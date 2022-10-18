package com.learnersAcademy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author anildhaubhadel
 *
 */

public class DBConnection {
	static Connection conn = null;
	private final static String SERVER_IP = "localhost";// "127.0.0.1";
	private final static String SERVER_PORT = "1433";
	private final static String DB_NAME = "learnersAcademyMgmtSystem";
	private final static String USER_NAME = "sa";
	private final static String PASSWORD = "myPassw0rd";
	
	//Method responsible for making connection to DB
	/**
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		if(conn == null) {
			
			String dbURL = "jdbc:sqlserver://" + SERVER_IP + ":" + SERVER_PORT + ";DatabaseName=" + DB_NAME
					+ ";encrypt=true;integrated security=SSPI;trustServerCertificate=true;loginTimeout=30;";
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection(dbURL, USER_NAME, PASSWORD);
			} catch (SQLException e) {
			
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
	
			}
		}
		return conn;
			
	}
}
