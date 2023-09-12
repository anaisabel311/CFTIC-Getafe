package EjemplosArrays;

import java.util.Scanner;

public class Matriz {
 
	public static void main (String [] args) {
		
// CREO LA MATRIZ CON LOS DATOS QUE ME DA
		
		Scanner scan = new Scanner(System.in);
		System.out.println(("Introduzca el número de filas que quiere en la matriz"));
		int num = scan.nextInt();
		
		int [][] matriz = new int [num][num];
		

// PIDO LOS DATOS Y LOS GUARDO EN LA MATRIZ
		

	for (int f =0 ; f<matriz.length; f++) {	
		
		for ( int c=0 ; c<matriz [f].length; c++) {
			System.out.println(("Introduzca el número que quiere guardar en la posición ")+ f + ";" + c );
///			System.out.println("Introduzca el número que quiere guardar en la posición ["+ f +"],["+ c+"}])
			int dato = scan.nextInt();
			matriz [f][c] = dato;
		}
	}	
		
// COMPRUEBO QUE LO GUARDA BIEN EN LA MATRIZ
	for( int [] fila : matriz ) {
				
		for (int dato : fila) {
			System.out.print(dato);
		}
	System.out.print("\n");	
	
	}

//CREAR UN ARRAY UNI CON LOS DATOS DE LA DIAGONAL DE IZDA A DCHA DE LA MATRIZ
	
	int [] diagonal = new int [num];
	
	for ( int f=0 ; f<matriz.length; f++) {
//		int c = f; al ser coincidir el numero de fila y columnas, puedes utilizar sólo una variable.
//		diagonal [f] = matriz [f][c]; no haría falta igualar las 2 variables, ya que con una variable se puede trabajar.
		diagonal [f] = matriz [f][f];
		
	}
	
// MUESTRO LA DIAGONAL DE MI MATRIZ
	
	for (int dato : diagonal) {
		System.out.print (dato);
		
	}
	
	System.out.println ();
	
// INVERTIR LOS DATOS EXTREMOS DE LA MATRIZ
	num--;
	System.out.println (num);
	
	for (int f=0 ; f<matriz.length/2 ; f++, num--) {
		
// EN LA CONDICION, DEBE LLEGAR HASTA LA MITAD DEL TAMAÑO DE LA MATRIZ, NO PUEDES IGUALAR LOS INDICES PORQUE 
// SI LA MATRIZ ES IMPAR, LAS POSICIONES DE LOS INDICES, UNO SUMANDO Y OTRO RESTANTO, SUS RESULTADOS NO COINCIDIRÁN.
		
		int valor = matriz[f][num];
		matriz [f][num] = matriz [num][f];
		matriz [num][f] = valor;
		
			
		}
		
	
// COMPRUEBO QUE LO GUARDA BIEN EN LA MATRIZ
		for( int [] fila : matriz ) {
					
			for (int dato : fila) {
				System.out.print(dato);
			}
		System.out.print("\n");	
		
		}
}
}

