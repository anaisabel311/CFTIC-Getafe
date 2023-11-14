package mapas;

public class EquipoFutbol {

	private String nombreEquipo;
	private int numLigas;
	private int numChampions;
	
// CONSTRUCTOR
	
	public EquipoFutbol(String nombreEquipo, int numLigas, int numChampions) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.numLigas = numLigas;
		this.numChampions = numChampions;
	}
	
// GETTERS AND SETTERS	

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public int getNumLigas() {
		return numLigas;
	}

	public void setNumLigas(int numLigas) {
		this.numLigas = numLigas;
	}

	public int getNumChampions() {
		return numChampions;
	}

	public void setNumChampions(int numChampions) {
		this.numChampions = numChampions;
	}
	
	
	
	
	
}
