package excepciones;

public class MatriculaException extends Exception {
	
	public void printStackTrace() {
		System.out.println("La matrícula no tiene el formato correcto");
	}

}
