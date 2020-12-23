package conjuntos;
import java.util.*;

public class ComparaEquipos implements Comparator<Equipo> {

	@Override
	public int compare(Equipo o1, Equipo o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
