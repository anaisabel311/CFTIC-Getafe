package orquesta;

public class Piano extends Instrumento{
	
	private int numOctavas;
	private String tipoPiano;
	
// CONSTRUCTOR 
	
	public Piano(String nombreInstrumento, String tipoInstrumento, int numOctavas, String tipoPiano) {
		super(nombreInstrumento, tipoInstrumento);
		this.numOctavas = numOctavas;
		this.tipoPiano = tipoPiano;
	}

	
// GETTERS AND SETTERS	
	
	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public String getTipoPiano() {
		return tipoPiano;
	}

	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}


	
// SOBREESCRIBIR MÉTODO AFINAR - DCHO - OVERRIDE/IMPLEMENTS METHODS
	
	
// toString
	
	@Override
	public String toString() {
		return "Piano [numOctavas=" + numOctavas + ", tipoPiano=" + tipoPiano + "]";
	}	

}
