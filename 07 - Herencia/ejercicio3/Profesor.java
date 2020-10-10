/**
 * 
 */
package ejercicio3;

/**
 * @author Ramon RS
 *
 */
public class Profesor extends Trabajador {

	private String curso;
	private float complemento;
	
	public Profesor() {
		super();
		
	}
	public Profesor(String nombre, String dni, float sBruto,String curso , float complemento) {
		super(nombre, dni, sBruto);
		this.curso = curso;
		setComplemento(complemento);
	}
	
	
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public float getComplemento() {
		return complemento;
	}
	
	public void setComplemento(float complemento) {
		if(complemento < 10) {
		this.complemento = complemento;
			}
	}
	
	@Override
	public float calcularSueldoNeto() {
		// TODO Auto-generated method stub
		float sueldoNeto = sueldoBruto + (sueldoBruto*complemento/100);
		
		if(this.curso.contains("Primaria")) {
			sueldoNeto = sueldoNeto*0.85f;
		}
		else if(this.curso.contains("secundaria")) {
			sueldoNeto = sueldoNeto*0.83f;
		}
		else {
			sueldoNeto = sueldoNeto*0.81f;
		}
			
		return sueldoNeto;
	}
	
	
	
	
	
	
}
