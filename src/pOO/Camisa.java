package pOO;

public class Camisa {

	private long id;
	private String color;
	private String talla;
	private double precio;
	private Boton [] botones;

	
// CONSTRUCTOR	
	
public Camisa(long id, String color, String talla, double precio, Boton [] botones) {
	super();
	this.id = id;
	this.color = color;
	this.talla = talla;
	this.precio = precio;
	this.botones = botones;
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


public Boton[] getBotones() {
	return botones;
}


public void setBotones(Boton[] botones) {
	this.botones = botones;
}


	
	

	
	
	
	
	
	
}
