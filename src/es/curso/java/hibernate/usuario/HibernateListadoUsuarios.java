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
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.hibernate.UserEntity;
import es.curso.java.hibernate.basics.entities.Productos;
import es.curso.java.hibernate.basics.entities.Usuario;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class HibernateListadoUsuarios {

	private static final Logger logger = LogManager.getLogger(HibernateListadoUsuarios.class);

	static EntityManager em = JpaUtil.getEM("hibernateOracle");

	public static void main(String[] args) {
		
// hola
		

//        List<Usuario> usuarios = em.createQuery("from Usuario", Usuario.class).getResultList();
//        
//        crearArchivo("./FicheroUsuarios.txt", usuarios); 

//       HibernateListadoUsuarios lfp = new HibernateListadoUsuarios();
//       try {
//			lfp.leerFicheroProductos("C:\\Users\\Tardes\\git\\cursogetafe2\\enunciados\\hibernate\\fichero_carga_ejercicio2.txt", 1);
//		} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		}

		HibernateListadoUsuarios cbd = new HibernateListadoUsuarios();
		cbd.cargarBaseDatos();
		cbd.consultaporFecha("2023-10-16");
		cbd.mediaYtotalProductos();

		em.close();
		logger.debug("Final");
		em.close();

	}

	public static void crearArchivo(String fichero, List<Usuario> usuarios) {
		File archivo = new File(fichero); // String fichero = ruta del archivo

		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))) {
			// si realizas un buffer con un trywithresources no hace falta cerrar el buffer

			buffer.append("ID;NOMBRE;APELLIDOS:DNI;FECHAALTA" + "\n");
			// buffer.newLine(); // mete una línea en blanco
			for (Usuario usuario : usuarios) {

				SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd"); // dar formato a la fecha, pero
																						// sigue siendo un String.
				String fecha = formattedDate.format(usuario.getFechaAlta());
				logger.debug(fecha);

				buffer.append(String.valueOf(usuario.getId() + ";"));
				buffer.append(usuario.getNombre() + ";");
				buffer.append(usuario.getApellidos() + ";");
				buffer.append(usuario.getDni() + ";");
				buffer.append(fecha + ";");
				buffer.append("\n");
			}
			System.out.println("El archivo se ha llenado con éxito!");
		} catch (IOException e) { // IOException, siempre obliga a controlar las excepciones trabajando con
									// ficheros.
			e.printStackTrace();

		}

	}

	public List<Productos> leerFicheroProductos(String rutaFichero, int skipLines) throws IOException {
		Path path = Paths.get(rutaFichero);
		List<Productos> listaProductos = new ArrayList();

		List<String> lines = Files.readAllLines(path);
		int numLinea = 1;

		for (String linea : lines) {

			if (numLinea > skipLines) {

				String[] arrayProductos = linea.split("\\;");
				String nombre = arrayProductos[0];
				String tipo = arrayProductos[1];
				String fecha = arrayProductos[2];
				long precio = Long.parseLong(arrayProductos[3]);
				int unidades = Integer.parseInt(arrayProductos[4]);

				Productos producto = new Productos(nombre, tipo, fecha, precio, unidades);
				listaProductos.add(producto);
			}
			numLinea++;
		}
		logger.info("Creada la lista");
		System.out.println(listaProductos.size());
		System.out.println(listaProductos + "\n");
		return listaProductos;
	}

	public void cargarBaseDatos() {

		logger.info("Entrando a la base de datos");
		List<Productos> listaProductos;
		em.getTransaction().begin();

		try {
			listaProductos = leerFicheroProductos(
					"C:\\Users\\Tardes\\git\\cursogetafe2\\enunciados\\hibernate\\fichero_carga_ejercicio2.txt", 1);
			for (Productos producto : listaProductos) {
				logger.info("Producto " + producto);
				em.persist(producto);
			}

			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}

	}

	public List<Productos> consultaporFecha(String fechaConsulta) {
		List<Productos> productos;

		Query query = em.createQuery("from Productos p where p.fecha>=?1", Productos.class);
		logger.info("consulta hecha");

		query.setParameter(1, fechaConsulta);
		productos = query.getResultList();
		logger.info(productos);
		return productos;
	}

	public void mediaYtotalProductos() {
		List<Object[]> productos;

		Query query = em.createQuery(
				"SELECT po.tipo, AVG(precio) AS media_precio, SUM(unidades) AS suma_total from Productos po GROUP BY po.tipo");
		logger.info("consulta hecha");

		productos = query.getResultList();
		for (Object[] objects : productos) {
			System.out.println(objects[0] + " " + objects[1] + " " + objects[2]);
		}
	}

}
