package herenciaHospital;

public class Paciente extends Persona {

	private String [] sintomas;
	
// CONSTRUCTOR

	public Paciente(String idPersona, String nomPersona, int edad, String [] sintomas) {
		super(idPersona, nomPersona, edad);
		this.sintomas = sintomas;
	}

// GETTERS AND SETTERS
	
public String [] getSintomas() {
		return sintomas;
	}



	public void setSintomas(String [] sintomas) {
		this.sintomas = sintomas;
	}


// MÉTODO COMER
	
	
	
public void comer () {
	
	System.out.println ("EL PACIENTE "+ this.getNomPersona() + " ESTÁ COMIENDO EN LA CAFETERÍA DEL HOSPITAL");
}	
	
}
