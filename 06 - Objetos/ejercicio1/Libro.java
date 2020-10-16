
package ejercicio1;

/**
 * @author Ramon RS
 *
 */
public class Libro {

	private String titulo;
	private String autor;
	private int anho;
	short numPaginas;
	float valoracion;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int anho, short numPaginas) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anho = anho;
		this.numPaginas = numPaginas;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	public short getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(short numPaginas) {
		this.numPaginas = numPaginas;
	}

	public float getValoracion() {
		return valoracion;
	}

	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anho=" + anho + ", numPaginas=" + numPaginas
				+ ", valoracion=" + valoracion + "]";
	}
	
	
	
	
}
