package bucles;

import java.util.Scanner;

public class MenuOpcDibujo {
	
	public static void main (String [] args) {

	String menu = "1. Múltiplos de 3 y 5\n2. ATP\n3. Tabla de Multiplicar\n4. Pintar Cuadro\n5. Triángulo\n6. Pintar Hashtag\n7. Salir";
	System.out.println (menu);
	System.out.println("Selecciona una opción");
	Scanner scan = new Scanner(System.in);
	int opcion = scan.nextInt();
	
	switch (opcion) {
	//case 1:  break;
	//case 2: 
	//case 3: 
	//case 4: //System.out.println("Ha marcado la opción "+opcion);break;
	//case 5: //System.out.println("ADIOS");break;
	//case 6:
	case 7: System.out.println ("ADIOS"); break;	
	default: System.out.println ("La Opción introducida no es correcta"); }
	

}
}