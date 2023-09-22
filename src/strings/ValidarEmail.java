package strings;

import java.util.Scanner;

public class ValidarEmail {
	public static void main(String[] args) {
		
//		TODO Auto-generated method stub (windows- Show view - taks), cosas que dejas pendientes de hacer
//		FIXME TODO Auto-generated method stub (windows- Show view - taks), cosas que dejas pendientes de arreglar
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(("Introduzca dirección de Email"));
		String email = scan.nextLine().trim();
//		email = email.trim();		
		String mensajeError="";
		
//		System.out.println (email);
		
		if (email.indexOf("@")!= email.lastIndexOf("@") || email.indexOf("@")==-1){
				mensajeError= "Debe tener una @";
		} else {
			
			int posicionpunto = email.lastIndexOf("@")+1;
			String punto = email.substring(posicionpunto); // los indexof o lastindexof devuelven un número.
			
//			if (punto.indexOf (".") != punto.lastIndexOf (".") || punto.indexOf(".") == -1)  {
//				mensajeError += ", después de la @ debe tener un punto";
			if (!punto.contains(".")) {
				mensajeError+= "El dominio debe contener al menos un punto";
			} else {
				if (punto.indexOf(".") < 2 ) {
					mensajeError+= "La distancia entre la @ y el punto debe ser superior a 2 caracteres";
				}
//              if (email.length() - (email.lastIndexOf(".")+1) < 2) || (email.length() - (email.lastIndexOf(".")+1) < 6) {
//				mensajeError+= "La distancia entre el último punto debe ser superior a 2 y menor de 6 caracteres";
//				}				
//		
			}
		
		
		}
			
//			System.out.println (punto);
			 
			
			
		
				
		if (email.contains(" ")) {
			mensajeError += ", no puede tener espacios en blanco";
		}
		
		
		
		
		
		
		
		if (mensajeError.isEmpty()) {
			System.out.println ("El email "+email+" es correcto");
			
		} else {
			System.out.println ("El email "+email+ " es incorrecto");
			System.out.println (mensajeError);
		}
		
		
		
		}
		
	}
	


