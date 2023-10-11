package pOOInterfaces.VehiculosDelectronicos;

public class Moto extends Vehiculos {
	
	private int numRuedas;

	
// CONSTRUCTOR	
	
	public Moto(String idVehiculo, String matricula, String marca, int numRuedas) {
		super(idVehiculo, matricula, marca);
		this.numRuedas = numRuedas;
	}

// GETTERS AND SETTERS
	
	
	public int getNumRuedas() {
		return numRuedas;
	}


	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

// MÉTODOS SOBREESCRITOS	
	
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("LA MOTO "+this.getIdVehiculo()+" DEL FABRICANTE " + this.getMarca()+" ESTÁ ENCENDIDA");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("LA MOTO "+this.getIdVehiculo()+" DEL FABRICANTE " + this.getMarca()+" ESTÁ APAGADA");
	}
	

	
}
