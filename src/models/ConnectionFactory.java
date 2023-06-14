package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String user;
	private String url;
	private String pass;
	private Connection conn;
	
	//@Constructor
	public ConnectionFactory(String user, String url, String pass) {
		this.user = user;
		this.url = url;
		this.pass = pass;
	}
	//@Method cria conexoes
	public Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(url, user,pass);
				System.out.println("Conexão com o banco de dados ok");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
