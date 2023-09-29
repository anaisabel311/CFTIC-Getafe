package supermercado;

public class Clientes {

	private String idCliente;
	private String nomCliente;
	private ProductosSupermercado carritoCompra [];
	private boolean vip;
	
// CONSTRUCTOR
	
	
	public Clientes(String idCliente, String nomCliente, boolean vip) { // NO INCLUYO EN EL CONSTRUCTOR EL ARRAY CARRITO COMPRA, LO CREO MÁS ABAJO.
		super();
		this.idCliente = idCliente;
		this.nomCliente = nomCliente;
		this.carritoCompra = new ProductosSupermercado [6]; // CREO UN ARRAY carritoCompra con 6 filas = el número de productos que tengo creados en SupermercadosPili, pero el array está vacio.
		this.vip = vip;
	}

// GETTERS AND SETTERS	
	
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public ProductosSupermercado[] getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(ProductosSupermercado[] carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
// MÉTODO LLENAR CARRITO
	
	public void añadirProducto (ProductosSupermercado producto, Clientes [] cliente) {
	
	if (getIdCliente() == "c1") {	
		llenarCarrito (producto);
	}
	if (getIdCliente() == "c2") {	
		llenarCarrito (producto);
	}
	if (getIdCliente() == "c3") {	
		llenarCarrito (producto);
	}
	}	
	
		
public void llenarCarrito (ProductosSupermercado producto) {
	
	for (int i=0; i<this.carritoCompra.length; i++) {
		this.carritoCompra [i] = producto;
	}
}
}		
	


	
	

