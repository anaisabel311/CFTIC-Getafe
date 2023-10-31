package mapas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapaListadoAlumnos {

	public static void main(String[] args) {

		MapaListadoAlumnos alu = new MapaListadoAlumnos();
		alu.iniciarEjercicio();
	}


	public void iniciarEjercicio() {

		generaAlumnos();
	}	

	
	
	
	
	public Map<String,List<Alumno>> generaAlumnos (){

		List<Alumno> colegioMayor = null;

			Alumno alumno1 = new Alumno ("DNI1", "JOSÉ", "SEVILLA PÉREZ", 5.2, "COLEGIO MAYOR");
			Alumno alumno2 = new Alumno ("DNI2", "AMALIA", "LOPEZ FERNANDEZ", 7.5, "COLEGIO MAYOR");
			Alumno alumno3 = new Alumno ("DNI3", "CRISTINA", "RODRIGUEZ GONZÁLEZ", 4, "COLEGIO MAYOR");
			Alumno alumno4 = new Alumno ("DNI4", "IVÁN", "CALDERON CALLEJA", 2, "COLEGIO MAYOR");

			colegioMayor = Arrays.asList(alumno1, alumno2, alumno3, alumno4);
			
			System.out.println(colegioMayor);


		List<Alumno> colegioMarianistas = null;

			Alumno alumno5 = new Alumno ("dni5", "álvaro", "yeste infante", 5.2, "colegio marianistas");
			Alumno alumno6 = new Alumno ("dni6", "rocio", "cardeñas lópez", 7.5, "colegio marianistas");
			Alumno alumno7 = new Alumno ("dni7", "fernando", "rodriguez gonzález", 4, "colegio marianistas");
			Alumno alumno8 = new Alumno ("dni8", "patricia", "calderon calleja", 2, "colegio marianistas");

			colegioMarianistas = Arrays.asList(alumno5, alumno6, alumno7, alumno8);
			
			System.out.println(colegioMarianistas);

			Map<String,List<Alumno>> mapaColegios = new HashMap<String,List<Alumno>>();
			
			mapaColegios.put("Colegio Marianistas", colegioMarianistas);
			mapaColegios.put("Colegio Mayor", colegioMayor);
			
		return mapaColegios;			

	}	


}
