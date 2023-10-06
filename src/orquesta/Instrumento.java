package orquesta;

import java.util.Arrays;

public class Instrumento {

	private String nombreInstrumento;
	private String tipoInstrumento;
	private Instrumento instrumento [];

	// CONSTRUCTOR PADRE

	public Instrumento(String nombreInstrumento, String tipoInstrumento) {
		super();
		this.nombreInstrumento = nombreInstrumento;
		this.tipoInstrumento = tipoInstrumento;
	}

	public Instrumento(Instrumento[] instrumento) {
		super();
		this.instrumento = instrumento;
	}



	// GETTERS AND SETTERS

	public String getNombreInstrumento() {
		return nombreInstrumento;
	}


	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}


	public String getTipoInstrumento() {
		return tipoInstrumento;
	}


	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	// UTILIZO toSTRING DENTRO DE LOS MÉTODOS PARA QUE MUESTRE LOS OBJETOS DE LA CLASE INSTRUMENTOS CADA VEZ QUE HAGA UN SYSOUT.

	@Override
	public String toString() {
		return "Instrumento [nombreInstrumento=" + nombreInstrumento + ", tipoInstrumento=" + tipoInstrumento
				+ ", instrumento=" + Arrays.toString(instrumento) + "]";
	}


	//MÉTODO AFINAR

	public void afinarInstrumento ( Instrumento ...instrumentos ) {

		for (Instrumento inst : instrumentos) {
			System.out.println ("EL INSTRUMENTO " + inst.getNombreInstrumento() + " ESTÁ AFINANDO" );
		}
	}


	public void tocarInstrumento (Instrumento instrumentosatocar []) {

		for (Instrumento inst: instrumentosatocar) {
			if (inst instanceof Tambor) {

				// llamar al método de la clase Tambor, hay que hacer un cast ya que la variable por la que preguntas es de tipo Instrumento.
				((Tambor) inst).aporrearTambor();
				System.out.println ("EL INSTRUMENTO "+ inst.getNombreInstrumento() + " ESTÁ APORREANDO");
			}else {

				System.out.println ("EL INSTRUMENTO "+ inst.getNombreInstrumento() + " ESTÁ TOCANDO");
			}
		}	
	}
}


