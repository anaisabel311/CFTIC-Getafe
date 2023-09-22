package pOO;

public class Pantalon {

	private long id;
	private String color;
	private String talla;
	private double precio;
	private Boton botonPantalon;
	
// CONSTRUCTOR	
	
	public Pantalon(long id, String color, String talla, double precio, Boton botonPantalon) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botonPantalon = botonPantalon;
	}
	
	
// GETTERS AND SETTERS	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Boton getBotonPantalon() {
		return botonPantalon;
	}

	public void setBotonPantalon(Boton botonPantalon) {
		this.botonPantalon = botonPantalon;
	}
	
	

	
	
	
	
}
