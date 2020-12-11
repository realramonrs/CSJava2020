package conjuntos;

import java.util.Comparator;

public class ComparaEquipos2 implements Comparator<Equipo> {

	@Override
	public int compare(Equipo o1, Equipo o2) {
		// TODO Auto-generated method stub
		Integer ptos = new Integer(o1.getPuntos());
		return ptos.compareTo(o2.getPuntos());
	}

}
