package supermercado;

public class Cajeras {

	private int idCajera;
	private String nombreCajera;
	
// CONSTRUCTOR	
	
	public Cajeras(int idCajera, String nombreCajera) {
		super(); // LLAMA AL CONSTRUCTOR PADRE.
		this.idCajera = idCajera;
		this.nombreCajera = nombreCajera;
	}

// GETTERS AND SETTERS	
	
	public int getIdCajera() {
		return idCajera;
	}

	public void setIdCajera(int idCajera) {
		this.idCajera = idCajera;
	}

	public String getNombreCajera() {
		return nombreCajera;
	}

	public void setNombreCajera(String nombreCajera) {
		this.nombreCajera = nombreCajera;
	}

// SOBREESCRIBIR UN MÉTODO
	@Override // se realiza con SOURCE - GENERATE toString()...
	public String toString() {
		return "Cajeras [idCajera=" + idCajera + ", nombreCajera=" + nombreCajera + "]";
	}
	

// SOBREESCRIBIR UN MÉTODO PADRE
	
// 1º LO DECLARO COMO ESTÁ EN EL MÉTODO PADRE
//	@Override 		// sobreescribiendo un método de clase PADRE.
//	public String toString() {
//		return idCajera + " " + nombreCajera;
//	}

	
// METODO COBRAR
	
	public double cobrar (Clientes cliente) {
		// mira el carrito y da el precio de la compra
		double importe = 0;
		
		for (ProductosSupermercado p : cliente.getCarritoCompra()) {
			importe+= p.getPrecioProducto();
		}

		// if ternario
		return cliente.isVip()? importe*0.85 : importe;
	}



}


