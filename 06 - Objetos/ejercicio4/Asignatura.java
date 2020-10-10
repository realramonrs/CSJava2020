/**
 * 
 */
package ejercicio4;

/**
 * @author Ramon RS
 *
 */
public class Asignatura {

	private int id;
	private double calificacion;
	public Asignatura(int id) {
		
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", calificacion=" + calificacion + "]";
	}
	
	
	
}
