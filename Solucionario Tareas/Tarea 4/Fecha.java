/**
 * 
 */
package tarea;

/**
 * @author Ramon RS
 *
 */
public class Fecha {

	private int dia;
	private int mes;
	private int anho;
	
	public Fecha() {
		
	}
	
	
	public Fecha(int dia, int mes, int anho) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anho = anho;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}


	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anho=" + anho + "]";
	}
	
	
	
	
}
