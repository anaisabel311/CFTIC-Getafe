package pOO;

public class Alumnos {
	
// VARIABLES/ATRIBUTOS DE INSTANCIA
	
	private String dni;
	String nombre;
	String apellidos;
	double nota;
	
// CONSTRUCTORES
	
//Constructor Vacío	
	public Alumnos () {
		
	} 
	
	public Alumnos (String dni, String nombre, String apellidos) {

		this.nombre = nombre;
		this.dni = dni;
		this.apellidos = apellidos;
	
	}
	
	public Alumnos (String dni, String nombre, String apellidos, double nota) {
		this.nombre = nombre;
		this.dni = dni;
		this.apellidos = apellidos;
		this.nota = nota;
		
	}
	
// Para acceder a las variables de Instancia cuando son PRIVATE, debe realizarse a través de métodos GETTER AND SETTER.
	
	public void setDni (String dni) {
		this.dni = dni;
	}

	public String getDni () {
		return dni;
	}
	
	
	
	
// MÉTODO ESTUDIAR
	
	public void estudiar() {
		
		if (this.nota<5 && this.nota!= 0) {
			System.out.println ("El alumno "+ this.nombre + " ha estudiado poco");
		} else {
			if (this.nota >= 5 && this.nota <= 9) {
				System.out.println ("El alumno "+ this.nombre + " ha estudiado mucho");
			} else {
				if (this.nota == 10) {
				System.out.println ("El alumno "+ this.nombre + " es un genio");
				}
			}
		
			System.out.println ("El alumno "+ this.nombre + " no ha estudiado nada");
		}
	

		

		}
}
			
			
					
		
	
	

