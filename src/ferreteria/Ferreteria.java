package ferreteria;

public class Ferreteria {

	private String idFerreteria;
	private String nomFerreteria;
	private String dirFerreteria;
	private Tornillo [] arraytornillos;
	
	
	public Ferreteria(String idFerreteria, String nomFerreteria, String dirFerreteria, Tornillo[] arraytornillos) {
		super();
		this.idFerreteria = idFerreteria;
		this.nomFerreteria = nomFerreteria;
		this.dirFerreteria = dirFerreteria;
		this.arraytornillos = arraytornillos;
	}

	
	

	public Ferreteria(String idFerreteria, String nomFerreteria, String dirFerreteria) {
		super();
		this.idFerreteria = idFerreteria;
		this.nomFerreteria = nomFerreteria;
		this.dirFerreteria = dirFerreteria;
	}




	public Ferreteria(Tornillo[] arraytornillos) {
		super();
		this.arraytornillos = arraytornillos;
	}




	public String getIdFerreteria() {
		return idFerreteria;
	}


	public void setIdFerreteria(String idFerreteria) {
		this.idFerreteria = idFerreteria;
	}


	public String getNomFerreteria() {
		return nomFerreteria;
	}


	public void setNomFerreteria(String nomFerreteria) {
		this.nomFerreteria = nomFerreteria;
	}


	public String getDirFerreteria() {
		return dirFerreteria;
	}


	public Tornillo[] getArraytornillos() {
		return arraytornillos;
	}




	public void setArraytornillos(Tornillo[] arraytornillos) {
		this.arraytornillos = arraytornillos;
	}




	public void setDirFerreteria(String dirFerreteria) {
		this.dirFerreteria = dirFerreteria;
	}



	
	
	
		
}
