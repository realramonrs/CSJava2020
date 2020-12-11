package conjuntos;

import java.util.Comparator;
import java.util.TreeSet;

public class PruebaSortedSetConEquipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Equipo> liga = new TreeSet<Equipo>();
		TreeSet<Equipo> otraLiga = new TreeSet<Equipo>(new ComparaEquipos());
		
		liga.add(new Equipo("Real Madrid",100));
		liga.add(new Equipo("Real Club Celta",90));
		liga.add(new Equipo("Real Betis Balompie",120));
		liga.add(new Equipo("Real Madrid",1800));
		liga.add(new Equipo("Real Madrid",100));
		
		System.out.println(new Equipo("Hola",4).hashCode());
		System.out.println(new Equipo("Hola",4).hashCode());
		
		
		
		for(Equipo e : liga) {
			System.out.println(e);
		}
		
		//Volcamos equipos de liga a otraLiga
		
		otraLiga.addAll(liga);
		System.out.println();
		System.out.println("Otra Liga : ");
		for(Equipo e : otraLiga) {
			System.out.println(e);
		}	
		
		//Clases anónimas
		
		TreeSet<Equipo> otraLiga2 = new TreeSet<Equipo>(new Comparator<Equipo>() {

			@Override
			public int compare(Equipo o1, Equipo o2) {
				// TODO Auto-generated method stub
				Integer ptos = new Integer(o1.getPuntos());
				return ptos.compareTo(o2.getPuntos());
			}

			
			
		});
		
		otraLiga2.addAll(liga);
		
		
		
		
		
		
		
		
	}

}
