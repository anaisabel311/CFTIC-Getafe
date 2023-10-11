package herenciaHospital;

public class EmpleadosHospital extends Persona {
	
	
	private String turno;
	
	
// CONSTRUCTOR	

	
	public EmpleadosHospital(String idPersona, String nomPersona, int edad, String turno) {
		super(idPersona, nomPersona, edad);
		
		this.turno = turno;
		
	}

	// GETTERS AND SETTERS


	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	

	
// MÉTODO FICHAR
	

	public void fichar () {
		
		System.out.println("EL TRABAJADOR CON ID "+ this.getIdPersona() + "\n" +"NOMBRE TRABAJADOR "+ this.getNomPersona()+ "\n" + "HA FICHADO" + "\t");
		
	}
	
// MÉTODO COMER
	
	public void comer() {
		
		System.out.println("EL TRABAJADOR CON ID "+ this.getIdPersona() + "\n" +"NOMBRE TRABAJADOR "+ this.getNomPersona()+ "\n" + "ESTÁ COMIENDO EN EL COMEDOR DEL HOSPITAL");
		
	}
		
	
}
