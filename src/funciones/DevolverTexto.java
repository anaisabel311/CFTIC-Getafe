package funciones;

public class DevolverTexto {
	
//	static String [] repetirTexto (String texto , int num) {
		
		
		
//		String [] juntaDatos = new String [num];
				
//		for (int i=0; i<juntaDatos.length; i++ ) {
//			juntaDatos [i] = (texto);
//			System.out.println (juntaDatos [i]);
//		}
		
		
		
//return juntaDatos;
//	} 


public static String [] juntaDatos (String texto, int numRepeticiones){
String [] datos = new String[numRepeticiones];	
	for ( int i = 0 ; i <datos.length; i++) {
		datos [i] = texto;
	}
	
return datos;	
}


// DEVOLVER ARRAY DIFICIL

public static String [] juntaDatosDificil (String texto, int numRepeticiones){
	
// if ternario, si la longitud del texto >= numRepeticiones, se llama al método	
	
	int tamanio = texto.length()>=numRepeticiones ? numRepeticiones: texto.length();
	
	String [] datos = new String[tamanio];
	
	for ( int i = 0 ; i <datos.length; i++) {
		datos [i] = texto.substring(0, texto.length ()-i);
	}
	
return datos;	

}
}