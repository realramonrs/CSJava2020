/**
 * 
 */
package ejercicio3;

/**
 * @author Ramon RS
 *
 */
public class Medico extends Trabajador {

	private String especialidad;
	private boolean haceGuardia;
	
		
	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medico(String nombre, String dni, float sBruto,String especialidad, boolean guardia) {
		super(nombre, dni, sBruto);
		// TODO Auto-generated constructor stub
		this.especialidad = especialidad;
		this.haceGuardia = guardia;
	}






	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public boolean isHaceGuardia() {
		return haceGuardia;
	}

	public void setHaceGuardia(boolean haceGuardia) {
		this.haceGuardia = haceGuardia;
	}

	@Override
	public float calcularSueldoNeto() {
		// TODO Auto-generated method stub
		float sueldoNeto;
		if(haceGuardia) {
			sueldoBruto*=1.1;
		}
		sueldoNeto = sueldoBruto*0.8f;
		
		return sueldoNeto;
	}

}
