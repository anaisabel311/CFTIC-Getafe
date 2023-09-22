package condicionales;

import java.util.Scanner;

public class EdadesDelHombre {

	public static void main(String[] args) {

		System.out.println("Por favor, introduzca su nombre");
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();

		System.out.println("Por favor, introduzca su edad");
		int edad = scan.nextInt();

		if (edad >= 0 && edad <= 5) {
			System.out.println("Usted es un bebé");
		} else {
			if (edad >= 6 && edad <= 15) {
				System.out.println("Usted es un niño");
			} else {
				if (edad >= 16 && edad <= 20) {
					System.out.println("Usted es un adolescente");
				} else {
					if (edad >= 21 && edad <= 40) {
						System.out.println("Usted es joven");
					} else {
						if (edad >= 41 && edad <= 60) {
							System.out.println("Usted es adulto");
					} else {
						if (edad >= 61 && edad <= 80) {
							System.out.println("Usted es viejoven");
					} else {
						if (edad >= 81 && edad <= 100) {
							System.out.println("ENHORABUENA, SE SALE DE LAS ESTADÍSTICAS");
					} else {
					  System.out.println("¿¿TIENE MÁS DE 100 AÑOS?? WAU!!!");	
				}
						
			}

		}
	}
}
}
}
}
}