package pOOInterfaces.VehiculosDelectronicos;

public class Usuario {

	private Movil movil;
	private Moto moto;
	private Coche coche;
	private Television tv;
	
// CONSTRUCTOR	
	
	public Usuario(Movil movil, Moto moto, Coche coche, Television tv) {
		super();
		this.movil = movil;
		this.moto = moto;
		this.coche = coche;
		this.tv = tv;
	}

// GETTERS AND SETTERS	
	
	public Movil getMovil() {
		return movil;
	}

	public void setMovil(Movil movil) {
		this.movil = movil;
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public Television getTv() {
		return tv;
	}

	public void setTv(Television tv) {
		this.tv = tv;
	}
	
	
	
}
