package pOO;

public class Carrera {

	private Caballo [] caballos;
	private long id;
	private String nombre;
	private double distancia;
	
// CONSTRUCTOR	
	
	public Carrera(Caballo [] caballos, long id, String nombre, double distancia) {
		super();
		this.caballos = caballos;
		this.id = id;
		this.nombre = nombre;
		this.distancia = distancia;
	}

// GETTERS AND SETTERS
	
	
	public Caballo [] getCaballos() {
		return caballos ;
	}

	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	
// MÉTODO CARRERA
	
	public  iniciarCarrera () {
		
	boolean hayGanador = false;
	Caballo caballoGanador = null; // VARIABLE QUE ME APUNTARÁ AL CABALLO GANADOR
		
		do {
			
			for (int i=0 ; i<caballos.length ; i++) {
				caballoGanador = caballos[i]; // METO EL CABALLO QUE VA A CORRER DENTRO DE LA VARIABLE CABALLO GANADOR.
				caballoGanador.correr (); // LO MANDO A CORRER Y YA TRABAJO CON LA VARIABLE CABALLO GANADOR.
				if (caballoGanador.getAvanceCaballo() >= this.getDistancia()) {
					hayGanador=true;
					break;
			}
		}	
					
		} while (!hayGanador); // MIENTRAS NO HAYA GANADOR
		
		System.out.println ("El caballo ganador es "+ caballoGanador.getNombre()+ "\t" + this.getNombre());
		resetearCaballos ();
		return caballoGanador.getNumero();
	}

// RESETEAR LOS CABALLOS, PONER EL AVANCE A CERO
	
	public void resetearCaballos () {
		
		for (Caballo caballos : caballos) {
			
			double avance = caballos.getAvanceCaballo();
			avance=0;
			
		}
		
		
		
	}
	
		



}


