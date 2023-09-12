package EjemplosArrays;

import java.util.Scanner;

public class ColoresArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(("Introduzca el número de colores que quiere escribir"));
		int colores = scan.nextInt();
		String [] NombreColor = new String [colores];
		
		System.out.println (NombreColor.length);
		
		for (int i=0; i<NombreColor.length ; i++){
			System.out.println(("Introduzca el nombre del color " + i));
			scan = new Scanner(System.in);
			NombreColor [i] = scan.nextLine ().trim().toLowerCase();
		}
		
		for (int i=0; i<NombreColor.length ; i++){
			if (NombreColor[i].startsWith("a") && NombreColor[i].contains("o")) {
// se puede utilizar charAt: if (NombreColor[i].chartAt(0)=='a' && 	NombreColor[i].contains("o"))			
				System.out.println((NombreColor [i] +" Este color empieza por A y contine O"));	
			}
		}
		

// Bucle for-each,		
		for (String Color : NombreColor) {
			System.out.println(Color);
		}
			
	}
}
