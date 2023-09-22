package condicionales;

import java.util.Scanner;

public class ej2equals {
	
		public static void main(String[] args) {

			// Declarar la variable mes
			
			System.out.println("Introduce un mes");
			Scanner scan = new Scanner(System.in);
			String mes = scan.nextLine();

			// Se valida la variable mes, para saber si está bien escrito.

			

			if (mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("febrero") || mes.equalsIgnoreCase("marzo")
					|| mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("mayo") || mes.equalsIgnoreCase("Junio")
					|| mes.equalsIgnoreCase("julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("septiembre")
					|| mes.equalsIgnoreCase("octubre") || mes.equalsIgnoreCase("noviembre")
					|| mes.equalsIgnoreCase("diciembre")) {
			} else {

				System.out.println(" El mes es incorrecto, vuelva a introducir bien escrito el Mes, por favor.");
			}

			// Dependiendo del mes, indicar la estación del año.

			if (mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("febrero") || mes.equalsIgnoreCase("marzo")) {
				System.out.println(" Es Invierno");
			} else if (mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("mayo") || mes.equalsIgnoreCase("Junio")) {
				System.out.println(" Es Primavera");
			} else if (mes.equalsIgnoreCase("julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("septiembre")) {
				System.out.println(" Es Verano");
			} else {
				if (mes.equalsIgnoreCase("noviembre") || mes.equalsIgnoreCase("octubre")|| mes.equalsIgnoreCase("diciembre")) {
					System.out.println(" Es Otoño");
				}
			}
		}
	}

