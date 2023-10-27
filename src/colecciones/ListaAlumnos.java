package colecciones;


import java.util.ArrayList;
import java.util.Scanner;
import pOO.Alumnos;
import java.util.List;

public class ListaAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// CREAMOS LA LISTA ALUMNOS		
		
	ArrayList<Alumno> alumnos = new ArrayList <Alumno>();	
	
// COMPROBAR QUE LA LISTA ESTÁ VACIA
	
	if  (alumnos.isEmpty()) {
		
		System.out.println("La lista está vacia");
	}

// LLENO LA LISTA
		
	alumnos.add(new Alumno ("DNI1", "JOSE MIGUEL", "SANCHO PEREZ"));
	alumnos.add(new Alumno ("DNI2", "ANA BELEN", "RUEDA REDONDA"));
	alumnos.add(new Alumno ("DNI3", "DANIEL", "TRAVIESO MATADOR"));
	alumnos.add(new Alumno ("DNI4", "CAYETANA", "PAPEL ALBAL"));
	alumnos.add(new Alumno ("DNI5", "ALVARO", "MARICHALAR Y TAL"));
	alumnos.add(new Alumno ("DNI6", "ROCIO", "CARRASCO FLOREÁ"));

	System.out.println(alumnos.size());
	
	
	recorrerLista (alumnos);
	
// PEDIR UN DNI PARA BORRAR	
	
	System.out.println("POR FAVOR, INTRODUZCA EL Nº DNI QUE QUIERE BUSCAR");
	Scanner scan = new Scanner (System.in);
	String dni = scan.nextLine();
	
	recorrerDni (alumnos, dni);
	
	
	
	
	}

	
	
	
	
// MÉTODO RECORRER LISTA Y ENSEÑAR
	
	public static void recorrerLista (ArrayList<Alumno> alumnos) {
		
		for (Alumno alu : alumnos) {
			System.out.println(alu.getDni()+ "\t"+ alu.getNombre() + "\t"+ alu.getApellidos());
			
			}
		
	}
	
// MÉTODO RECORRER DNI
	
	public static void recorrerDni(ArrayList<Alumno> alumnos, String dni){
		
		for (Alumno alu : alumnos) {
			
			if (dni.equalsIgnoreCase ("alu.getDni")) {
				System.out.println(alu.getDni()+ "\t"+ alu.getNombre() + "\t"+ alu.getApellidos());
				alumnos.remove(alu);
				
			} else {
				System.out.println("LO SIENTO, NO EXISTE ÉSTE ALUMNO");
			}
				
				
				
//			}
			
//	}
	
// MÉTODO MODIFICAR ALUMNO
	
//	public void modificaAlumno (ArrayList<Alumno> alumnos) {
		
	//	for (Alumno alu : alumnos) {
			
	//		if (dni.equalsIgnoreCase ("alu.getDni")) {
	//			System.out.println(alu.getDni()+ "\t"+ alu.getNombre() + "\t"+ alu.getApellidos());
	//			alumnos.remove(alu);
	//			
	//		} else {
	//			System.out.println("LO SIENTO, NO EXISTE ÉSTE ALUMNO");
	//		}
				
				
				
	//		}
		
		
		
	}
	
	}
	
	}
	
	
	
	
	

