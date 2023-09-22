package bucles;

import java.util.Scanner;

public class Apuestas {

	public static void main (String [] args) {
		
		int importe = 0;
		int apuesta = 0;
		int dado = 0;
		int num = 0;
		String res ="";		
		
		System.out.println("Por favor, indique el importe que pone en juego");
		Scanner scan = new Scanner(System.in);
		importe = scan.nextInt();
		
	do {
		System.out.println("¿Cuánto quieres apostar?");
		Scanner scan1 = new Scanner(System.in);
		apuesta = scan1.nextInt();
		
		for ( ;apuesta>importe;) {
			System.out.println("No puede realizar una apuesta superior al importe en juego");
			System.out.println("Por favor, vuelva a introducir una nueva apuesta");
			apuesta = scan1.nextInt();
		}
		
		
		System.out.println("¿Con qué número quieres apostar?");
		Scanner scan2 = new Scanner(System.in);
		num = scan2.nextInt();
		
		while (num==0 || num>6) {
			System.out.println("Número incorrecto, debe elegir número entre el 1 y 6");
			num = scan2.nextInt();
			} 
		
		dado = (int)(Math.random()*6)+1;
		
		if(dado==num) {
			apuesta*=3;
			importe+=apuesta;  // sysout
			} else {
			importe-=apuesta;  // sysout
		}
		
		System.out.println("¿Quiere seguir apostando?, Por favor, indicar SI o NO");
		Scanner scan3 = new Scanner(System.in);
		res = scan3.nextLine();
		
			if (res.equalsIgnoreCase("no")) {
				System.out.println("Gracias por apostar en nuestra plataforma, Hasta la Próxima");
			}break;
			
		} while (res.equalsIgnoreCase("Si"));
		
		
		
	}
	}
		
		
		
		

	

