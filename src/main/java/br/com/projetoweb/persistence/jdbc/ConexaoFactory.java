package br.com.projetoweb.persistence.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {

		
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/santoantonio", "root", "123456");
		} catch (SQLException e) {
			

			throw new RuntimeException(e);
		}
	}

}
