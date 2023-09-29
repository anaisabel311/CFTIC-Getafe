package supermercado;

public class Cajeras {

	private int idCajera;
	private String nombreCajera;
	
// CONSTRUCTOR	
	
	public Cajeras(int idCajera, String nombreCajera) {
		super();
		this.idCajera = idCajera;
		this.nombreCajera = nombreCajera;
	}

// GETTERS AND SETTERS	
	
	public int getIdCajera() {
		return idCajera;
	}

	public void setIdCajera(int idCajera) {
		this.idCajera = idCajera;
	}

	public String getNombreCajera() {
		return nombreCajera;
	}

	public void setNombreCajera(String nombreCajera) {
		this.nombreCajera = nombreCajera;
	}
	
	
}
