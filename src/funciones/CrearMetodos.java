package funciones;

import java.util.Scanner;

public class CrearMetodos {

	public static void main (String [] args) {
		
// CALCULO EDAD
		
		System.out.println("Por favor, introduzca su año de nacimiento");
		Scanner scan = new Scanner(System.in);
		String anioNacimiento = scan.nextLine();	
		
		int edad = CalcularEdad.calculaEdad(anioNacimiento);
		
		
		System.out.println ("Su edad es "+ edad + " años");
		
// TABLA MULTIPLICAR
		
		System.out.println("Por favor, introduzca un número que quiera mostrar su tabla de multiplicar");
		Scanner scan1 = new Scanner(System.in);
		int num = scan1.nextInt ();	
		
		TablaMultiplicar.calculoTablaMultiplicar (num);
		
// DEVOLVER UN ARRAY DE STRINGS
		
		System.out.println("Por favor, introduzca el texto que quiere repetir");
		Scanner scan2 = new Scanner(System.in);
		String texto = scan2.nextLine();	
		
		System.out.println("Por favor, introduzca un número de veces que quiere repetir el texto");
		Scanner scan3 = new Scanner(System.in);
		int rep = scan3.nextInt ();		
		
		DevolverTexto.juntaDatos (texto, rep);
		
		for (String dato: DevolverTexto.juntaDatos (texto, rep)) {
			System.out.println (dato);
		}
		
	// DEVOLVER UN ARRAY DE STRINGS	DIFICIL HOLA HOL HO O H	
		
		String [] array =  DevolverTexto.juntaDatosDificil(texto, rep);
		
		for (String dato: array) {
			System.out.println (dato);
		}
		
		
	// DAR VELOCIDAD DE UN VEHICULO EN M/SEG
		
		System.out.println("Por favor, introduzca la distancia recorrida en metros");
		Scanner scan4 = new Scanner(System.in);
		Double distancia = scan4.nextDouble();	
		
		System.out.println("Por favor, introduzca el tiempo empleado");
		Scanner scan5 = new Scanner(System.in);
		int tiempo = scan5.nextInt ();		
		
		VelocidadMSeg.calculaVel(distancia, tiempo);
			
	// DEVOLVER UN ARRAY ELIMINADO UN CARACTER DEL TEXTO POR CADA REPETICIÓN
		
	 }
	}
	 

