package condicionalesif;

import java.util.Scanner;

public class CosteLlamada {

	public static void main(String[] args) {

		double coste = 1;
		System.out.println("Por favor, introduzca los minutos totales de duración de la llamada");
		Scanner scan = new Scanner(System.in);
		int tiempo = scan.nextInt();

		System.out.println("Por favor, introduzca el día que realizó la llamada");
		Scanner scan2 = new Scanner(System.in);
		String dia = scan2.nextLine();

		System.out.println("Por favor, introduzca la hora en la que realizó la llamada");
		Scanner scan3 = new Scanner(System.in);
		int hora = scan3.nextInt();

		 	  if (tiempo == 6 || tiempo == 7 || tiempo == 8) {
				coste = (int) 1.80;
			} if (tiempo == 9 || tiempo == 10) {
				coste = 1.80 + 0.70;
			} if (tiempo >= 10) {
				tiempo = tiempo - 10;
				coste = coste + (tiempo * 0.50);
				// coste += (tiempo * 0.50);
			}
			// coste = tiempo+coste;
			// Aplicamos los impuestos
			
			  if (dia.equalsIgnoreCase("domingo")) {
				coste += ((coste * 3) / 100);
				// coste = coste *1.03;
				// coste *= 1.03;
				
			} if (hora >= 12) {
				coste += ((coste * 15) / 100);
			} else {
				coste += ((coste * 10) / 100);
				System.out.println("comprueba, lo hace siempre");
			}
			System.out.println("El coste de su llamada es " + coste);
		}


}





