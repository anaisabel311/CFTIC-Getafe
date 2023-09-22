package funciones;

public class TablaMultiplicar {

	static void calculoTablaMultiplicar(int num) {
		
			for (int i = 0 ; i<11 ; i++  ) {
					System.out.println ((int)num  + " * "+ i + " = " + num*i);
			
		}
	}
}
// no se pone return, porque en los métodos void no se devuelve valores.