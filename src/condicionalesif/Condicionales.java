package condicionales;

public class Condicionales {
	public static void main(String[] arg) {
		
		int numero = 100;
		
		if (numero>10) {
			System.out.println ("1");
			System.out.println ("2");
			System.out.println ("3");
		}
// estas sentencias 4, 5 , 6  se ejecutan siempre, porque están fuera del if
		System.out.println ("4");
		System.out.println ("5");
		System.out.println ("6");
		
		if (numero>10) {

// if (numero>100 && esMayorEdad || numero<200) concatenar condiciones en un mismo if
/* if ** concatenar if's, cerrar los if con tantas } como if tengamos abiertas.
 * else if 			
 */
			
			System.out.println ("1");
			System.out.println ("2");
			System.out.println ("3");
		} else {
// estas sentencias 4, 5 , 6  se ejecutan sólo cuando no se cumple la condición if.
			
		System.out.println ("4");
		System.out.println ("5");
		System.out.println ("6");
		
				}

	}
}
