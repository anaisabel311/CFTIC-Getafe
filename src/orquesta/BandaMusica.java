package orquesta;

public class BandaMusica {



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		BandaMusica banda = new BandaMusica ();
		System.out.println ("COMIENZA EL CONCIERTO DE LA BANDA MUNICIPAL DE JAVA");
		banda.empezarConcierto();


	}


	public void empezarConcierto () {

		// CREAR OBJETOS DE CADA TIPO		

		Instrumento guitarra = new Guitarra ("DeLucia", 6);
		Instrumento guitarraElectrica = new GuitarraElectrica ("Kiss", 6, 240);
		Instrumento piano = new Piano ("Yamaha", "CuerdaPercutida", 8, "Eléctrico" );
		Instrumento tambor = new Tambor("MANOLO EL DEL BOMBO", "Instrumento de Percusión", "Piel de Cerdo");

		// METO TODOS LOS INSTRUMENTOS EN UN ARRAY PARA MANDAR A AFINAR

		Instrumento instrumentos [] = {guitarra, guitarraElectrica, piano, tambor};
		afinarInstrumento (instrumentos); // como está en la misma clase, no hace falta crear un objeto. Lo invoco directamente pasándole el argumento.


		// METO TODOS LOS INSTRUMENTOS A TOCAR

		tocarInstrumento(instrumentos);

		// METO A APORREAR EL TAMBOR

		//		Instrumento at = new Tambor();
		//		at.aporrearTambor(tambor);

	}

	// MÉTODO AFINAR

	public void afinarInstrumento ( Instrumento ...instrumentos ) {

		for (Instrumento inst : instrumentos) {
			System.out.println ("EL INSTRUMENTO " + inst.getNombreInstrumento() + " ESTÁ AFINANDO" );
		}
	}

	// CUANDO CADA CLASE DE INSTRUMENTO TIENE SU MÉTODO AFINAR, SE REALIZA DE LA SIGUIENTE MANERA
	/*
	 *  public void afinarInstrumento ( Instrumento ...instrumentos ) {

		for (Instrumento inst : instrumentos) {
		 	instrumento.afinar();
		}
	}
	 * 
	 * 
	 * 	

	 */	
	// MÉTODO TOCAR

	// CUANDO CADA CLASE DE INSTRUMENTO TIENE SU MÉTODO AFINAR, SE REALIZA DE LA SIGUIENTE MANERA

	/*	public void tocarInstrumento ( Instrumento ...instrumentos ) {

		for (Instrumento inst : instrumentos) {
		 	instrumento.tocarInstrumento();
		}
	}
	 *
	 *
	 *
	 *

	 */
	public void tocarInstrumento (Instrumento instrumentosatocar []) {

		for (Instrumento inst: instrumentosatocar) {
			if (inst instanceof Tambor) {

				// llamar al método de la clase Tambor, hay que hacer un cast ya que la variable por la que preguntas es de tipo Instrume
				((Tambor) inst).aporrearTambor();
				System.out.println ("EL INSTRUMENTO "+ inst.getNombreInstrumento() + " ESTÁ APORREANDO");
			}else {

				System.out.println ("EL INSTRUMENTO "+ inst.getNombreInstrumento() + " ESTÁ TOCANDO");
			}
		}	
	}
}