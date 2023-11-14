//import Utilidades.ConexionBaseDeDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Utilidades.Utilidades;
import java.lang.Iterable;


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
		String preguntas="";
		for (String nombre : conectaPrepareStatement()){
			preguntas += nombre +"\n";
		}
		preguntas = preguntas + "3. SALIR";
		opcion = Utilidades.pintarMenu(preguntas);
		

		switch (opcion) {
		case 1: submenu (opcion); break; // ¿CÓMO PASO LA OPCIÓN?
		case 2: submenu(opcion);break;
		case 3: System.out.println("Adios");break;
		default: System.out.println("Opción incorrecta");
		}
	} while (opcion !=3);
	
}



// pintar submenú.

public void submenu (int opcion) {
	int opcion1 = 0;
	do {
		String [] preguntas = {"1. Mostrar Info Biblioteca", "2. Mostrar Catálogos libros", "3. Buscar Libro por Título", "4. Insertar Libro", "5. Modificar Libro", "6.Borrar Libro", "7. Volver"};
		opcion1 = Utilidades.pintarMenu(preguntas, "Elige una opción");

		switch (opcion1) {
		case 1: mostrarInfoBiblioteca (opcion);			
			break;
		case 2: mostrarLibros(); // con los datos de la biblioteca.
			break;
		case 3: buscarLibros(); // menú por título o campo del libro??. 
			break;
		case 4: insertarLibros(); 
			break;
		case 5: modificarLibros(); // verificar que esté en la tabla.
			break;
		case 6: borrarLibros(); // borra por título.
			break;
		case 7: System.out.println("Vover al Menú Principal");
		        iniciarGestion(); break;
		default: System.out.println("Opción incorrecta");
		}
	} while (opcion1 !=7);
}


// conecta la base, defino un ArrayList y guardo los datos de la tabla al recorrerla más abajo.

private List<String> conectaPrepareStatement() {
	
	String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
	String username = "root";
	String password = "password";

	Connection connection = null;//Conexion con la base de datos
	PreparedStatement prepareStament=null;
	ResultSet rs = null;//Recoger datos de la consulta
	List <String> nombres = new ArrayList (); // defino un Array List que recoge el id + nombre de la Biblio.
	
	try {

		System.out.println("Estableciendo conexión");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Conexión establecida");
		prepareStament = connection.prepareStatement(
				"SELECT id, nombre FROM TB_BIBLIOTECAS INNER JOIN TB_DIRECCIONES ON fk_dir = id");
		rs = prepareStament.executeQuery();
		
		while (rs.next()) {
			
			nombres.add (rs.getString("id")+". "+rs.getString("nombre"));
		}

	} catch (SQLException e) {
		System.err.println("Ha habido un error " + e.getMessage());
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
			e.printStackTrace();
		}
	}

	return nombres;
}

// MUESTRA LA INFORMACIÓN DE LA BIBLIOTECA

public void mostrarInfoBiblioteca (int opcion) {
	
	for (String nombre : opcion){
		
		System.out.println(nombre);
				
	}

}

// MOSTRAR LIBROS
public void mostrarLibros () {
	
	
}

// BUSCAR LIBROS
public void buscarLibros () {
	
	
	
}

// INSERTAR LIBROS
public void insertarLibros () {
	
	
}


// MODIFICAR LIBROS
public void modificarLibros () {
	
	
}

// BORRAR LIBROS
public void borrarLibros () {
	
	
}


}
