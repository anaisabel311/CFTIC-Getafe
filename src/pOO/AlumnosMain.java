package pOO;

public class AlumnosMain {

	public static void main(String[] args) {

// llamada a un constructor vacío.		
		Alumnos a1 = new Alumnos();
		a1.nombre = "ANA";
		a1.setDni("A1"); // inicializar con un set
		a1.apellidos = "PEREZ";
		a1.nota = 4;
//llamada a un contructor pasa datos por referencia.		
		Alumnos a2 = new Alumnos("A2", "JESUS", "MARTINEZ");
		a2.nota = 7;

		Alumnos a3 = new Alumnos("A3", "ADRIAN", "PINILLA", 0);

//llamar a un método no estático, pones el objeto o la variable que está apuntado al objeto.método
		a1.estudiar();
		a2.estudiar();
		a3.estudiar();

//Guardar en un array

		Alumnos[] clase = { a1, a2, a3 };

// Crear método que reciba un array de alumnos y muestre información de los aprobados.	

// Creación objeto de la clase para llamar a método NO ESTÁTICO

		AlumnosMain am = new AlumnosMain();
		am.pintarAprobados(clase);
	}
	
	public void pintarAprobados(Alumnos[] clase) {

		for (int i = 0; i < clase.length; i++) {
			Alumnos a =clase[i]; // PARA NO TENER QUE COPIAR TODAS LAS VECES CLASE [i].atributo, lo meto en una variable y trabajo con ellas.
			if (a.nota >= 5) {
				System.out.println(a.getDni() + a.nombre + a.apellidos + a.nota);
			}

		}

	}
}
	
