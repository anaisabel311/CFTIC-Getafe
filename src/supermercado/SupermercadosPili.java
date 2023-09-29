package supermercado;

public class SupermercadosPili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SupermercadosPili productos = new SupermercadosPili ("SUPER PILI"); // EL CONSTRUCTOR TE PIDE EN ARGS EL NOMBRE DEL SUPERMERCADO.
		productos.abrirSupermercado (); // NO PUEDO ENVIAR NADA EN ARGUMENTOS PORQUE NO TENGO PRODUCTOS CREADOS, LO HAGO EN EL MÉTODO.
		

	}
	
	private String nomSuper;
	private Cajeras  cajeras []; // ARRAY DE CAJERAS
	private Clientes clientes []; // ARRAY DE CLIENTES
	
	
// CONSTRUCTOR
	
	public SupermercadosPili(String nomSuper) {
		super();
		this.nomSuper = nomSuper;
	}

// GETTERS AND SETTERS

	public String getNomSuper() {
		return nomSuper;
	}

	public void setNomSuper(String nomSuper) {
		this.nomSuper = nomSuper;
	}

	public Cajeras[] getCajeras() {
		return cajeras;
	}

	public void setCajeras(Cajeras[] cajeras) {
		this.cajeras = cajeras;
	}

	public Clientes[] getClientes() {
		return clientes;
	}

	public void setClientes(Clientes[] clientes) {
		this.clientes = clientes;
	}

// MÉTODO ABRIR SUPERMERCADO


	public void abrirSupermercado () {	
	
	// CREO PRODUCTOS
	
		ProductosSupermercado p1 = new ProductosSupermercado (1, "Tomate Frito Orlando", 5.99, "250 gr");
		ProductosSupermercado p2 = new ProductosSupermercado (2, "Patatas Pepe", 3.5, "1000 gr");
		ProductosSupermercado p3 = new ProductosSupermercado (3, "Lauki", 0.95, "Desnatada");
		ProductosSupermercado p4 = new ProductosSupermercado (4, "Panrico", 2.35, "Sin corteza");
		ProductosSupermercado p5 = new ProductosSupermercado (5, "Pastas Gallo", 1.90, "Sin gluten");
		ProductosSupermercado p6 = new ProductosSupermercado (6, "Plátano de Canarias", 2.00, "1 kg");	
	
	// HAGO UN ARRAYS DE PRODUCTOS
		
		ProductosSupermercado arrayProductos [] = {p1,p2,p3,p4,p5,p6};
	
	// CREO LOS CLIENTES (3)
		
		Clientes cliente1 = new Clientes("c1", "Manolo",true ); // NO PASO NADA EN EL ARRAY, LO HE QUITADO DEL CONSTRUCTOR, AHORA DE MOMENTO NO LO NECESITO, YA QUE LOS CLIENTE NO HAN COMPRADO NADA TODAVÍA.
		Clientes cliente2 = new Clientes("c2", "Carmen",true );
		Clientes cliente3 = new Clientes("c3", "Lola",false );
//		Clientes clientes [] = {cliente1, cliente2, cliente3}; // METO LOS CLIENTES EN UN ARRAY
		cliente1.añadirProducto(p6, this.clientes);
		cliente1.añadirProducto(p3);
		cliente1.añadirProducto(p4);
		cliente2.añadirProducto(p4);
		cliente2.añadirProducto(p2);
		cliente3.añadirProducto(p1);
		
	// CREO LAS CAJERAS (2)	

		Cajeras cajera1 = new Cajeras (1 , "Maribel");
		Cajeras cajera2 = new Cajeras (2 , "Óscar");
		Cajeras cajeras [] = {cajera1, cajera2}; // METO LAS CAJERAS EN UN ARRAY, ASÍ SE HA DECLARADO.
		
	// MOSTRAR LOS PRODUCTOS DEL SUPERMERCADO
		
		System.out.println (" ======= MUESTRA PRODUCTOS SUPERMERCADO =======");
		
		for (ProductosSupermercado productos : arrayProductos) {
			
			System.out.println (productos.getIdProducto() + "\t" + productos.getNombreProducto() + "\t" + productos.getTipoProducto()+ "\t" + productos.getPrecioProducto() + "€");
		}
		
		//System.out.println ("POR FAVOR, INTRODUZCA EL NÚMERO DEL PRODUCTO QUE QUIERE COMPRAR");

}
}



