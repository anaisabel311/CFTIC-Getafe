package pOO;

import java.util.Scanner;

public class CasaDeApuestas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
// CREO LOS CABALLOS
		
		Caballo caballo1 = new Caballo (1, "AMISTOSO", 1, 10, 300, 350);
		Caballo caballo2 = new Caballo (2, "BELLO", 2, 15, 47, 375);
		Caballo caballo3 = new Caballo (3, "AZABACHE", 3, 7, 450, 400);
		Caballo caballo4 = new Caballo (4, "VELOZ", 4, 10, 45, 250);
		Caballo caballo5 = new Caballo (5, "RISUEÑO", 5, 15, 40, 350);
		Caballo caballo6 = new Caballo (6, "PINTADO", 6, 12, 50, 390);
	
// CREO LA CARRERA1
		Caballo [] arrayCaballos1 = {caballo1, caballo2, caballo3, caballo4};
		Carrera carrera1 = new Carrera (arrayCaballos1, 1,"Carrera de Mañana", 2000);
		
	// Invoco el método CARRERA pasándole una variable.
		
		//System.out.println ("===== EMPIEZA LA CARRERA DE MAÑANA =====");		
		//carrera1.iniciarCarrera();
		//System.out.println ("====TERMINA LA CARRERA DE MANAÑA =====");
		
// CREO LA CARRERA2		
		Caballo [] arrayCaballos2 = {caballo3, caballo5, caballo6, caballo4};
		Carrera carrera2 = new Carrera (arrayCaballos2, 2, "Carrera de Tarde", 2000);
		
	//	Invoco el método CARRERA pasándole una variable.
		
		//System.out.println ("===== EMPIEZA LA CARRERA DE TARDE =====");
		//carrera2.iniciarCarrera();
		//System.out.println ("===== TERMINA LA CARRERA DE TARDE =====");
		
// CREO LA CARRERA2		
		
		Caballo [] arrayCaballos3 = {caballo1, caballo2, caballo6, caballo5};
		Carrera carrera3 = new Carrera (arrayCaballos3, 3, "Carrera de Noche", 2000);
		
	//	Invoco el método CARRERA pasándole una variable.
		
//		System.out.println ("===== EMPIEZA LA CARRERA DE NOCHE =====");
//		carrera3.iniciarCarrera();
//		System.out.println ("===== TERMINA LA CARRERA DE NOCHE =====");
		
// CREO GRAN PREMIO
		
		Carrera [] granPremioCarrera = {carrera1, carrera2, carrera3};
		GranPremioCaballos granPremio = new GranPremioCaballos (10, "Gran Premio", granPremioCarrera);
		//granPremio.empezarGranPremio();
		// 	Invoco el método Gran Premio
		
		System.out.println ("===== EMPIEZA EL GRAN PREMIO =====");
		granPremio.empezarGranPremio ();
	
			
		
// CREAR APOSTANTES	
	
		Apostante apostante1 = new Apostante ("Paco", 1000 , 0);
		Apostante apostante2 = new Apostante ("Manuel", 5000, 0);
		
		
// MUESTRO LAS CARRERAS Y LOS PARTICIPANTES EN CADA CARRERA.
		
		for (Carrera carreras : granPremioCarrera) {
			
			System.out.println ("LOS CABALLOS PARTICIPANTES EN LA CADA CARRERA SON LOS SIGUIENTES " + carreras.getNombre());
			
			for ( Caballo caballo :carreras.getCaballos()){
				
				System.out.println ("LOS CABALLOS PARTICIPANTES SON LOS SIGUIENTES: " + caballo.getNombre() + "\t" + caballo.getId ());
				
			}
		}
		
// PREGUNTO POR LAS APUESTAS
		
		Scanner scan = new Scanner(System.in);
		System.out.println(("Apostante 1 : Introduzca el importe que quiere apostar"));
		apostante1.setApuesta(scan.nextDouble());
		
		System.out.println(("Apostante 2 : Introduzca el importe que quiere apostar"));
		apostante2.setApuesta(scan.nextDouble());
		
		
		
		System.out.println ("Por favor,¿en qué carrera quiere apostar?");
		String nomCarrera = scan.toString();
		
		if (nomCarrera.equalsIgnoreCase("Carrera de Mañana") ) {
			CasaDeApuestas cda = new CasaDeApuestas();
			cda.caballoExiste (carrera1);
			
//		int caballoGanador = carrera.iniciarCarrera();	 mirar el tipo de variable que recoge y dónde lo guarda, necesito el caballo ganador de la carrera
//		para comparar con la apuesta del apostante.			
			
			

		}
	}

	
// MÉTODO COMPRUEBO QUE EXISTE EL CABALLO EN LA CARRERA SELECCIONADA
	
   public void caballoExiste (Carrera carreras) {
			System.out.println ("Por favor, introduzca el num del caballo con el que quiere apostar?");
			Scanner scan = new Scanner(System.in);
			long idCaballo = scan.nextLong ();
			
			for ( Caballo caballo : carreras.getCaballos()){
					if (idCaballo == caballo.getId()) {
					break;	
						
					}
				
			}
   }			
			
		
}
	
	
	
	


