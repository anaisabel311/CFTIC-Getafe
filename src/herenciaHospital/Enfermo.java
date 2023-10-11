package herenciaHospital;

public class Enfermo extends Persona {
	
	private String enfermedad;
	
	
// CONSTRUCTOR
	
	public Enfermo(String idPersona, String nomPersona, int edad, String enfermedad) {
		super(idPersona, nomPersona, edad);
		this.enfermedad = enfermedad;
	}

// GETTERS AND SETTERS	

	public String getEnfermedad() {
		return enfermedad;
	}


	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
// MÉTODO COMER
	
	public void comer () {
		
		System.out.println ("EL ENFERMO "+ this.getNomPersona() + " ESTÁ COMIENDO EN SU HABITACIÓN");
	}
	

}
