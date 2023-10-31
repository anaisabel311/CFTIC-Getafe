package mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Utilidades.Utilidades;

public class MapaAlumnos {

	
	
	public static void main (String [] args) {
		
// Creamos el mapa con esta estructura.	Ahora está vacio.	
		
		Map<String,Alumno> mapa1 = new HashMap<String,Alumno>();
	
// Creamos 4 objetos tipo alumnos.
	
	Alumno alumno1 = new Alumno ("DNI1", "JOSÉ", "SEVILLA PÉREZ", 5.2);
	Alumno alumno2 = new Alumno ("DNI2", "AMALIA", "LOPEZ FERNANDEZ", 7.5);
	Alumno alumno3 = new Alumno ("DNI3", "CRISTINA", "RODRIGUEZ GONZÁLEZ", 4);
	Alumno alumno4 = new Alumno ("DNI4", "IVÁN", "CALDERON CALLEJA", 2);
	

// Introducimos los valores en el mapa.
	
	mapa1.put(alumno1.getDni(), alumno1);
	mapa1.put(alumno2.getDni(), alumno2);
	mapa1.put(alumno3.getDni(), alumno3);
	mapa1.put(alumno4.getDni(), alumno4);
	
// Accedemos a todas las claves. No haría falta acceder a las claves, sólo a los valores.
	
	System.out.println(mapa1.size());
	
	Collection<Alumno> alumnos = mapa1.values();
	for (Alumno alumno : alumnos) {
		System.out.println(alumno);
	}
	
// 	Pedir un DNI y mirar si está el alumno.
	
	String dato = Utilidades.pideDatoTexto("POR FAVOR, INTRODUCE UN DNI");
	verificarDNI(dato, mapa1);
	notaMediaAlumno (mapa1);

	
}

	
//	Mirar si está el alumno en el mapa
	
	static public void verificarDNI (String dato, Map<String,Alumno> mapa1) {

		boolean result = false;
		
		Set<String> claves = mapa1.keySet();
		for (String dni : claves) {

			if (dato.equalsIgnoreCase(dni)) {

				System.out.println(mapa1.get(dni).toString());
				result = true;
			}

		}
		
		if (!result) {
			System.out.println("DNI INTRODUCIDO NO EXISTE");	
		}


	}

// Mostrar nota media de cada alumno
	
	public static void notaMediaAlumno(Map<String,Alumno> mapa1) {
		double media = 0;
		Set<String> claves = mapa1.keySet();
		for (String dni : claves) {
			
// AUNQUE YO DEBA ACCEDER A LA CLAVE, ME ESTÁ PINTANDO SÓLO LAS NOTAS.
			
			System.out.println(mapa1.get(dni).getNota());
			
		media += mapa1.get(dni).getNota ();	
		
		}
		
		System.out.println("La media de las notas de todos los alumnos "
				+ "es "+ (media/mapa1.size()));	
	}
	
	


}