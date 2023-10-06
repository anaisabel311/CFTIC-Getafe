package orquesta;

public class Guitarra extends Instrumento{

	int numCuerdas;

	public Guitarra(String nombreInstrumento, int numCuerdas) {
		super(nombreInstrumento, "INSTRUMENTO DE CUERDA");
		this.numCuerdas = numCuerdas;
	}

	
// GETTERS AND SETTERS
	
	
	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}


	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + "]";
	}


	
	
	
}
