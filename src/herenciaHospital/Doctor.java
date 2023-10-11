package herenciaHospital;

import java.util.Random;

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
	
	public Enfermo diagnosticarPaciente (Paciente paciente) {
		Random r=new Random();
		int numAleatorio = r.nextInt(1,10);


		System.out.println("El número aleatoria es: "+ numAleatorio);

		if(numAleatorio>= 2) {
			System.out.println("El paciente " + paciente.getNomPersona()+ " está enfermo");
			Enfermo enfermo = new Enfermo (paciente.getIdPersona(), paciente.getNomPersona()+ paciente.getEdad());

			return enfermo;
		} else {
			System.out.println("El paciente " + paciente.getNomPersona() + " no está enfermo");
			return null;
		}




	}

	
	
	
	
// METODO COMER
	
	public void comer() {
		System.out.println("EL TRABAJADOR CON ID "+ this.getIdPersona() + "\n" +"NOMBRE TRABAJADOR "+ this.getNomPersona()+ "\n" + "ESTÁ COMIENDO EN EL BUFFET DEL HOSPITAL");
	}
	
}
