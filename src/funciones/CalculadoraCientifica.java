package funciones;

import java.util.Scanner;

import Utilidades.Utilidades;

public class CalculadoraCientifica {

	final static String [] OPCIONES_MENU_ARRAY = {"1. SUMAR.","2. RESTAR",
			"3. MULTIPLICAR", "4. DIVIDIR"
			, "5. CALCULADORA CIENTIFICA"
			, "6. APAGAR"} ;
	
	
	final static String [] OPCIONES_MENU_CIENTIFICA = {"1. POTENCIA.","2. RAIZ CUADRADA",
			"3. SENO", "4. COSENO"
			, "5. VOLVER A MENU CALCULADORA"} ;
	
	
	public static void main (String [] args) {
		
	
// PINTAR PRIMER MENÚ CALCULADORA
		
		int opcion = 0;
		double valor = 0;
		
		
		do {
			opcion = Utilidades.pintarMenu(OPCIONES_MENU,"Introduce valor (1-6)",":");
			
			switch (opcion) {
				case 1: int resultado = Utilidades.sumar (valor);
						System.out.println ("el resultado es " + resultado);
						break;
						
				case 2:  break;
				case 3:  break;
				case 4:  break;
				case 5:  break;
				case 6:  break;

			System.out.println("Adios");
					break;
				default:
					System.out.println("Opción incorrecta");
			
			}
			
		}while(opcion!=6);
		
		
		
		
		
			
		
		
		
		
		
		
		
	}
	
	
	
// FUNCIÓN PINTAR PRIMER MENÚ
	
		
	
	}
	
	

