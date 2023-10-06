package herenciaHospital;

public class Habitacion {

	private int numHabitacion;
	private Enfermo enfermo;
	
// CONSTRUCTOR	
	
	public Habitacion(int numHabitacion, Enfermo enfermo) {
		super();
		this.numHabitacion = numHabitacion;
		this.enfermo = enfermo;
	}

// GETTERS AND SETTERS	
	
	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public Enfermo getEnfermo() {
		return enfermo;
	}

	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}
	

}

