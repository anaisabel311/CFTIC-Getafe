package pOO;


//POJO : ATRIBUTOS Y FUNCIONALIDADES QUE TIENE POJO

public class Persona {

//VARIABLES DE INSTANCIA
	
	String nombre;
	String apellidos;
	String dni;
	int edad;
	

// CONSTRUCTOR
	
	public Persona () {
		this.nombre = "juan";
		
	}
	
	public Persona (String nombre) {
// this.nombre variable Instancia		
		this.nombre = nombre;
		
	}
	
// MÉTODOS
	// CORRER
	public void correr () {
		
		System.out.println ("La persona con nombre "+ nombre + "y edad "+ edad+ "está corriendo");
			if (edad<25) {
				System.out.println("correrá muy rápido");
			} else {
				System.out.println("correrá muy lento");
				
			}
		
	}
	
}
