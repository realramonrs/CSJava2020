/**
 * 
 */
package tarea;

/**
 * @author Ramon RS
 *
 */
public class Evento {

	private Fecha fecha;
	private String titulo;
	private String descripcion;
	
	public Evento(Fecha fecha , String titulo) {
		this.fecha = fecha;
		this.titulo = titulo;
	}
	
	public Evento(int dia , int mes , int anho , String titulo) {
		fecha = new Fecha(dia , mes , anho);
		this.titulo = titulo;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Evento [fecha=" + fecha + ", titulo=" + titulo + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
	
	
}
