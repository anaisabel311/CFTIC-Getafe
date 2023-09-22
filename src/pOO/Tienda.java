package pOO;

public class Tienda {
	
	private String nombre;
	private long id;
	private String tipo;
	private Direccion direccion;
	
// CONSTRUCTOR
	
	
	public Tienda(String nombre, long id, String tipo, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.tipo = tipo;
		this.direccion = direccion;
	}

// GETTERS AND SETTERS	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	

	
	
	
	
	
	

}
