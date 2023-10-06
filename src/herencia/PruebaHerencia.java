package herencia;

public class PruebaHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animales cp = new Animales("HOLA", 1);
		
		
		Elefante ch = new Elefante("ADIOS",2);
		ch.metodo1();
		
		Animales cp2 = new Elefante ("",3);
		
	}

}
