package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Util_ConexionTB {
	
	
	private static Connection connection;
	
	
// CONSTRUCTOR	
	
	public Util_ConexionTB(java.sql.Connection connection) {
		super();
		this.connection = connection;
	}

// GETTERS AND SETTERS


	public Connection getConnection() {
		return connection;
	}


	public void setConnection(java.sql.Connection connection) {
		this.connection = connection;
	}

// MÉTODO DEVUELVE UNA CONEXION



	public static Connection conexion (String url, String username, String password)  {
		
		Connection connection = null; // CONEXION CON LA BASE DE DATOS.

		
	    System.out.println("Estableciendo conexión");
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
						
		return connection; 
	}
	

}
