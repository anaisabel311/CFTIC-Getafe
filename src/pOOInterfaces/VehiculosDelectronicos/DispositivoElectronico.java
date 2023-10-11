package pOOInterfaces.VehiculosDelectronicos;

public abstract class  DispositivoElectronico implements SistemaEncendido {

	private String idDE;
	private double precioDE;
	private String fabricanteDE;
	
	
// CONSTRUCTOR	
	
	public DispositivoElectronico(String idDE, double precioDE, String fabricanteDE) {
		super();
		this.idDE = idDE;
		this.precioDE = precioDE;
		this.fabricanteDE = fabricanteDE;
	}


// GETTERS AND SETTERS	
	
	public String getIdDE() {
		return idDE;
	}


	public void setIdDE(String idDE) {
		this.idDE = idDE;
	}


	public double getPrecioDE() {
		return precioDE;
	}


	public void setPrecioDE(double precioDE) {
		this.precioDE = precioDE;
	}


	public String getFabricanteDE() {
		return fabricanteDE;
	}


	public void setFabricanteDE(String fabricanteDE) {
		this.fabricanteDE = fabricanteDE;
	}
	
	

	
}
