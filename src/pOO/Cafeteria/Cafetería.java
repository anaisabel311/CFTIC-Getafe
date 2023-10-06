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
		Cafetería cafeteria = new Cafetería ("A COFFEE CUP WITH LECHE IN PLAZA MAYOR"); // creamos objeto
		cafeteria.abrirCafetería(); // llamar método 
	}

// MÉTODO ABRIR CAFETERÍA
	
	private void abrirCafetería () {
	Random temp = new Random(); // objeto clase random creado
	
	boolean clienteSatisfecho; // para controlar que el cliente se topa el café
	
do {
	clienteSatisfecho= true;
	ClienteCafeteria cliente = new ClienteCafeteria ("Pepe"); // hacer un constructor sólo con el nombre???
	double tempTazaCafe = temp.nextDouble(1, 100); // devuelve double temperatura y se lo pasamos a temp.
	CoffeCup tc = new CoffeCup (tempTazaCafe); // aqui mandamos la temperatura de la taza al método tomarTazaCafe, ya que el cliente ha probado el cafe
	cliente.tomarTazaCafe(null);
	
	try {
		
		cliente.tomarTazaCafe(tc);
	}catch (TooHotException e) {
			System.out.println ("EL CLIENTE SE HA QUEMADO, QUIERE OTRA TAZA DE CAFÉ");
			e.printStackTrace();
	}catch (TooCoolException e) {
		System.out.println ("EL CAFÉ ESTA FRÍO, EL CLIENTE QUIERE OTRA TAZA DE CAFÉ");
		e.printStackTrace();
	}
	
	
	} while (!clienteSatisfecho);
	
		
		
		
	}
}	
	
		

