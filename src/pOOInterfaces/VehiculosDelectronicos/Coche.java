package pOOInterfaces.VehiculosDelectronicos;

public class Coche extends Vehiculos {

	private int numPuertas;

	
// CONSTRUCTOR	
	
	public Coche(String idVehiculo, String matricula, String marca, int numPuertas) {
		super(idVehiculo, matricula, marca);
		this.numPuertas = numPuertas;
	}

// GETTERS AND SETTERS
	
	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

// MÉTODOS SOBREESCRITOS	
	
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("EL COCHE ESTÁ ENCENDIDO");
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("EL COCHE ESTÁ APAGADO");
	}
	
	
	
	
}
