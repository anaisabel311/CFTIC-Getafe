package bucles;

import java.util.Scanner;

public class ConjeturaCollatz {
	public static void main (String[] args) {
		
		System.out.println("Por favor, introduzca un número distinto a 1");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
	for (; num==1 || num==0; num = scan.nextInt() )  {
	System.out.println("De primeras, debe meter un numero distinto a 1");	
	}
								
//	for ( ;num!=1;) {
//	if (num%2==0) {
//		num/=2;
//			System.out.println(num);
//		} else {
//			num=(num*3)+1;
//			System.out.println(num);	
//		}
//	}
//	System.out.println("La conjetura ha sido probada");
	
	
	
// OPERADOR TERNARIO
// a la izquierda de la interrogación es la condición
// el SI se situa a la derecha de la interrogación
// y el ELSE después de los (:)
//		num = num%2==0 ? num/=2 : num*3+1;
		
// BUCLES WHILE
//		while (num!=1) {
//			num = num%2==0 ? num/=2 : num*3+1; (no funciona, mirar a ver)
//		}
	
	
	while (num!=1) {
		if (num%2==0) {
			num/=2;
				System.out.println(num);
			} else {				num=(num*3)+1;
				System.out.println(num);	
			}
		
		
	}
	System.out.println("La conjetura ha sido probada");
}
}



