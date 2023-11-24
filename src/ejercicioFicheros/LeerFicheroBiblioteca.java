package ejercicioFicheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicios.biblioteca.dao.BibliotecaDAO;
import es.curso.java.poo.ejercicios.Alumno;
import mapas.biblioteca.Biblioteca;
import pOO.Direccion;

public class LeerFicheroBiblioteca {

	public static void main(String[] args) {
		LeerFicheroBiblioteca leer = new LeerFicheroBibliotecas();
		try {
			System.out.println(leer.LeerFicheroBibliotecas("./dir2/bibliotecas.txt").size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<Biblioteca> LeerFicheroBibliotecas(String rutaFichero,0) 
			throws IOException{
		
		return LeerFicheroBibliotecas(rutaFichero,0);
		
	}
	
	
	public List<Biblioteca> LeerFicheroBibliotecas (String rutaFichero,int skipLines) throws IOException{
		Path path = Paths.get(rutaFichero);
		List<Biblioteca> biblios = new ArrayList();

		List<String> lines = Files.readAllLines(path);
		int numLinea = 1;
		for (String linea : lines) {
			if (numLinea>skipLines) {
				String[] datos = linea.split("\\|");
				
				String tipoCalle = datos[0];
				String nombreCalle = datos[1];
				String ciudad = datos[2];
				String provincia = datos[3];
				int cp = Integer.parseInt(datos [4]);
				String nomBiblio = datos[5];
				
				Direccion direccion = new Direccion (tipoCalle, nombreCalle, ciudad, provincia, cp);
				
				Biblioteca biblio = new Biblioteca(nomBiblio, direccion);
				biblio.add(new Biblioteca(tipo, nombre, ciudad, provincia));
			}
			numLinea++;
		}

		return alumnos;
	}
	
	

}
