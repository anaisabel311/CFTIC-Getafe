package ferreteria;

import java.io.FileInputStream;
import java.util.Properties;



public class MainFerreteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainFerreteria Ferreteria = new MainFerreteria();	
		Ferreteria.abrirFerreteria();
		Tornillo arraytornillos [] = {Tornillo.tornillo1, Tornillo.tornillo2, Tornillo.tornillo3};
		Ferreteria.cargarTornillos(arraytornillos); 
		

	}

	
	public void abrirFerreteria() {
		try {
			FileInputStream archivo = new FileInputStream("src/ferreteria/ferreteriaProperty.properties");
			
			Properties p = new Properties (System.getProperties());
			p.load(archivo);
			
			Ferreteria f = new Ferreteria (p.getProperty("id.ferreteria"), p.getProperty("nom.ferreteria"), p.getProperty("dir.ferreteria"));
			System.out.println("Abierta la " + f.getNomFerreteria()+ " Dirección " + f.getDirFerreteria());
			
			
			} catch (Exception e) {
				System.err.println("no existe el archivo = " + e);
				System.exit(1);
	        						}
	}
		

	public void cargarTornillos(Tornillo [] arraytornillos) {
		double total = 0;
		 for (Tornillo tornillo : arraytornillos) {
			System.out.println ("Tornillo nº "+tornillo.getId()+ " Color "+tornillo.getColor() + " Diametro "+tornillo.getDiametro() + " Longitud "+tornillo.getLongitud() + " Precio "+tornillo.getPrecio());
			total = total + tornillo.getPrecio();
			
		}
		
		 System.out.println("El precio total de los tornillos son "+ total + " €");
			
		}
		
		
	}

		

