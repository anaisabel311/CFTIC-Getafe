package bucles;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main (String[] args) {
		
		System.out.println("Por favor, introduzca el número de números que quiere mostrar de la Serie Fibonacci");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int a = 0;
		int b = 1;
		int r = 0;	
		num-=2;
		System.out.println(a);
		System.out.println(b);
		
		for ( ; num!=0 ;num-=1) {
			r=a+b; 
			System.out.println(r);
			a=b;
			b=r;
		}
		
		
}
}