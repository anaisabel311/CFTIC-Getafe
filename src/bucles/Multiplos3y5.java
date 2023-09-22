package bucles;

import java.util.Scanner;

public class Multiplos3y5 {

	public static void main (String [] args) {
		
		System.out.println ("Por favor, introduzca 10 números");
		int mul3=0;
		int mul5=0;
			
			for (int cont=1; cont<=10 ; cont++) {
				Scanner scan1 = new Scanner(System.in);
				int num = scan1.nextInt();
				if (num%3==0) {
					System.out.println (num + " Éste número es múltiplo de 3");	
					mul3++;
				} 
					if (num%5==0) {
					    System.out.println (num + " Éste número es múltiplo de 5");	
					    mul5++;
					}
			}
			System.out.println ("Hay "+ mul3 + " números múltiplos de 3");
			System.out.println ("Hay "+ mul5 + " números múltiplos de 5");
		
		
	}
 }

