package mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EquipoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		EquipoFutbol ef1 = new EquipoFutbol ("REAL MADRID CF", 30, 15);
		EquipoFutbol ef2 = new EquipoFutbol ("FC BARCELONA", 15, 0);
		
		Jugadores j1 = new Jugadores ("J1", 20, "DELANTERO");
		Jugadores j2 = new Jugadores ("J2", 18, "DEFENSA");
		Jugadores j3 = new Jugadores ("J3", 22, "PORTERO");
		
		List jugadoresef1 = Arrays.asList(j1,j2,j3);	
		
		
	// OTRA MANERA DE CREAR LISTAS E INTRODUCIR LOS VALORES.
		
	//	List<Jugadores> jugadoresef1 = new ArrayList<Jugadores>();
	//	jugadoresef1.add(j1);
		
		
		Jugadores j4 = new Jugadores ("J4", 20, "LATERAL IZDO");
		Jugadores j5 = new Jugadores ("J5", 18, "CENTRAL");
		Jugadores j6 = new Jugadores ("J6", 22, "PORTERO");
		
		List jugadoresef2 = Arrays.asList(j4,j5,j6);	
		
		
		Map<EquipoFutbol, List<Jugadores>> mapaEquipos = new HashMap <EquipoFutbol, List<Jugadores>>();
		
		mapaEquipos.put(ef1, jugadoresef1);
//		mapaEquipos.put(ef2, jugadoresef2);
		
//		OTRA MANERA DE INTRODUCIR VALORES A LOS MAPAS
		mapaEquipos.put(ef2, Arrays.asList(j4,j5,j6));	
		
		System.out.println(mapaEquipos.size());
		
		
		Collection<List<Jugadores>>todosJugadores = mapaEquipos.values();
		
		System.out.println("---------------------------------");
		
// MUESTRA LOS NOMBRES DE LOS JUGADORES		
		
		for (List<Jugadores> listaJugadores : todosJugadores) {
			for (Jugadores jugador:listaJugadores) {
				System.out.println(jugador.getNombreJugador());
			}
		}
		
		System.out.println("----key set -----------------------");
		
// MUESTRA CADA EQUIPO CON TODOS SUS TRABAJADORES, 2 FORMAS DISTINTAS
			
		Set<EquipoFutbol> equipos = mapaEquipos.keySet(); // EL Set<EquipoFutbol> ES UN OBJETO. LA POSICION DE MEMORIA EN DÓNDE ESTÁ LA CLAVE.
		
		for (EquipoFutbol equipo:equipos) {
			System.out.println(equipo.getNombreEquipo());
			System.out.println (mapaEquipos.get(equipo).get(0).getNombreJugador()); // para sacar el nombre de un jugador
		}
		
		System.out.println("----set entry -----------------------");
		
		
// SET ENTRY
		
		Set<Entry<EquipoFutbol, List<Jugadores>>> entryequiposFutbol = mapaEquipos.entrySet();
		
		for (Entry<EquipoFutbol, List<Jugadores>> entry : entryequiposFutbol) {
			System.out.println(entry.getKey().getNombreEquipo());
			for (Jugadores jugador : entry.getValue()) {
				System.out.println("\t"+jugador);
			}
			
		}
		
		
		
		
		
		}
}
