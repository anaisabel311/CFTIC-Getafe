package herenciaHospital;

public class EnfermeroHospital extends EmpleadosHospital {
	
	private String planta;
	
// CONSTRUCTOR	

	public EnfermeroHospital(String idPersona, String nomPersona, int edad, String turno, String planta) {
		super(idPersona, nomPersona, edad, turno);
		this.planta = planta;
	}

// GETTERS AND SETTERS	
	
	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}
	
// MÉTODO ATENDER AL PACIENTE
	
	public void atenderPaciente() {}
	
	
// MÉTODO COMER
	
	public void comer() {}

}
