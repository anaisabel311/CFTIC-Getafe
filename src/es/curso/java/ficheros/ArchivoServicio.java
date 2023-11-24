package es.curso.java.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
  // BufferedWriter, se utiliza para almacenar mucha información, cientos de megas de datos.
        // por cada, por ejemplo, mg de datos, lo pasas a un fichero.
        
        
  // FileWriter va asociado al BufferedWriter, false>sobreescribe el contenido, true>mantiene el contenido y lo une a la nueva información.      
  
  // hay que cerrar estos 2 métodos.      
        
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))){

            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo escribiendo en un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){
        	
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo acá escribiendo un archivo...");
            buffer.printf("Hasta luego %s!", "JoseLuis5");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre) throws IOException{
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        FileReader fileReader = new FileReader(archivo);
        BufferedReader reader = new BufferedReader(fileReader);
        //hay que cerrar el fichero, el reader hay que cerrarlo
        String linea;
        while ( (linea = reader.readLine()) != null){
            sb.append(linea).append("\n");
        }
        
        // otra forma de cerrar el reader
        
//        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){ // para leer todas las lineas
//
//            String linea;
//            while ( (linea = reader.readLine()) != null){ // cuando sea null, significa que ya ha terminado de leer
//                sb.append(linea).append("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){ 
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    
    
    public String leerArchivo3(String nombre) throws IOException{
		Path path = Paths.get(nombre);
		StringBuilder sb = new StringBuilder();

		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			sb.append(linea+"\n");
		}

		return sb.toString();
	}
    
    
    
    
    
    
    public void mostrarContenidoDirectorio(String directorio) {
    	File dir = new File(directorio);
    	File file1 = new File(directorio,"fichero1.txt");
    	File file2 = new File(dir,"fichero1.txt");


        if(dir.isDirectory()) {
        	String[] ficheros = dir.list();
        	for (String nombreFichero : ficheros) {
				//System.out.print(nombreFichero + " ");
				String nuevoFichero = directorio+nombreFichero;
				System.out.println(nuevoFichero);
				File file = new File(nuevoFichero);
				if(file.isDirectory()) {
					//System.out.println("Es un directorio");
				}else {
					if (file.getName().endsWith(".txt")) {
						System.out.println("Se puede leer:"+file.canRead());
						System.out.println("TAmaño " +file.length());
						System.out.println("Es un fichero");
					}
				}
					
			}
        }else {
        	System.err.println("No es un directorio");
        }
    }
}
