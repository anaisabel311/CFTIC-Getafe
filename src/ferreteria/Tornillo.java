package ferreteria;

public enum Tornillo {

	tornillo1 (1, "acero", 10, 0.7, 5),
	tornillo2 (2, "acero", 10, 0.6, 4),
	tornillo3 (3, "acero", 10, 0.8, 10);
// Éstos tornillos no son objetos, es información que puedes utilizar de prueba para tus métodos.	
	
	
	
	private long id;
	private String color;
	private double longitud;
	private double diametro;
	private double precio;
	

	private Tornillo(long id, String color, double longitud, double diametro, double precio) {
		this.id = id;
		this.color = color;
		this.longitud = longitud;
		this.diametro = diametro;
		this.precio = precio;
	}


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


	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}


	public double getDiametro() {
		return diametro;
	}


	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	
}
