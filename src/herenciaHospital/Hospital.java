package herenciaHospital;

public class Hospital {
	
	private String nombre;
	//PRIVATE STATIC STRING nombre;
	private Habitacion habitaciones [];
	private Hospital salaEspera [];
	
// CONSTRUCTOR	

	public Hospital(String nombre, Habitacion[] habitaciones, Hospital[] salaEspera) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.salaEspera = salaEspera;
	}

	
	
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
	}



// GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habitacion[] getHabitacion() {
		return habitaciones;
	}

	public void setHabitacion(Habitacion[] habitacion) {
		this.habitaciones = habitacion;
	}

	public Hospital[] getSalaEspera() {
		return salaEspera;
	}

	public void setSalaEspera(Hospital[] salaEspera) {
		this.salaEspera = salaEspera;
	}

// MÉTODO MAIN
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital abrirHosp = new Hospital ("HOSPITAL GETAFE"); // Hospital abrirHosp = new Hospital (nombre);
		abrirHosp.abrirHospital();
		
	}

	
// MÉTODO ABRIR HOSPITAL	
	
	public void abrirHospital () {
		
// CREAR  2 HABITACIONES
		
		Habitacion H1 = new Habitacion (1, null);
		Habitacion H2 = new Habitacion (2, null);
		
		Habitacion habitaciones[] = {H1, H2};
	
// CREAR 3 PACIENTES
		
		Paciente paciente1 = new Paciente ("Pac1", "MARIA", 25, new String []{"Dolor de Cabeza", "Náuseas"});
		Paciente paciente2 = new Paciente ("Pac2", "PEPE", 55, new String []{"Dolor abdominal", "Bulto abdominal"});
		Paciente paciente3 = new Paciente ("Pac3", "RAÚL", 13, new String []{"Dolor tobillo", "Color azul en el tobillo"});
		
			
// ESTOS 3 PACIENTES ESTÁN EN LA SALA DE ESPERA
		
//		Hospital salaEspera [] = {paciente1, paciente2, paciente3};
		
// CREO AL ENFERMERO
		
		EnfermeroHospital enfermero = new EnfermeroHospital ("ENF1", "ENFERMERO CLAUDIO", 40, "MAÑANA", "PLANTA 1");
		enfermero.fichar();
		
// CREO AL DOCTOR
		
		Doctor medico = new Doctor ("DOC1", "DR.MIRALLES", 60, "MAÑANA", "URGENCIOLOGO");
		medico.fichar();
		
		
	}
	
}
