package pOOInterfaces.VehiculosDelectronicos;

public class EnMarcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EnMarcha main = new EnMarcha ();
		//main.encender();

		Movil movil = new Movil ("p14", 850, "APPLE", "MacOs" );
		Moto moto = new Moto ("s1000rr", "BBV123", "BBW", 2);
//		Vehiculos moto = new Moto ("s1000rr", "BBV123", "BBW", 2);
//		SistemaEncendidoSystem moto = new Moto ("s1000rr", "BBV123", "BBW", 2);
		Coche coche = new Coche ("CS4", "CAS5687", "CITROÊN", 5);
		Television television = new Television ("K18", 599.50, "PHILIPS", 4);
		
		
		Usuario usuario = new Usuario (movil, moto, coche, television);
		
	//	movil.encender();
	//  moto.encender();
	//	coche.encender();
	//	television.encender();
		
	//	movil.apagar();
	//	moto.apagar();
	//	coche.apagar();
	//	television.apagar();
		
		encender(movil);
		encender(moto);
		encender(coche);
		encender(television);
	}

	public void encender (SistemaEncendido dispositivo) {
		dispositivo.encender();
		
	}
	
	public void apagado (SistemaEncendido dispositivo) {
		dispositivo.apagar();
	}
}

