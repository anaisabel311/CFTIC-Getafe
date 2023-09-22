package condicionales;

import java.util.Scanner;

public class Adivinanza {
	public static void main (String [] args) {
		
		System.out.println(("En este banco está sentado") + ("\tun padre y un hijo") + ("\tel padre se llama Juan") + ("\ty el hijo, ya te lo he dicho"));
		Scanner scan = new Scanner(System.in);
		String respuesta = scan.nextLine();
		
		if (respuesta.equalsIgnoreCase ("Esteban")) {
			System.out.println("ENHORABUENA, ACERTASTE LA ADIVINANZA");
		}else {
			System.out.println("LO SIENTO, INTÉNTALO OTRA VEZ");
		}
	}
	
}
