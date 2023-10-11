package pOOInterfaces.VehiculosDelectronicos;

public class Television extends DispositivoElectronico  {

	private int hdmi;
	
// CONSTRUCTOR	

	public Television(String idDE, double precioDE, String fabricanteDE, int hdmi) {
		super(idDE, precioDE, fabricanteDE);
		this.hdmi = hdmi;
	}

// GETTERS AND SETTERS	
	
	public int getHdmi() {
		return hdmi;
	}

	public void setHdmi(int hdmi) {
		this.hdmi = hdmi;
	}

// MÉTODOS SOBREESCRITOS	
	
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("EL TELEVISOR ESTÁ ENCENDIDO");
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("EL TELEVISOR ESTÁ APAGADO");
	}

	
	
	
}
