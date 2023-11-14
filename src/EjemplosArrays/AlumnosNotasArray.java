package EjemplosArrays;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import DDBB.ConexionBaseDeDatos;

public class AlumnosNotasArray {
	
	private static final Logger Logger = LogManager.getLogger(AlumnosNotasArray.class);
	
	public static void main(String[] args) {
		
		String [] alumnosNotas = {"Alumno1:9", "Alumno2:8", "Alumno3:3", "Alumno4:4", "Alumno5:5", "Alumno6:10", "Alumno7:4"};
		int aprobados = 0;
		
		
		
		for (int i=0 ; i<alumnosNotas.length ; i++) {
			String dato = alumnosNotas[i];
			int dosPuntos = dato.indexOf (":");
			String nombre = dato.substring(0, dosPuntos);
			System.out.println (nombre);
			String nota = dato.substring(dosPuntos+1);
			System.out.println (nota);
	
			int notas = Integer.parseInt(nota);
//			System.out.println ("nota: "+notas*3);

// SE CALCULA LA CANTIDAD DE ALUMNOS APROBADOS
			
			if (notas >=5) {
				aprobados ++;				
			}
		}
// SE CREA UN ARRAY CON EL NUMERO DE ALUMNOS APROBADOS
		
			System.out.println ("El número de alumnos aprobados son " + aprobados);
			String [] alumnosAprobados = new String [aprobados];
			aprobados = 0;
			
// MOSTRAR LOS NOMBRES DE LOS ALUMNOS APROBADOS
			
			for (int i=0 ; i<alumnosNotas.length ; i++) {
				String dato = alumnosNotas[i];
				int dosPuntos = dato.indexOf (":");
				String nombre = dato.substring(0, dosPuntos);
				String nota = dato.substring(dosPuntos+1);
				int notas = Integer.parseInt(nota);		
				if (notas >=5) {
					Logger.info("EL ALUMNO ESTÁ APROBADO");
					alumnosAprobados [aprobados] = nombre;
					aprobados ++;
				}	
					}
			for (String alumnosok : alumnosAprobados) {
				System.out.println (alumnosok);
			}	
	}
				
			}
			
			
			
		
		
		
		
	
		
		
		
		
		

			
		
		
		
		
		
	 

