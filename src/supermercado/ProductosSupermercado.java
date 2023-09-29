package supermercado;

public class ProductosSupermercado {

	private int idProducto;
	private String nombreProducto;
	private Double precioProducto;
	private String tipoProducto;
	
// CONSTRUCTOR	
	
	public ProductosSupermercado(int idProducto, String nombreProducto, Double precioProducto, String tipoProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.tipoProducto = tipoProducto;
	}

// GETTERS AND SETTERS	
	
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	

	
}
