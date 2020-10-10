/**
 * 
 */
package ejercicio3;

/**
 * @author Ramon RS
 *
 */
public abstract class Trabajador {
	
	private String nombre;
	private String dni;
	float sueldoBruto;
	
	public Trabajador() {
		sueldoBruto = 800;
	}
	
	public Trabajador(String nombre , String dni,float sBruto) {
		this.nombre = nombre;
		setDni(dni);
		this.sueldoBruto = sBruto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(validarDNI(dni)) {
			this.dni = dni;
		}
	}

	public float getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", sueldoBruto=" + sueldoBruto + "]";
	}

	public abstract float calcularSueldoNeto();
	
	//Metodo auxiliar
	
	private boolean validarDNI(String dni) {
		boolean caracteres9 = false;
		boolean digitos8 = true;
		boolean letraOk = false;

		//1ºComprobamos que tenga 9 caracteres y si los tiene comproamos la letra
		if(dni.length()==9) {
			caracteres9 = true;
			for(int i = 0;i<dni.length()-1;i++) {
				if(Character.isDigit(dni.charAt(i))==false) {
					digitos8=false;
					break;
				}
			}
			if(digitos8) {
							//COmpruebo la letra
							
							char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N',
									'J','Z','S','Q','V','H','L','C','K','E'};
							//Lo pasamos a entero para poder dividir entre 23
									String dniNumerico = dni.substring(0, 8);
									int dniNumero = Integer.parseInt(dniNumerico);
									int resto = dniNumero%23;
									char letra = letras[resto];
									if(dni.charAt(8)==letra) {
										letraOk = true;
										}						
								}								
							}
			
				return caracteres9 && letraOk && digitos8;			
				
			}


}
