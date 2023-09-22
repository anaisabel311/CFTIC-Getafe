package Ejercicios.Mod.Uno;

public class Operadores {
	public static void main (String[] args) {
		System.out.println ("ya es viernes");
		
		// Aritméticos: + - * /, 
		int num=0;
		num++;
		System.out.println (num++);
		System.out.println (num);
		System.out.println (++num);
		// num = num+5;
		num = num+5;
		num+=5;
		System.out.println(num*=5);
		
		// Mod, el resto de una división entera
		// con 2 iguales juntos se están comparando valores
		
		System.out.println(num%2==0);
		System.out.println(num%2<=0);
		
		// Condicionales
		// < >  <= >= ==
		
		boolean esMayor = 7<5;
	
		
		// Lógicos
		
		int num2 = 8;
		
		System.out.println(num2>=7 && num2>2 || num2>3);
		
		// las 2 barras del OR o AND que están dentro de los paréntesis no lo ejecutará porque la primera condicion se cumple.
		System.out.println(num2>=8 || (num2<2 || num2>2));
		System.out.println(num2>=8 && (num2<2 || num2>2));
		
		// se pone sólo una barra para llamar a otro método, también funciona con el &
		System.out.println(num2>=8 | (num2<2 || num2>2));
		System.out.println(num2>=8 & (num2<2 || num2>2));
		
		
		
	}
}
