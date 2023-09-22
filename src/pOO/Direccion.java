package pOO;

public class Direccion {

	private String nombreCalle;
	private int numero;
	private int codPostal;
	private String población;
	private String provincia;
	
// SOURCE - GENERATED CONSTRUCTOR USING FIELDS	
	
	public Direccion(String nombreCalle, int numero, int codPostal) {
//		super(); // SÓLO PUEDE ESTAR EN LA PRIMERA LINEA DEL CONSTRUCTOR. SUPER () ES EL PADRE
		this.nombreCalle = nombreCalle;
		this.numero = numero;
		this.codPostal = codPostal;
	}

	public Direccion(String nombreCalle, int numero, int codPostal, String población, String provincia) {
//		super();
		this.nombreCalle = nombreCalle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.población = población;
		this.provincia = provincia;
	}

// SOURCE - GENERATED GETTER AND SETTERS	
	
	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getPoblación() {
		return población;
	}

	public void setPoblación(String población) {
		this.población = población;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
	
	
}
