package pOO;

public class CentroComercial {
	
	public static void main (String [] args) {
		
// CREACIÓN OBJETOS DE DIRECCIÓN		
		Direccion dir1 = new Direccion("N1", 21, 28600);
		Direccion dir2 = new Direccion("N2", 22, 28600);
		Direccion dir3 = new Direccion("N3", 23, 28600);
		Direccion dir4 = new Direccion("N4", 24, 28600);
		
		Tienda tienda1=new Tienda ("Tienda1", 1 , "Alimentación", dir1);
		Tienda tienda2=new Tienda ("Tienda2", 2 , "Electrónica", dir2);
		Tienda tienda3=new Tienda ("Tienda3", 3 , "Moda", dir3);
		Tienda tienda4=new Tienda ("Tienda4", 4 , "Zapatería", dir4);
		
// COMO LLEGAR AL CODPOSTAL DE UNA TIENDA
		
		tienda1.getDireccion().getCodPostal();
		
		
	}

}
