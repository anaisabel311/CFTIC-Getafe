package DDBB;

// ctrl + shift + O

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;

public class ConexionBaseDeDatos {
	
private static final Logger Logger = LogManager.getLogger(ConexionBaseDeDatos.class);
	
	public static void main(String[] args) {
		ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
		conexion.conecta();
		
	}

// CONEXION A BASE DE DATOS	
	
	
	public void conecta() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
	    String username = "root";
	    String password = "password";
	    
	    
// INTERFACES	    
	    
	    Connection connection = null; // CONEXION CON LA BASE DE DATOS.
	    Statement stmt = null; // LANZAR CONSULTA.
	    ResultSet rs = null; // RECOGER DATOS DE LA CONSULTA.
	    
// CREAR UNA COLECCIÓN DE TIPO SET, DE OBJETOS FACILITY, PARA GUARDAR LOS REGISTROS DE LA TB_FACILITIES   
	    
	    Set<Facility> datos = new LinkedHashSet <Facility>(); // LinkedHashSet se crea los elementos en el mismo orden de lectura.

// HACEMOS CONEXION CON CONTROL DE EXCEPCIONES	    
	    
		try {
			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			stmt = connection.createStatement();
						
			rs = stmt.executeQuery("SELECT * FROM tb_vehiculos_guerra");
			while (rs.next()) {

// GUARDAMOS CADA ELEMENTO EN LA COLECCIÓN DATOS
				
				int id = rs.getInt("id"); // puedes crear una variable para recoger el getInt y luego, en los (argumentos), incluir la variable.
				
				Facility dato = new Facility(id, rs.getDouble("guid"), rs.getString("name"), rs.getString("description"), rs.getString("category"), rs.getString("address"),rs.getDouble("heigh") );
				datos.add(dato);
			}		
			
		} catch (SQLException e) {
			System.err.println("Ha habido un error "+e.getMessage());
//			e.printStackTrace();
		}finally {
			
			System.out.println (datos.size());
			try {
				connection.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
