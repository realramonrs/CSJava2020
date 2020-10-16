/**
 * 
 */
package ejercicio4;

/**
 * @author Ramon RS
 *
 */
public class Alumno {

	private Asignatura a1 , a2 , a3;

	public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
		
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	
	public Alumno(int id1 , int id2 , int id3) {
		a1 = new Asignatura(id1);
		a2 = new Asignatura(id2);
		a3 = new Asignatura(id3);
	}

	public Asignatura getA1() {
		return a1;
	}

	public Asignatura getA2() {
		return a2;
	}

	public Asignatura getA3() {
		return a3;
	}
	
	
	
	
}
