package excepciones;

public class MatriculaException extends Exception {
	
	public void printStackTrace() {
		System.out.println("La matr�cula no tiene el formato correcto");
	}

}
