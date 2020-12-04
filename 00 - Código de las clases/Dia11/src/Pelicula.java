import java.io.Serializable;

public class Pelicula implements Serializable {

	private String titulo;
	private int valoracion;
	private String director;
	
	public Pelicula(String titulo, int valoracion, String director) {
		super();
		this.titulo = titulo;
		this.valoracion = valoracion;
		this.director = director;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", valoracion=" + valoracion + ", director=" + director + "]";
	}
	
	
	
	
	
}
