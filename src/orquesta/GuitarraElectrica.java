package orquesta;

public class GuitarraElectrica extends Guitarra {

	private int Potencia;

	public GuitarraElectrica(String nombreInstrumento, int numCuerdas, int potencia) {
		super(nombreInstrumento, numCuerdas);
		Potencia = potencia;
	}

// GETTERS AND SETTERS	
	
	public int getPotencia() {
		return Potencia;
	}

	public void setPotencia(int potencia) {
		Potencia = potencia;
	}
	
	
	
	

}
