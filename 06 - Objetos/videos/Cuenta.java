/**
 * 
 */
package videos;

/**
 * Una clase es la definición de un nuevo tipo de variable.
 *
 */
public class Cuenta {
	
	//Variables de instancia o campos o atributos
	private String dniTitular;
	private String numeroCuenta;
	private float saldo;
	int interes;
	
	//Ámbito static
	
	static String banco;
	
	//Constructores
	public Cuenta() {
//		saldo = 0.0f;
//		interes = 0;
//		dniTitular = null;
//		numeroCuenta = null;
	}
	
	public Cuenta(String dniTitular , String numeroCuenta) {
		setDni(dniTitular);
		this.numeroCuenta = numeroCuenta;
	}	
	public Cuenta(String dniTitular , String numeroCuenta , float saldo) {
		setDni(dniTitular);
		this.numeroCuenta = numeroCuenta;
		setSaldo(saldo);
	}	
	
	
	
	//Métodos de acceso:setter y getter
	
	//dni
	public String getDNI() {
		return this.dniTitular;
	}
	
	public void setDni(String dni) {
		if(validarDNI(dni)) {
			this.dniTitular = dni;
		}
		
	}
		
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		if(saldo>0)
		this.saldo = saldo;
	}

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

	@Override
	public String toString() {
		return "Cuenta [dniTitular=" + dniTitular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", interes="
				+ interes + "]";
	}
	
	//toString:definido en la clase Object
	
//	@Override
//	
//	public String toString() {
//		return "DNI : " + this.dniTitular + " Num. cuenta : " + this.numeroCuenta + " Saldo : " + this.saldo + " Interés : " + this.interes;
//	}
	
	
	
	
	
	
	
	

	
}
