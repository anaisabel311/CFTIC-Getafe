package pOO;

public class Escaparate {

	public static void main (String [] args) {

		// CREO 6 OBJETOS BOTONES		

		Boton b1 = new Boton (1 , "Redondo", "Negro","S" );
		Boton b2 = new Boton (2 , "Redondo", "Rojo","S" );
		Boton b3 = new Boton (3 , "Redondo", "Amarillo","S" );
		Boton b4 = new Boton (4 , "Redondo", "Azul","S" );
		Boton b5 = new Boton (5 , "Redondo", "Blanco","XS" );
		Boton b6 = new Boton (6 , "Redondo", "Blanco","XXS" );

		// GUARDO LOS BOTONES EN UN ARRAY		

		Boton arrayBotones [] = {b1,b2,b3,b4,b5,b6};

		// CREO OBJETO VESTIDO

		Vestido v1 = new Vestido (1 , "Estampado flores Amarillas", "L", 59.99);

		// CREO OBJETO CAMISA

		Camisa c1 = new Camisa (1, "Blanca","M", 30.10, arrayBotones);

		// CREO OBJETO PANTALÓN

		Boton botonPantalon = new Boton (7,"Redondo", "Metálico", "one");

		Pantalon p1 = new Pantalon (1 , "Vaquero","M", 60 , botonPantalon);


		// CREO LOS MANIQUIS

		Maniqui mani1 = new Maniqui (1); // LO CREO CON EL CONSTRUCTOR DESNUDO
		mani1.vestirManiqui(v1); // VISTO AL MANIQUÍ CON UN VESTIDO

		Maniqui mani2 = new Maniqui (2); // VISTO MANIQUÍ CON PANTALÓN Y CAMISA
		mani2.vestirManiqui (p1,c1); // ¿cómo lo visto directamente llamando al método vestir?
		
		// INVOCACIÓN MÉTODO MOSTRAR ESCAPARATE

		Maniqui [] arrayEscaparate = {mani1, mani2};	// no puedo llamar directamente al método mostrarEscaparate porque NO ES STATIC lo estoy llamando desde un método Static y no lo puedo invocar directamente.
		Escaparate mostrar = new Escaparate(); // debo crear una variable de objeto ESCAPARATE
		mostrar.mostrarEscaparate (arrayEscaparate); // mostrar la variable con el array que le vas a enviar al método mostrarEscaparate.

		
		// INVOCACIÓN MÉTODO MOSTRAR PRECIO DEL ESCAPARATE
		
		Escaparate precio = new Escaparate();
		precio.mostrarPrecio (arrayEscaparate);
		
		

	}
	public void  mostrarEscaparate (Maniqui [] arrayEscaparate) {	


		String mensaje = "";

		for (Maniqui ropa : arrayEscaparate) {

			if (ropa.getCami()!= null){
				mensaje += ("Tiene una camisa, " + ropa.getCami().getColor() + ropa.getCami().getTalla());

			}
			if (ropa.getPan() != null) {
				mensaje += ("Tiene un pantalón, " + ropa.getPan().getColor() + ropa.getPan().getTalla());

			}
			if (ropa.getVes() != null) {
				mensaje += "Tiene un Vestido";
			}


			System.out.println ("El escaparate "+ mensaje);	 
		}	 



		// MÉTODO MOSTRAR PRECIO MANIQUÍ


	public void mostrarPrecio (Maniqui [] arrayEscaparate) {
		
		
		
		
	}	
		

	}

}


