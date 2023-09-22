package condicionalesSwitch;

import java.util.Scanner;

public class Ej2equalprofe {

	public static void main (String [] args) {
			
			
			String estacion = "";
			System.out.println("Introduce un mes");
			Scanner scan = new Scanner(System.in);
			String mes = scan.nextLine();
			// mes = mes.toLowerCase();  - te convierte la variable todo en minúsculas.
			
		
			switch (mes) {
			case "enero":
			case "febrero":
			case "marzo":
			estacion = "invierno";break;
			// System.out.println (" Estás en " +estacion);break;			
			case "abril":
			case "mayo":
			case "junio": 
			estacion = "primavera"; break;
			// System.out.println (" Estás en " +estacion);break;
			case "julio":
			case "agosto":
			case "septiembre":
			estacion = "verano"; break;
			// System.out.println (" Estás en " +estacion);break;
			case "octubre":
			case "noviembre":
			case "diciembre":
			estacion = "otoño"; break;
			// System.out.println (" Estás en " +estacion);break;
			default:
			System.out.println (" Mes Incorrecto ");
						}
			System.out.println (" Estás en " +estacion);
			// cuando se escribe mal el mes, no funciona, sale la frase del último system.out (MIRAR)
			// para así, sólo escribir un system.out con la estación.
	}
}

			