package herencia;

public class Elefante extends Animales {

	
	private int numColmillos;
	
// SOURCE - GENERATE USING FIELDS... / PORQUE HAY ATRIBUTOS numColmillos QUE HAY QUE INICIALIZAR
	
	
	public Elefante(String dato1, int dato2, int numColmillos) {
	super(dato1, dato2);
	this.numColmillos = numColmillos;
}	
	
	
// SOURCE  - GENERATE CONSTRUCTORS FROM SUPERCLASS...
	
// SE HACE UN CONSTRUCTOR DE CLASE PADRE
// LA CLASE HIJA HEREDA TODOS LOS ATRIBUTOS Y MÉTODOS PUBLICOS DE LA CLASE PADRE.
	
	public Elefante(String X, int Y) {
		super(X, Y);
		// TODO Auto-generated constructor stub
	}


	public void metodo1 () throws Exception {
}
	}