package bucles;

import java.util.Scanner;

public class BucleForAlumnos {
	
	public static void main (String[] args) {
		
		System.out.println("Por favor, introduzca el número de alumnos que hay en el aula");
		Scanner scan = new Scanner(System.in);
		int numalmn = scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		
		double nota =0;
		
				for (int num=1 ; num<=numalmn ; num++) {
					System.out.println("Introduce la nota"+num);
					nota += scan1.nextDouble();
				}	
			
				nota/=numalmn;
				
		System.out.println("La nota media del aula es " +nota);

	}
}
			
		
		
	


