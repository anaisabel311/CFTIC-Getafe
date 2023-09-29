package pOO;

import java.util.Random;

public class Caballo {

	private int id;
	private String nombre;
	private int numero;
	private int edad;
	private int velocidad;
	private int peso;
	private double avanceCaballo; // control de lo que va avanzando cada caballo.
	
// CONSTRUCTOR
	
	public Caballo(int id, String nombre, int numero, int edad, int velocidad, int peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
//		this.avanceCaballo = avance; como por defecto empieza por 0 no hace falta añadirlo al constructor.
	}
	
// GETTERS ANS SETTERS	

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public double getAvanceCaballo() {
		return avanceCaballo;
	}

	public void setAvanceCaballo(double avanceCaballo) {
		this.avanceCaballo = avanceCaballo;
	}
	
// MÉTODO CORRER

	

	public void correr () {	
		Random rd1 = new Random ();
		int randomVelocidad = rd1.nextInt (1, 20);
		int randomPeso = rd1.nextInt (1, 3);		
		int randomEdad = rd1.nextInt (1, 3);
		
		this.avanceCaballo = this.velocidad * randomVelocidad - this.peso*randomPeso - this.edad*randomEdad;

		
		
	}
	
	
}	
	
	
	

