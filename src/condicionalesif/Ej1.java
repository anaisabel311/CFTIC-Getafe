package condicionales;
/* Declarar 2 variables tipo String, NOMBRE Y APELLIDOS
 * y otra variable de tipo entero que es AÑO DE NACIMIENTO.
 * Indicar Nombre, Apellidos, Edad y si el Año de naciemiento es Par o Impar.
 * Declarar las variables
 * Inicializar las variables
 */

public class Ej1 {
	public static void main (String[] args) {
		
		String nombre = "Ana Isabel";
		String apellidos = "Arribas González";
		int anonacimiento = 1990;
		
		System.out.println (nombre+" "+apellidos+" "+(2023-anonacimiento)+""+"años");
		
		boolean esPar = (anonacimiento%2)==0;
		
		if (esPar) {
			System.out.println ("Su año de nacimiento es par");
		}else {
				System.out.println ("Su año de nacimiento es impar");
				
		}
		
		
		System.out.println ("¿Su año de nacimiento es par?"+" "+(anonacimiento%2==0));
		
			
		
		
	}
}
		
	
		/* Otra versión del mismo problema.
		 * 
		 * public class EjercicioVariableOperadores {
		*	public static void main (String[] args) {
		*		String nombre = "José Luis";
		*		String apellidos = "Llorente";
		*		int anionacimiento = 2000;
		*
		*		int edad = 2023 - anionacimiento;
		*		boolean añoEsPar = (anionacimiento%2)==0;
		*
		*		System.out.println ("El usuario "+nombre " + " " + apellidos + " tiene\t" + edad + " años y \nnació en año par "+añoEsPar);
		*
		*\t te da un espacio de tabulación al texto
		*\n te hace un salto de línea.
* }
* }
*/



