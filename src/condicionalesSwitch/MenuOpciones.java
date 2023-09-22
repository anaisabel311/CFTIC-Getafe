package condicionalesSwitch;

import java.util.Scanner;

public class MenuOpciones {
	public static void main (String [] args) {
		
		
		 
		System.out.println("1. Opción 1");
		System.out.println("2. Opción 2");
		System.out.println("3. Opción 3");
		System.out.println("4. Opción 4");
		System.out.println("5. Salir");
		
		// String menu = "1. Opción1\n2. Opción 2\n3. Opción 3\n4. Opción 4\n5. Salir
		// System.out.println (menu);
		// System.out.println("Selecciona una opción");
		// Scanner scan = new Scanner(System.in);
		// int opcion = scan.nextInt();
		/*switch (opcion) {
		case 1: 
		case 2: 
		case 3: 
		case 4: System.out.println("Ha marcado la opción "+opcion);break;
		case 5: System.out.println("ADIOS");break;
		default: System.out.println ("La Opción introducida no es correcta"); }
		*/
		
		System.out.println("Por favor, marque una opción del menú");
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		
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
				break;	// para romper el swicth y que termine si algún CASE es correcto o salte al ELSE si la opción es incorrecta.
				
			case 2: System.out.println("Ha marcado la opción 2");break;
			case 3: System.out.println("Ha marcado la opción 3");break;
			case 4: System.out.println("Ha marcado la opción 4");break;
			default: System.out.println ("Adiós"); break;
			// if (!meses.equals(2")){
			//		system.out.println ("los meses de la estación " +estacion+ " son "+ meses);
			//}else {
			//		system.err.println ("La estación introducida no es correcta");
			//}
			
			}
		}else {
			System.out.println ("La Opción marcada es incorrecta, por favor, vuelva a introducir Opción según Menú");
		}
	
		
		
	}
		
}
