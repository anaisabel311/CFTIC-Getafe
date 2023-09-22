package bucles;

import java.util.Scanner;

public class MenuDoWhile {
	
	
	public static void main (String [] args) {
		
		int opcion; // las variables que utilice en el while ();, tienen que estar declaradas fueras del DO, ya que el while está fuera de la {} del DO
		do { 
			System.out.println("1. Opción 1");
			System.out.println("2. Opción 2");
			System.out.println("3. Opción 3");
			System.out.println("4. Opción 4");
			System.out.println("5. Salir");
	
			System.out.println("Por favor, marque una opción del menú");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			if (opcion >=1 && opcion <= 5) {
				switch (opcion) {
				case 1: 
					System.out.println("Por favor, introduce una estación del año");
					Scanner scan1 = new Scanner(System.in);
					String estacion = scan1.nextLine();
					estacion = estacion.toLowerCase();
					switch (estacion) {
						case "primavera": System.out.println ("Las estaciones de Primavera son \nAbril \nMayo \nJunio"); break;
						case "verano":System.out.println ("Las estaciones de Verano son \nJulio \nAgosto \nSeptiembre"); break;
						case "otoño":System.out.println ("Las estaciones de Otoño son \nOctubre \nNoviembre \nDiciembre"); break;
						case "invierno":System.out.println ("Las estaciones de Invierno son \nEnero \nFebrero \nMarzo"); break;
					default: System.out.println ("Por favor, escriba bien la estación"); break;
					}
					break;	
					
				case 2: System.out.println("Ha marcado la opción 2");break;
				case 3: System.out.println("Ha marcado la opción 3");break;
				case 4: System.out.println("Ha marcado la opción 4");break;
				default: System.out.println ("Adiós"); break;
				
				}
			 }else {
				System.out.println ("La Opción marcada es incorrecta, por favor, vuelva a introducir Opción según Menú");
			}
		} while (opcion <= 4);
		
	}	
}


