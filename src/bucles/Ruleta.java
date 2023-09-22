package bucles;

import java.util.Scanner;

public class Ruleta {

	public static void main (String [] args) {
		
		int importe = 1000;
		int opc = 0;
		int color = 0;
		int apuesta = 0;
		int dado = 0;
		int docena = 0;
		int par= 0;
		
		
// 1 jugador con 1000€
		
		do {
		System.out.println("EL JUEGO DE LA RULETA");
		System.out.println("=====================");
		System.out.println("1.APOSTAR POR UN NÚMERO DEL (1-36)");
		System.out.println("2.APOSTAR POR DOCENAS (0-12)/(13-24)/(25-36)");
		System.out.println("3.APOSTAR POR PAR / IMPAR"); 
		System.out.println("4.APOSTAR POR ROJO / NEGRO)");
		System.out.println("5.SALIR DE JUEGO");
		
		System.out.println("Por favor, marque la opción del menú que quiere jugar");
		Scanner scan = new Scanner(System.in);
		
	
			opc = scan.nextInt();	
		
		if (opc>=1 && opc <5) {
			System.out.println("Por favor, introduzca el importe de su apuesta");	
			Scanner scan1 = new Scanner(System.in);
			apuesta = scan1.nextInt();
				if (apuesta<=importe) {
			
					switch (opc) {
					case 1: System.out.println("1.APOSTAR POR UN NÚMERO DEL (1-36)");
					
							System.out.println("Introduzca un número del 1 al 36");
							Scanner scan2 = new Scanner(System.in);
							int num = scan2.nextInt();	
							
							if (num >=0 && num <= 36) {
								
								dado = (int)(Math.random()*36);
								System.out.println(dado);
								if (num==dado) {
									importe*=36;
									System.out.println("Enhorabuena, ha ganado, su importe ha aumentado "+ importe+ " €");
								} else {
								importe-=apuesta;
								System.out.println("Lo sentimos, ha perdido, su importe ha disminuido "+ importe + " €");
								}
							} break;
							
			
					case 2: System.out.println("2.APOSTAR POR DOCENAS (0-12)/(13-24)/(25-36)");
															
						do {
							System.out.println("Por favor, indique con qué docena quiere jugar");
							System.out.println("1.- 0-12 \n2.- 13-24 \n3.- 25-36");
							Scanner scan3 = new Scanner(System.in);
							docena = scan3.nextInt();
							
							for (; docena<1 || docena>3; docena = scan3.nextInt() ) {
								System.out.println("Opción incorrecta, por favor, marque la opción de decenas que quiere jugar");	
							}
								dado = (int)(Math.random()*36);
								System.out.println(dado);
								
										if (dado>=0 && dado<=12 && docena==1 || dado>=13 && dado<=24 && docena==2 || dado>=25 && dado<=36 && docena==3 ) {
											importe*=12;
											System.out.println("Enhorabuena, ha ganado, su importe ha aumentado "+ importe+ " €"); break;
										} else {
											importe-=apuesta;
											System.out.println("Lo sentimos, ha perdido, su importe ha disminuido "+ importe + " €"); break;
										}								
																				
						} while (docena==1 || docena==2 || docena==3);	
						
					case 3: System.out.println("3.APOSTAR POR PAR / IMPAR");System.out.println("Opción3"); break;
						 
					do {
						System.out.println("Por favor, indique si quiere jugar a:\n 1.-Par \n 2.-Impar");
						Scanner scan4 = new Scanner(System.in);
						par = scan4.nextInt();
						
						for (; par>=1  || par<=2; par = scan4.nextInt() ) {
							System.out.println("Opción incorrecta, por favor, con qué números quiere jugar, Par o Impar");	
						}
						dado = (int)(Math.random()*36);
						System.out.println(dado);
						
						if ((dado%2==0 && par==1) || (dado%2!=0 && par==2)){
							importe*=2;
							System.out.println("Enhorabuena, ha ganado, su importe ha aumentado "+ importe+ " €"); break;
						} else {
							importe-=apuesta;
							System.out.println("Lo sentimos, ha perdido, su importe ha disminuido "+ importe + " €"); break;
						}
						
						
						
						
					} while (par==1);
					
					
					
					
					
					
					
					
					
					
					
					case 4: System.out.println("4.APOSTAR POR ROJO / NEGRO)");System.out.println("Opción4");break;
					 
					}
					
				} else {
					System.out.println("Su apuesta no puede ser mayor de "+ importe +" €");
					System.out.println("Por favor, vuelva a introducir el importe de su apuesta");
					apuesta = scan1.nextInt();
				}	
		}else {
			if (opc==5) {
				System.out.println("Su importe es "+ importe + " €, Gracias por jugar en nuestra plataforma");
			} else {
				System.out.println("Opción incorrecta, por favor, marque la opción del menú que quiere jugar");
			}
			
		}	
		
	} while (opc!=5);	
		
		}	
		
	
	}

