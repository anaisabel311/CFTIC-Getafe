package pOO;

public class PersonasMain {

	public static void main (String [] args) {
		
// Nombre del método = Persona, Variable = p1; llamada al constructor new Persona (), se crea el objeto		
		Persona p1 = new Persona ();
	
// Escribir en pantalla los atributos del objeto
		
		System.out.println (p1.nombre);
		System.out.println (p1.apellidos);
		System.out.println (p1.dni);
		System.out.println (p1.edad);
		
		p1.nombre =  "Eva";
		
		System.out.println (p1.nombre);
		
		Persona p2 = new Persona ();
		Persona p3 = p1;
		
		System.out.println (p3.nombre);
		
		p1.edad = 34;
		p3.edad = 18;
				
// LLAMAS DIRECTAMENTE AL MÉTODO AL NO SER ESTÁTICO, ES OBJETO	
		p2.correr();
		p3.correr();
		p1.correr();
	}
}
