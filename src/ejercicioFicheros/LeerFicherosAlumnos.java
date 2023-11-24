package ejercicioFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import colecciones.Alumno;



public class LeerFicherosAlumnos {
	
	private static final Logger logger = LogManager.getLogger(LeerFicherosAlumnos.class);

	private static String nombreArchivo;
		
	public static void main(String[] args) throws IOException {

		nombreArchivo = "C:\\Users\\Tardes\\Desktop\\workspace\\ProyectoJava\\directorios2\\dir2\\alumnos.txt";
//		String nombreArchivo2 = "./directorios2/dir1";
		LeerFicherosAlumnos servicio = new LeerFicherosAlumnos();
		servicio.leerArchivo3(nombreArchivo).size();
		
        
	}      
	
	 public List<Alumno> leerArchivo3 (String nombre) throws IOException{
			Path path = Paths.get(nombre);
			StringBuilder sb = new StringBuilder();

			List<String> lines = Files.readAllLines(path);
			
			logger.info (lines);
			
			List<Alumno> listAlumnos = new ArrayList <Alumno>(); 
			
			String line = ""; // en esta variable string se guarda cada linea del fichero.
			
			try (BufferedReader br = new BufferedReader (new FileReader(nombreArchivo))){
			
				while ((line = br.readLine()) !=null) {
					String [] alumno = line.split("\\|"); // el split nos devuelve un array de strings por cada campo en el que separa la información.
					
					String na = alumno [0];	
					logger.info(na);                
					String aa = alumno [1];
					logger.info(aa);
					String da = alumno [2];
					logger.info(da);
					double nta = Double.parseDouble(alumno [3]);
					logger.info(nta);
					boolean isVip = alumno[4].equals("1");
					logger.info(isVip);
					
					listAlumnos.add(new Alumno (na,aa,da,nta,isVip));
				}
			
			}catch(Exception e) {
					

			}

			return listAlumnos;
		}

	
	
	
}
