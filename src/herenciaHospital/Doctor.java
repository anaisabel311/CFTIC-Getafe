package herenciaHospital;

public class Doctor extends EmpleadosHospital{
	
	private String especialidad;

// CONSTRUCTOR	
	
	public Doctor(String idPersona, String nomPersona, int edad, String turno, String especialidad) {
		super(idPersona, nomPersona, edad, turno);
		this.especialidad = especialidad;
	}

	
	
// GETTERS AND SETTERS
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	

	
	
// METODO DIAGNOSTICAR PACIENTE
	
	public void diagnosticarPaciente () {}
	
	
	
	
	
// METODO COMER
	
	public void comer() {}
	
}
