package EjemplosArrays;

import java.util.Scanner;

public class NotasArrays {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(("Introduzca el número de notas que quiere guardar"));
		int indicenotas = scan.nextInt();
		int [] Notas = new int [indicenotas];
		
//		System.out.println (Notas.length);
// MEDIA		
		int sumaNotas=0;
		
		for (int contadorSumas=0; contadorSumas<Notas.length ; contadorSumas++){
			System.out.println(("Introduzca la nota " + contadorSumas));
			scan = new Scanner(System.in);
			Notas [contadorSumas] = scan.nextInt ();
			sumaNotas+=Notas [contadorSumas];
				
		}
		int Notamedia=sumaNotas/Notas.length;
		System.out.println ("La nota media es " + Notamedia);
		
//NOTA MÁX Y MIN
		
		int NotaMax = 0;
		int NotaMin = 0;
		for (int i=0; i<Notas.length; i ++) {
			if (Notas [i]>NotaMax) {
				NotaMax=Notas[i];
			} 
			if (Notas [i]<NotaMin) {
				NotaMin=Notas[i];
			}
		}
		System.out.println ("La nota Máxima es " + NotaMax);
		System.out.println ("La nota Mínima es " + NotaMin);
	
	
//CREAR UN NUEVO ARRAY CON LAS NOTAS ORDENADAS DE MAYOR A MENOR
	
	int [] NotasOrdenadas = new int [indicenotas];
	
	for ( int inOrd = 0 ; inOrd < NotasOrdenadas.length ; inOrd++) {
	
//		System.out.println (inOrd);
		
		for (int i = 0 ; i < Notas.length; i++ ) {
			if (Notas [i]>NotasOrdenadas[inOrd]) {
			NotasOrdenadas [inOrd] = Notas [i];
			}
		}
		
		}
	
	for (int inOrd : NotasOrdenadas) {
		System.out.println (inOrd);
	}
		
		
		
		
		
		
	}
}
