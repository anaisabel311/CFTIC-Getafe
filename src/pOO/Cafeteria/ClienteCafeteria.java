package pOO.Cafeteria;

import java.io.IOException;


public class ClienteCafeteria {
	
	private String nombreCliente;
	private CoffeCup tazaCafe;
	
// CONSTRUCTOR	
	
	public ClienteCafeteria(String nombreCliente, CoffeCup tazaCafe) {
		super();
		this.nombreCliente = nombreCliente;
		this.tazaCafe = tazaCafe; // el cliente no tiene la taza de cafe, hay que pasarle el objeto.
	}

// GETTERS AND SETTERS	
	
	
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public CoffeCup getTazaCafe() {
		return tazaCafe;
	}

	public void setTazaCafe(CoffeCup tazaCafe) {
		this.tazaCafe = tazaCafe;
	}
	
// MÉTODO TOMAR TAZA DE CAFE
	
	public void tomarTazaCafe (CoffeCup taza) throws TooHotException, TooCoolException { // la propagas, significa que obliga a controlar la exception porque hereda de TemperaturaException, que es tipo CHECKED.
// public void tomarTazaCafe (CoffeCup taza) throws TemperaturaException { , se abrevia código poniendo la clase padre Temperatura Exception.
		
		
		if (taza.getTemperatura() >= 80) { // get.Temperatura la coje porque en la class Cafeteria le mandas un objeto CoffeCup que tiene ese atributo.
			
			throw new TooHotException ();	// lanzas la exception		
		} else { 
			
			if (taza.getTemperatura()<= 20 ) {
				throw new TooCoolException ();	
			}
			
		System.out.println("El cliente está tomandose el café a la temperatura de" + "\t"+ taza.getTemperatura() + " grados");	
		}
		

	}
	

}
