package EjemplosArrays;

import java.util.Scanner;

public class Colegio {

	public static void main(String[] args) {

//PREGUNTAR CUÁNTAS AULAS TIENE EL COLE Y CREAR LOS ARRAYS POR AULAS.

		Scanner scan = new Scanner(System.in);
		System.out.println(("Introduzca el número de aulas que tiene el cole"));
		int numAulas = scan.nextInt();
		String[][] cole = new String[numAulas][];

		for (int aulas = 0; aulas < cole.length; aulas++) {
			System.out.println(("Introduzca el número de plazas que tiene el aula " + (aulas + 1)));
			int numPlazas = scan.nextInt();
			cole[aulas] = new String[numPlazas];
		}

// COMPRUEBO QUE CREO BIEN LAS MATRICES

//		for (int i=0; i<cole.length; i++) {
//			for (int j=0; j<cole[i].length; j++) {
//				System.out.print (cole [i][j]);
//			}
//			System.out.println("\n");
//			}

// CREAR EL MENÚ

		int opcion = 0;
do {
		
		System.out.println("Seleccione una opción\t");
		String menu = "\n 1.Insertar Datos Alumno\n 2.Mostrar Alumnos por Aula\n 3.Mostrar Alumnos Aprobados en el colegio\n 4.Buscar Alumno\n 5.Borrar Alumno\n 6.Salir";
		System.out.println(menu);
		Scanner scan1 = new Scanner(System.in);
		opcion = scan1.nextInt();
		System.out.println(opcion);

	
		switch (opcion) {
		case 1:
			System.out.println("Ha seleccionado Insertar Datos Alumno");
			System.out.println("¿En qué Aula quiere matricular al Alumno");
			Scanner scan2 = new Scanner(System.in);
			int opAula = scan2.nextInt();

// COMPRUEBO QUE EL AULA EXISTE

			for (; opAula > cole.length; opAula = scan2.nextInt()) {
				System.out.println("No existe éste Aula, las aulas abiertas son desde el 1 hasta " + numAulas);
				System.out.println("Por favor vuelva a introducir opción");
			}

// PIDO LOS DATOS Y LOS GUARDO EN EL AULA.
			
//			String [] aula = cole [opAula - 1];		// meto en una variable los datos de ese aula, si quiero trabajar con un
			//array unidimensional.

		boolean claseLlena=false;
			for (int plazas = 0; plazas < cole.length; plazas++) { // realizará éste for hasta que las plazas queden llenas

					if (cole[opAula-1][plazas] == null) {
						claseLlena=true;
						System.out.println ("Plaza Libre" + cole [opAula-1][plazas]);
						System.out.println("Introduzca el Nombre del Alumno\t");
						Scanner scan3 = new Scanner(System.in);
						String nombre = scan3.nextLine();
						
						System.out.println("Introduzca el DNI del Alumno\t");
						String dni = scan3.nextLine();
						
						System.out.println("Introduzca la Nota del Alumno\t");
						String nota = scan3.nextLine();
						
						cole[opAula-1][plazas] = nombre + ":" + dni + ":" + nota;

						break; // para cortar el bucle, sino, te obliga a rellenar toda la clase
					} 
					
			}
			if (claseLlena) {
			System.out.println("No quedan más plazas en el Aula " + (opAula-1) + " Por favor, pruebe en otro Aula");
			}
			
		break;	
	case 2:System.out.println ("Ha seleccionado Mostrar Datos Alumno");
	
// MUESTRO LOS ALUMNOS RECORRIENDO LA MATRIZ Y CON UN SPLIT
		
		for (int i=0 ; i<cole.length; i++) {
			for (int j=0 ; j<cole[i].length; j++) {
				String datosAlumno = cole [i][j];
				
				if (datosAlumno != null) { // hay que mirar que haya datos, sino, el split no funciona.
					
					String [] datosAlumnosArray = datosAlumno.split(":");
					System.out.println ("\t"+datosAlumnosArray [0]+" " + datosAlumnosArray [1]+" "+ datosAlumnosArray [2]);
				}
			
			}
			}break;
			
	case 3:System.out.println ("Ha seleccionado Mostrar Alumnos Aprobados");
	
	for (int i=0 ; i<cole.length; i++) {
		for (int j=0 ; j<cole[i].length; j++) {
			String datosAlumno = cole [i][j];
			
			if (datosAlumno != null) { // hay que mirar que haya datos, sino, el split no funciona.
				
				String [] datosAlumnosArray = datosAlumno.split(":");
				int nota = Integer.parseInt (datosAlumnosArray[2]);
					if (nota >= 5) {
						System.out.println ("\t"+datosAlumnosArray [0]+" " + datosAlumnosArray [1]+" "+ datosAlumnosArray [2]);
					}
			}	
		
		}
		}break;
	
	
	
	
	
	
//	case 4:System.out.println ("Ha seleccionado Buscar Alumno");break;
//	case 5:System.out.println ("Ha seleccionado Borrar Alumno");break;
//	case 6:System.out.println ("Adiós"); break;
	default: System.out.println ("Opción Incorrecta");	

} 

} while (opcion !=6);
	}
}	