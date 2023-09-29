package pOO;

public class GranPremioCaballos {
	
	private long id;
	private String nombre;
	private Carrera [] carreras;
	
	
	
// CONSTRUCTOR
	
	public GranPremioCaballos(long id, String nombre, Carrera[] carreras) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carreras = carreras;
	}

// GETTERS AND SETTERES

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



	public Carrera[] getCarreras() {
		return carreras;
	}



	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}
	

	public void empezarGranPremio (){
		
		for (Carrera carrera : carreras) {
			carrera.iniciarCarrera();
			
			//System.out.println ("El caballo ganador es + ");
			
		}
		
		
	}
	
	
	
}


