package Utilidades;

import java.sql.Connection;

public class ConexionBbddOracle {
	
	public static void main (String [] args) {
		
		
		
	  //String url = "jdbc:oracle:thin:curso/password@localhost:1521/XE"; // si utilizo ésta instrucción, no haría falta indicarle el username y el password, ya que se incluye en la propia instrucción.
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String username = "curso";
		String password = "password";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // para especificar qué driver debe coger
			
			Connection conexionOracle = Util_ConexionTB.conexion(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}

}
