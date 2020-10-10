/**
 * 
 */
package ejercicio4;

/**
 * @author Ramon RS
 *
 */
public class Profesor {
	
	public void ponerNota(Alumno a) {
		a.getA1().setCalificacion((int)(Math.random()*10) + 1);
		a.getA2().setCalificacion((int)(Math.random()*10) + 1);
		a.getA3().setCalificacion((int)(Math.random()*10) + 1);
	}
	
	public double calcularMedia(Alumno a) {
		double media = (a.getA1().getCalificacion() + a.getA2().getCalificacion() + 
				a.getA3().getCalificacion())/3;
		return media;
	}
}
