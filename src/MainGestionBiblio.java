//import Utilidades.ConexionBaseDeDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utilidades.Utilidades;

public class MainGestionBiblio {

	public static void main(String[] args) {
		MainGestionBiblio conexion = new MainGestionBiblio();
		conexion.conectaPrepareStatement(); // coge la url, username, password de la ddbb.
		
		MainGestionBiblio comenzar = new MainGestionBiblio ();
		comenzar.iniciarGestion();

	}


public void iniciarGestion () {
	
// PINTAR MENU
	
	int opcion=0;

	do {
		conectaPrepareStatement();
		
		
		String [] preguntas = {"1-" (rs.getString("name")), "2-BIBLIOTECA 2", "3-SALIR"};
		opcion = Utilidades.pintarMenu(preguntas, "Elige una Biblioteca");

		switch (opcion) {
		case 1: submenu(); break;
		case 2: submenu();break;
		case 3: System.out.println("Adios");break;
		default: System.out.println("Opción incorrecta");
		}
	} while (opcion !=3);
}


// pintar submenú.

public void submenu () {
	int opcion1 = 0;
	do {
		String [] preguntas = {"1. Mostrar Info Biblioteca", "2. Mostrar Catálogos libros", "3-Buscar Libro por Título", "4. Insertar Libro", "5. Modificar Libro", "6.Borrar Libro", "7. Volver"};
		opcion1 = Utilidades.pintarMenu(preguntas, "Elige una opción");

		switch (opcion1) {
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: break;
		case 7: System.out.println("Vover al Menú Principal");
		        iniciarGestion(); break;
		default: System.out.println("Opción incorrecta");
		}
	} while (opcion1 !=7);
}

private ArrayList <String>conectaPrepareStatement() {
	String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
	String username = "root";
	String password = "password";

	Connection connection = null;//Conexion con la base de datos
	//Statement stmt = null;//Lanzar consulta
	PreparedStatement prepareStament=null;
	ResultSet rs = null;//Recoger datos de la consulta
	
	try {

		System.out.println("Estableciendo conexión");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Conexión establecida");
		

		prepareStament = connection.prepareStatement(
				"SELECT nombre FROM TB_BIBLIOTECAS");

		
		rs = prepareStament.executeQuery();
		
		List nombres = new ArrayList ();
		
		while (rs.next()) {
			
			nombres.add(new (rs.getString("nombre"));

		}

	} catch (SQLException e) {
		System.err.println("Ha habido un error " + e.getMessage());
//		e.printStackTrace();
	} finally {
		
		try {
			if (connection!=null) {
				connection.close();
			}
			if (prepareStament!=null)
				prepareStament.close();
			if (rs!=null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return rs;
}



}
