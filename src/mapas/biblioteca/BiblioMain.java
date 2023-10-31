package mapas.biblioteca;

import java.util.Scanner;

public class BiblioMain {

	public static void main(String[] args) {
	
		BiblioMain abrirBiblio = new BiblioMain ();
		abrirBiblio.comenzar();

	}

	
	public void comenzar () {

		int opcion;

		do {
			System.out.println("1. Agregar Nuevo Libro");
			System.out.println("2. Prestar Libro");
			System.out.println("3. Devolver Libro");

			System.out.println("Por favor, marque una opción del menú");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();

			if (opcion >=1 && opcion <= 3) {
				switch (opcion) {
				case 1:
					Biblioteca gl = new Biblioteca(null, null);
					gl.generaLibros();
				break;
				case 2: prestarLibro ();
				break;
				case 3: devolverLibro ();
				break;
				default: System.out.println ("Adiós"); break;

				}
			}else {
				System.out.println ("La Opción marcada es incorrecta, por favor, vuelva a introducir Opción según Menú");
			}
		} while (opcion <= 3);

	}	

	}	
	

