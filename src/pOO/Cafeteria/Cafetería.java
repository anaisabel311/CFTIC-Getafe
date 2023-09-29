package pOO.Cafeteria;

import java.util.Random;

public class Cafetería {
	
	private String nomCafeteria;
	
// CONSTRUCTOR	

	public Cafetería(String nomCafeteria) {
		super();
		this.nomCafeteria = nomCafeteria;
	}

// GETTERS AND SETTERS

	public String getNomCafeteria() {
		return nomCafeteria;
	}



	public void setNomCafeteria(String nomCafeteria) {
		this.nomCafeteria = nomCafeteria;
	}

// MÉTODO MAIN

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

// MÉTODO ABRIR CAFETERÍA
	
	public void abrirCafetería () {
	
	this.nomCafeteria = "CAFETERÍA UMMM";
	
	ClienteCafeteria cliente = new ClienteCafeteria ("Pepe", true);
	Random temp = new Random();
	double tempTazaCafe = temp.nextDouble(1, 100);
	CoffeCup tc = new CoffeCup (tempTazaCafe);
	cliente.tomarTazaCafe(null);
	
	
	
		
		
		
	}
	
	
	}	
}
