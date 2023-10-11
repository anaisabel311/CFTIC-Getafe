package pOOInterfaces.VehiculosDelectronicos;

public class Movil extends DispositivoElectronico {
	
	private String so;
	
// CONSTRUCTOR	

	public Movil(String idDE, double precioDE, String fabricanteDE, String so) {
		super(idDE, precioDE, fabricanteDE);
		this.so = so;
	}

// GETTERS AND SETTERS
	
	
	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

// MÉTODOS SOBREESCRITOS
	
	
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println ("EL MOVIL ESTÁ ENCENDIDO");
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println ("EL MOVIL ESTÁ APAGADO");
	}
	
	

	
}
