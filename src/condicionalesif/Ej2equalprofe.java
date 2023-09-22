package condicionales;

import java.util.Scanner;

public class Ej2equalprofe {

	public static void main (String [] args) {
			
			
			String estacion = "";
			System.out.println("Introduce un mes");
			Scanner scan = new Scanner(System.in);
			String mes = scan.nextLine();

		if (mes.equalsIgnoreCase("enero")|| mes.equalsIgnoreCase("febrero") || mes.equalsIgnoreCase ("marzo")) {
			estacion = "invierno";
			}else if (mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("mayo") || mes.equalsIgnoreCase("junio")) { 
			estacion = "primavera";
			}else if (mes.equalsIgnoreCase("julio") ||mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("septiembre")) {
			estacion = "verano";
			}else { if (mes.equalsIgnoreCase("octubre")||mes.equalsIgnoreCase("noviembre")||mes.equalsIgnoreCase("diciembre")) {
			estacion = "otoño";
			
			}else {
			System.out.println (" Mes Incorrecto ");
			
			System.out.println (" Estás en " +estacion);
}
}
			}
	}
}

			