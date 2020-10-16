/**
 * 
 */
package ejercicio4;

/**
 * @author Ramon RS
 *
 */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asignatura a1 = new Asignatura(1);
		Asignatura a2 = new Asignatura(2);
		Asignatura a3 = new Asignatura(3);
		
		Alumno miAlumno = new Alumno(a1,a2,a3);
		//Podríamos crearlo de la siguiente forma
		Alumno otroAlumno = new Alumno(1,2,3);
		
		Profesor p = new Profesor();
		p.ponerNota(miAlumno);
		p.ponerNota(otroAlumno);
		
		System.out.printf("La media de miAlumno es : %.2f \n" , p.calcularMedia(miAlumno));
		System.out.printf("La media de otroALumno es : %.2f" , p.calcularMedia(otroAlumno));
		
		
		
		
	}

}
