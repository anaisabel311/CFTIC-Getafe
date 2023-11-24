package ejercicioFicheros;

import java.io.File;
import java.nio.file.Files;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MostrarFicheros {

	private static final Logger logger = LogManager.getLogger(MostrarFicheros.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File ("C:\\Users\\Tardes\\Desktop\\workspace\\ProyectoJava\\directorios2");
		MostrarFicheros mf = new MostrarFicheros ();
		mf.mostrarContenidoDirectorio(dir);
		mf.mostrarFicheroAñoActual(dir);
		mf.renombrarFichero (dir);
		

	}

	public void mostrarContenidoDirectorio(File directorio) {
		
		Files dir = new Files (directorio);
		logger.info(dir);
		int i = 0;

		String[] ficheros = dir.list();
		logger.debug("Fichero insertado en array");
		for (String nombreFichero : ficheros) {
			System.out.println(nombreFichero);
			File nuevoFichero = new File(dir, nombreFichero);
			
			if (nuevoFichero.isFile() && nuevoFichero.getName().endsWith(".jpg")) {
				i++;
			}
		}
		System.out.println("Hay " + i + " archivos .jpg");
		if (i == ficheros.length && !dir.isFile()) {
			System.err.println("No hay ficheros .jpg");
		}

		logger.info(dir.isFile());

	}
	
	
	public void mostrarFicheroAñoActual (File directorio) {
		
		File dir = new File(directorio);
		String[] ficheros = dir.list();
		
		for (String nombreFichero : ficheros) {
			System.out.println(nombreFichero);
			File nuevoFichero = new File(dir, nombreFichero);
			if (nuevoFichero.lastModified()== 2023) {
			//	i++;
			}
		}
	}
	
	
	
	
	public void renombrarFichero (File directorio) {
		
		File[] files = directorio.listFiles();
		
		for (File file:files) {
			
			if (file.getName().equalsIgnoreCase("asdasd.txt.done")) {
				
				File nombreNuevo = new File (directorio, "RenombrarArchivo");
				boolean cn = file.renameTo(nombreNuevo); // el método renameTo necesita un objeto de tipo FILE.
				if (cn) {
					logger.info("Directorio renombrado");
				} else {
					logger.info("No se puedo renombrar");
				}
				
			}
			
			
		}
		
		
	}
}
