
public class ArraysBidimensionales {

	public static void main (String [] args) {
		
// Definir array Bidimensional, se pone doble []
		
		String [][] animales = new String [3][4]; // Array bidimensional con el tamaño asignado, 3 filas, 4 columnas
// SIEMPRE, PRIMERO LAS FILAS, LUEGO LAS COLUMNAS, Y EMPIEZAN POR LA POSICIÓN 0
		
//		System.out.println (animales[2][1]);
//		animales [0][0] = "gato";
		
//		System.out.println (animales.length); // te da el número de filas
//		System.out.println (animales[0].length); // te da número de filas que tiene la columna 0
	
		for (int filas = 0; filas<animales.length; filas++) {
//			System.out.println ("fila "+ filas);
				for (int columnas=0 ; columnas<animales[filas].length; columnas++) {
//					System.out.println ("columna "+ columnas);
					animales[filas][columnas] = "*";
					
				}
		}		
		
// PARA MOSTRAR LA INFORMACIÓN DEL ARRAY BIDIMENSIONAL		
		
		
//		for (int filas = 0; filas<animales.length; filas++) {
			
//			for (int columnas=0 ; columnas<animales[filas].length; columnas++) {
//				System.out.print (animales[filas][columnas]); // SE LE QUITA AL PRINT EL LN PARA QUE NO CAMBIE DE LINEA Y PINTE COLUMNAS
		
//	}
//			System.out.println ("\n"); // SE INCLUYE AL PRINT LN PARA QUE HAGA SALTOS DE LÍNEA.
 // }
	
//PARA MOSTRAR LOS DATOS DEL ARRAY BIDIMENSIONAL CON UN FOR EACH
//PRIMERO, ACCEDE A LAS POSICIONES DE MEMORIA DE CADA ARRAY UNIDIMENSIONAL QUE REPRESENTA CADA FILA.
//SEGUNDO, SE REALIZA OTRO FOR EACH PARA MOSTRAR LOS DATOS DE CADA ARRAY UNIDIMENSIONAL DEL QUE, PREVIAMENTE HAS RECORRIDO SUS POSICIONES DE MEMORIA.
		
		for( String [] fila : animales ) {
		//System.out.println(fila);
		for (String dato : fila) {
			System.out.print(dato);
		}
		System.out.print("\n");
		
		
		
	}
}
}