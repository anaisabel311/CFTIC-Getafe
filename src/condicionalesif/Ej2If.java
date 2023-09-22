package condicionales;

/* Declarar y reinicializar una variable de tipo String con el valor del nombre de un mes.
 * Dependiendo del mes indicar la estación del año.
 * Si el nombre del mes es incorrecto, indicarlo.
 * 
 * 
 */

public class Ej2If {
 public static void main (String[] args) {
	 
	// Declarar la variable mes	
 String mes = "Diciembre";
 
 // Se valida la variable mes, para saber si está bien escrito.
 
 /*Cómo se coge el texto de la consola
  * System.out.println ("Introduce un mes");
  * Scanner scan = new Scanner(System.in);
  * String mes = scan.nextline();
  */
 Scanner scan = new Scanner(System.in);
 //como Scanner lo subraya en rojo, significa que hay que importar la clase de LAN. (ctrl+shif+O)
 
 if  (mes == "Enero" || mes == "Febrero" || mes == "Marzo" || mes == "Abril" || mes == "Mayo" || mes == "Junio" || mes == "Julio" ||
	 mes == "Agosto" || mes == "Septiembre" || mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre"){
 }  else {
	  
	 System.out.println (" El mes es incorrecto, vuelva a introducir bien escrito el Mes, por favor.");
 }
 
 // Dependiendo del mes, indicar la estación del año.
 
	 if (mes == "Enero" || mes == "Febrero" || mes == "Marzo") {
		    System.out.println (" Es Invierno");
    }else if (mes == "Abril" || mes == "Mayo" || mes == "Junio") { 
	 		System.out.println (" Es Primavera");
 	}else if (mes == "Julio" ||	 mes == "Agosto" || mes == "Septiembre") {
			System.out.println (" Es Verano");
 	}else { if (mes == "Octubre" ||	 mes == "Noviembre" || mes == "Diciembre") {
			System.out.println (" Es Otoño");
}
}
}
}	 
// Escribir el resultado en un sólo System Out
// se crea la Variable Estación y se cambia según cada if.

// String estacion = ""


/* if (mes == "Enero" || mes == "Febrero" || mes == "Marzo") {
* estacion = "invierno";
* }else if (mes == "Abril" || mes == "Mayo" || mes == "Junio") { 
* estacion = "primavera";
* }else if (mes == "Julio" ||	 mes == "Agosto" || mes == "Septiembre") {
* estacion = "verano";
* }else { if (mes == "Octubre" ||	 mes == "Noviembre" || mes == "Diciembre") {
* estacion = "otoño";
* 
* if (estacion == "") {
* System.out.println (" Mes Incorrecto ");
* }else{
* System.out.println (" Estás en " +estacion);
* 
*/

/* Si el mes es Agosto, indicar, además de la estación, que "Estás en vacaciones de Verano"
* y si es Diciembre, indicar, "Estás en vacaciones de navidad"
*/
/* if (mes == "Enero" || mes == "Febrero" || mes == "Marzo") {
* estacion = "invierno";
* }else if (mes == "Abril" || mes == "Mayo" || mes == "Junio") { 
* estacion = "primavera";
* }else if (mes == "Julio" ||	 mes == "Agosto" || mes == "Septiembre") {
* estacion = "verano";
*  		if (mes = "Agosto") {
*  		estacion += "\tSon vacaciones de Verano";
*  		}
* }else { if (mes == "Octubre" ||	 mes == "Noviembre" || mes == "Diciembre") {
* estacion = "otoño";
* 	if (mes = "Diciembre") {
*  		estacion += "\tSon vacaciones de Navidad";
*  		}
* 
* if (estacion == "") {
* System.out.println (" Mes Incorrecto ");
* }else{
* System.out.println (" Estás en " +estacion);
*/


