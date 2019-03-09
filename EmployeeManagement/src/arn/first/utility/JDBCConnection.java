package arn.first.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCConnection {
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	   static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	   
	   static final String USER = "MYDB";
	   static final String PASS = "12345";
	   
	  
		public static Connection getConnection() throws ClassNotFoundException, SQLException 
		{
			Class.forName(JDBC_DRIVER);
			Connection connection=DriverManager.getConnection(DB_URL, USER , PASS);
			return connection;
		}	 
}
