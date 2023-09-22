package funciones;

public class CalcularEdad {
	
	static int calculaEdad (String anioNacimiento) {
		int anioNac = Integer.parseInt (anioNacimiento);
		int edad = 2023 - anioNac;
		
		return edad;
	}

}
