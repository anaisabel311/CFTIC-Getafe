package mapas.biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Utilidades.Utilidades;
import mapas.Alumno;

public class Biblioteca {
	
	private String nomBiblio;
	private Map <String, Libro> catalogoLibro = new HashMap<String, Libro>();
	
// CONSTRUCTOR	
	
	public Biblioteca(String nomBiblio, Map<String, Libro> catalogoLibro) {
		super();
		this.nomBiblio = nomBiblio;
		this.catalogoLibro = catalogoLibro;
	}	

// GETTERS AND SETTERS	
	
	public String getNomBiblio() {
		return nomBiblio;
	}
	
	public void setNomBiblio(String nomBiblio) {
		this.nomBiblio = nomBiblio;
	}

	public Map getCatalogoLibro() {
		return catalogoLibro;
	}

	public void setCatalogoLibro(Map catalogoLibro) {
		this.catalogoLibro = catalogoLibro;
	}

	
// MÉTODOS	
	
	
	public Map<String,Libro> generaLibros(){
		String titulo = Utilidades.pideDatoTexto("Introduce el título del Libro");
		// meter el libro en el mapa
		

		return null;
	}
	
	
	public Map<String,Libro> prestarLibro (){
		
		return null;
		
	}
	
	public Map<String,Libro> devolverLibro (){ 
		
		
		return null;
	}
}