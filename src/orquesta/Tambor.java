package orquesta;

public class Tambor extends Instrumento {
	
	private String materialTambor;
	
// CONSTRUCTOR	

	public Tambor(String nombreInstrumento, String tipoInstrumento, String materialTambor) {
		super(nombreInstrumento, tipoInstrumento);
		this.materialTambor = materialTambor;
	}

// GETTERS AND SETTERS	
	
	
	public String getMaterialTambor() {
		return materialTambor;
	}

	public void setMaterialTambor(String materialTambor) {
		this.materialTambor = materialTambor;
	}

	
// MÉTODO APORREAR
	
	public void aporrearTambor () {
		
		System.out.println ("EL TAMBOR ESTÁ " + this.getNombreInstrumento() + " APORREANDO");
	}
	
}
