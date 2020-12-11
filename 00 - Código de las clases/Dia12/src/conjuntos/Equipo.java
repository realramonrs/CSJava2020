package conjuntos;

public class Equipo implements Comparable<Equipo> {

	private String nombre;
	private int puntos;
	public Equipo(String nombre, int puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	@Override
	public int compareTo(Equipo o) {
		// TODO Auto-generated method stub
		/*Integer ptos = new Integer(puntos);
		return ptos.compareTo(o.getPuntos())*-1;*/
		return nombre.compareTo(o.getNombre());
	}
	@Override
	public int hashCode() {
		
		return nombre.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		Equipo other = (Equipo) obj;
		if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
}
