package bucles;

public class BucleFor {

	public static void main (String[] args) {
		
		
		for (int num=1 ; num<=50 ; num++) {
			System.out.println(num);
		}
		
//		for (int num=0 ; num<=50 ; num+=2) {
//			System.out.println(num);
//		}
		
//for (int num=49 ; num>=0 ; num-=2);{
//}	System.out.println(num);
		
		
/*profe:
 * for (int numPar=0, numImpar=49 ; numPar<=50 ; numPar+=2, numImpar-=2){
 *		 		System.out.println(numPar + " " + numImpar);
 *		 }
 */
		for (int numPar=0, numImpar=49 ; numPar<=50 ; numPar+=2, numImpar-=2){
		 		System.out.println(numPar + " " + numImpar);
		 }
		 
	}
	
}



