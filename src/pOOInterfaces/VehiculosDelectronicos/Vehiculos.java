package pOOInterfaces.VehiculosDelectronicos;

public abstract class Vehiculos implements SistemaEncendido {

	private String idVehiculo;
	private String matricula;
	private String marca;
	
// CONSTRUCTOR	
	
	public Vehiculos(String idVehiculo, String matricula, String marca) {
		super();
		this.idVehiculo = idVehiculo;
		this.matricula = matricula;
		this.marca = marca;
	}

// GETTERS AND SETTERS	
	
	public String getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(String idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	
	
	
}
