package mapas;

public class Jugadores {
	
	private String nombreJugador;
	private int edadJugador;
	private String posicionJugador;
	
	
// CONSTRUCTORES
	
	public Jugadores(String nombreJugador, int edadJugador, String posicionJugador) {
		super();
		this.nombreJugador = nombreJugador;
		this.edadJugador = edadJugador;
		this.posicionJugador = posicionJugador;
	}

// GETTER AND SETTERS
	
	public String getNombreJugador() {
		return nombreJugador;
	}


	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}


	public int getEdadJugador() {
		return edadJugador;
	}


	public void setEdadJugador(int edadJugador) {
		this.edadJugador = edadJugador;
	}


	public String getPosicionJugador() {
		return posicionJugador;
	}


	public void setPosicionJugador(String posicionJugador) {
		this.posicionJugador = posicionJugador;
	}
	
	

	
	

}
