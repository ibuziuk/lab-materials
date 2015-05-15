package org.exadel.todos.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	public static final String URL = "jdbc:mysql://localhost:3306/todos";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "password";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

}
