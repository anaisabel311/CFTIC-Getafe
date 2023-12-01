package es.curso.java.hibernate.usuario;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.hibernate.basics.entities.Productos;
import es.curso.java.hibernate.basics.entities.Usuario;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;


public class HibernateListadoUsuarios {
	
	private static final Logger logger = LogManager.getLogger(HibernateListadoUsuarios.class);

    public static void main(String[] args) {

    
    	EntityManager em = JpaUtil.getEM("hibernateOracle");
        
        List<Usuario> usuarios = em.createQuery("from Usuario", Usuario.class).getResultList();
        
        crearArchivo("./FicheroUsuarios.txt", usuarios); 
        em.close();
        logger.debug("Final");
        em.close();
        
        HibernateListadoUsuarios lfp = new HibernateListadoUsuarios();
        try {
			lfp.leerFicheroProductos("C:\\Users\\Tardes\\git\\cursogetafe2\\enunciados\\hibernate\\fichero_carga_ejercicio2.txt", 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
 //      HibernateListadoUsuarios cbd = new HibernateListadoUsuarios();
 //       cbd.cargarBaseDatos(productos);
       
    }    
       
        
       
		public static void  crearArchivo (String fichero, List<Usuario> usuarios){
            File archivo = new File(fichero); // String fichero = ruta del archivo
                    
            	 try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))){
 // si realizas un buffer con un trywithresources no hace falta cerrar el buffer 
            		 
            		 buffer.append("ID;NOMBRE;APELLIDOS:DNI;FECHAALTA"+"\n");
            		// buffer.newLine(); // mete una línea en blanco
            		 for (Usuario usuario : usuarios) {
            			 
            			 SimpleDateFormat formattedDate=new SimpleDateFormat("yyyyMMdd"); // dar formato a la fecha, pero sigue siendo un String.
            			 String fecha=formattedDate.format(usuario.getFechaAlta());
            			 
            			 
	                     buffer.append(String.valueOf(usuario.getId()+";"));
	                     buffer.append(usuario.getNombre()+";");
	                     buffer.append(usuario.getApellidos()+";");
	                     buffer.append(usuario.getDni()+";");
	                     buffer.append(fecha +";");
	                     buffer.append("\n");    
            		 }
                     System.out.println("El archivo se ha llenado con éxito!");
                 } catch (IOException e) { // IOException, siempre obliga a controlar las excepciones trabajando con ficheros.
                     e.printStackTrace();
                 
        	}
       
    }
      
     
	public  List<Productos> leerFicheroProductos(String rutaFichero, 
			int skipLines) throws IOException{
		Path path = Paths.get(rutaFichero);
		List<Productos> productos = new ArrayList();

		List<String> lines = Files.readAllLines(path);
		int numLinea = 1;
		for (String linea : lines) {
			
			if (numLinea>skipLines) {
				
				String[] arrayProductos = linea.split("\\;");
				String nombre = arrayProductos[0];
				String tipo = arrayProductos[1];
				String fecha = arrayProductos[2];
				long precio = Long.parseLong(arrayProductos[3]);
				int unidades = Integer.parseInt(arrayProductos[4]);
						
				Productos producto = new Productos (skipLines, nombre, tipo, fecha, precio, unidades);
				productos.add(producto);
			}
			numLinea++;
		}
		logger.info("Creada la lista");
		System.out.println(productos.size());
		return productos;
	}
    
//    public 
    
    
}
