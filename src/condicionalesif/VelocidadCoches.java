package condicionalesif;

import java.util.Scanner;

public class VelocidadCoches {

public static void main (String[] args) {
		
		System.out.println("Por favor, introduzca el número de coches a estudiar");
		Scanner scan = new Scanner(System.in);
		int coches = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		
		int velocidadminima = 500;
		int velocidadcoche =0;
		
				for (int numc=1 ; numc<=coches ; numc++) {
					System.out.println("Introduce la velocidad del coche "+numc);
					velocidadcoche = scan2.nextInt();
					
					if (velocidadcoche<velocidadminima)  {
						velocidadminima = velocidadcoche;
						System.out.println("La velocidad mín es "+ velocidadminima);
					} 
				}		
					
			
}
}
