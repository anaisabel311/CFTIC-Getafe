package bucles;

public class Dado6 {

	public static void main (String[] args) {
		
		//System.out.println(Math.random()); // Genera un número entre 0 y 1 , nunca llegará a 0 ni a 1.
		//System.out.println((int)(Math.random()*3)+1); Genera un número entero entre 1 y 6. ((int))--> coge la parte entera del numero decimal.
		
		
		int tirada = 0;
		int contador = 0;
		int dado = 0; 
		
		do {
			tirada++;
			dado = (int)(Math.random()*6)+1;
			System.out.println(dado);
			
			if (dado == 6) {
				contador++;
			}else {
				contador=0;
			}
			
			
			if (contador ==3) {
				System.out.println("Se ha necesitado "+tirada+" tiradas para sacar 3 veces seguidas el número 6"); break;
			} 
			
			
		} while (true); // (true) se realiza el bucle de manera infinita, por eso tenemos un break;
		
		
	}	
}	


