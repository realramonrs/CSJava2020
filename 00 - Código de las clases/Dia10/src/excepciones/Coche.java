package excepciones;

public class Coche {

	private String matricula;

	public Coche(String matricula) throws MatriculaException {
		super();
		setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) throws MatriculaException {
		if(matricula.length()==7) {
			this.matricula = matricula;
		}
		else {
			throw new MatriculaException();
		}
		
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + "]";
	}
	
	
}
