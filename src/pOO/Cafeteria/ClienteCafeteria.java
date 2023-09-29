package pOO.Cafeteria;

import java.io.IOException;


public class ClienteCafeteria {
	
	private String nombreCliente;
	private CoffeCup tazaCafe;
	
// CONSTRUCTOR	
	
	public ClienteCafeteria(String nombreCliente, boolean tazaCafe) {
		super();
		this.nombreCliente = nombreCliente;
		this.tazaCafe = tazaCafe;
	}

// GETTERS AND SETTERS	
	
	
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public boolean getTazaCafe() {
		return tazaCafe;
	}

	public void setTazaCafe(boolean tazaCafe) {
		this.tazaCafe = tazaCafe;
	}
	
// MÉTODO TOMAR TAZA DE CAFE
	
	public void tomarTazaCafe (CoffeCup taza) {
		
		if (taza.getTemperatura() >= 80) {
			
			throw new TooHotException ();			
		} else { 
			
			if (taza.getTemperatura()<= 20 ) {
				throw new TooCoolException ();	
			}
			
		System.out.println("El cliente está tomandose el café a la temperatura de" + "\t"+ temperatura);	
		}
		

	}
	

}
