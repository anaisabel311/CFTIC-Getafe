package herenciaHospital;

public class Hospital {
	
	private String nombre;
	//PRIVATE STATIC STRING nombre;
	private Habitacion habitaciones [];
	private Paciente salaEspera [];
	
// CONSTRUCTOR	

	public Hospital(String nombre, Habitacion[] habitaciones, Paciente [] salaEspera) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones; // this.habitaciones = new Habitacion [2];
		this.salaEspera = salaEspera; // this.salaEspera = new Paciente [3];
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

	public Paciente [] getSalaEspera() {
		return salaEspera;
	}

	public void setSalaEspera(Paciente [] salaEspera) {
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
		
		Habitacion H1 = new Habitacion (1, null); // Habitacion H1 = new Habitacion (1, null);
		Habitacion H2 = new Habitacion (2, null); // Habitacion H2 = new Habitacion (2, null);
		
		Habitacion habitaciones[] = {H1, H2}; // this.habitaciones[0] = {H1};
											 // 	this.habitaciones[1] = {H2};
		
		
// CREAR 3 PACIENTES
		
		Paciente paciente1 = new Paciente ("Pac1", "MARIA", 25, new String []{"Dolor de Cabeza", "Náuseas"});
		Paciente paciente2 = new Paciente ("Pac2", "PEPE", 55, new String []{"Dolor abdominal", "Bulto abdominal"});
		Paciente paciente3 = new Paciente ("Pac3", "RAÚL", 13, new String [] {null});
	
// ESTOS 3 PACIENTES ESTÁN EN LA SALA DE ESPERA
		
		Paciente salaEspera [] = {paciente1, paciente2, paciente3};
				
// CREO AL ENFERMERO
		
		EnfermeroHospital enfermero = new EnfermeroHospital ("ENF1", "ENFERMERO CLAUDIO", 40, "MAÑANA", "PLANTA 1");
		
		
// CREO AL DOCTOR
		
		Doctor medico = new Doctor ("DOC1", "DR.MIRALLES", 60, "MAÑANA", "URGENCIOLOGO");
		
		
// MANDO A TODOS A COMER		
	
		Persona [] personas = {paciente1, paciente2, paciente3, enfermero, medico};
		comer(personas);
		
// MANDO A LOS EMPLEADOS A FICHAR		
		
		fichar(personas);
	}		

	
	
	
	// ATIENDE EL ENFERMERO
		
	private void pasarConsulta (EnfermeroHospital enfermero, Doctor medico) {

		int i=0;
		for (Paciente paciente : salaEspera) {
			Paciente pacienteConsulta = enfermero.diagnosticarPaciente(paciente);
			salaEspera [i]= null;
			i++;

			if (pacienteConsulta != null) {
				Enfermo enfermo = medico.diagnosticarPaciente(pacienteConsulta);
				if (enfermo != null) {
					hospitalizarEnfermo(enfermo);

				}


			}


		}


	}

	
	
	
	
	
	
// MÉTODO COMER.
	
	public void comer(Persona [] personas) {
		for (Persona persona : personas) {
			persona.comer();
		}
	}
//DOY DE COMER A LOS ENFERMOS SI HUBIERA.		
		
//		for (Habitacion habitaciones: this.habitaciones) {
//			if (habitaciones.getEnfermo() !=null) {
//				habitaciones.getEnfermo().comer();
//			}
//			
//		}
		
//	}
	
// MÉTODO FICHAR
	
	public void fichar (Persona [] personas) {
		for (Persona persona : personas) {
			
			if (persona instanceof EmpleadosHospital) {
				EmpleadosHospital enfermero = (EmpleadosHospital) persona;
				enfermero.fichar();
			}
		}
			
	}
	
// METODO HOSPITALIZAR ENFERMO
	
	public boolean hospitalizarEnfermo (Enfermo enfermo) {
		
		for (Habitacion hab : habitaciones) {
			// PREGUNTO SI LA HABITACIÓN ESTÁ LIBRE
			if (hab.getEnfermo() == null) {
				System.out.println ("EL ENFERMO "+enfermo.getNomPersona()+ " QUEDA HOSPITALIZADO EN LA HABITACION "+ hab.getNumHabitacion());
				hab.setEnfermo(enfermo);
				return true;
			} 
		}
			
	return false;		
		}
		
	
	
	
	
	
	
	
/* MÉTODO FICHAR
 * 	EmpleadosHospital [] empleados = {enfermero, medico};
 *  empleados.fichar ();
 *  }
 *  
 * public void fichar(){
 * 	for (EmpleadosHospital empleado : empleados)
 * 		empleado.fichar();
 * } 
 *  
 *  }
 */
	
	
	
	
	
}
