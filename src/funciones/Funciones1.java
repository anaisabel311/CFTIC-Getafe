package funciones;

public class Funciones1 {

	public static void main (String [] args) {
//		Funciones1 f1=new Funciones1 (); // se crea el objeto para llamar a una funcion dinámica, porque dentro de una funcion
		// estatica no se puede llamar a una función dinámica.
		// String msg = new String ("hola"); == String msg = "hola";
		//Scanner scan = new Scanner (System.in);
		//scan.nextline ();
		
//		for (int i=0; i<args.length ; i++) {
//			System.out.println (args [i]);
		
//		}
		
//		f1.metodo1(); // llamas a un método dinamico desde un método estático
		
	}
	
// DECLARACIÓN DE UN MÉTODO
	// 1. modificador de acceso:
	
	// + public: se puede acceder a éste método desde cualquier clase o método.
	
	// + private: nivel más restrictivo, sólo se puede acceder desde la clase en la que está definida o declarada.
	
	// + package (): Sólo la propia clase y las clases que están en el mismo paquete que el método donde esté declarada, 
	// tienen acceso a éste método, no se indica con nada.
	
	// + protected: Igual que el package pero las clases hijas también pueden acceder, aunque estén en distintos paquetes, siempre y cuando el método
	// esté declarado en la clase padre.
	
	// 2. STATIC: PALABRA RESERVADA, SE PUEDE PONER O NO.
	// SE CREA EN LA MEMORIA Y SE CREA EN CUANTO SE ARRANCA LA JAVA VIRTURAL MACHINE (JVM)
	// LO PODEMOS CREAR NOSOTROS O EL PROPIO JAVA.
	// DESDE UN MÉTODO ESTATICO NO PODEMOS LLAMAR A UN MÉTODO QUE ESTÁ DENTRO DE UN OBJETO (PARTE DINÁMICA)
	// PERO DESDE UN MÉTODO EN UN OBJETO DINÁMICO SI PUEDE LLAMAR A UN MÉTODO ESTÁTICO.
	// PERMANECERA EN LA MEMORIA DURANTE LA EJECUCIÓN DEL PROGRAMA.
	// PARA ACCEDER A UN NOMBRE ESTATICO SOLO NECESITAS EL NOMBRE DE LA CLASE, MATH.RANDOM ();
	// UN METODO ESTÁTICO PUEDE LLAMAR A OTRO MÉTODO ESTÁTICO.
	// 
	//3.VOID: NO DEVUELVE INFORMACIÓN.
	// hay que definir los métodos con la información que nos va a devolver.
	// Pero si quiero que devuelva información, hay que indicar qué tipo de información va a devolver:
	////// VOID: NO DEVULVE NADA
	/////  OBJETO O TIPO PRIMITIVO: última sentencia que se ejecuta debe tener un RETURN.
	//
	//CÓMO SE PASA INFORMACIÓN A UN MÉTODO:
	//
	
	
	//
	String numParCaracteres = "tengo un numero par de caracteres";
	boolean numeroPar = numeroParCaracteres(numParCaracteres);
	
	// condicionante TERNARIO, SOLO PARA IF'S SENCILLOS
	
	String mensaje = numeroPar? "Es Par":"Es Impar";
	
	System.out.println (mensaje + " con "+ numParCaracteres.length() + "caracteres");
	
	
	// MÉTODO CALCULAR NUM PAR - DEBUG - para entrar en el método F5 - para ejecutar linea F6
	static boolean numeroParCaracteres (String cadena){
	     int numCaracteres = cadena.length();
			boolean esPar = true;	
				if (numCaracteres%2 != 0) {
					esPar=false;
				}
	// return cadena.length()%2 == 0;
	
	return esPar;
	}
	//
	// 
	//
	//
	//static public void metodo1() {
	//System.out.println ("Método1");
	//}
	//static public void metodo2 () {
	//	System.out.println ("Método2 estático");
		
	}
	
	
	

