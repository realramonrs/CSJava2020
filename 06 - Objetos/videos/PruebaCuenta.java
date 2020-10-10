/**
 * 
 */
package videos;

/**
 * @author Ramon RS
 *
 */
public class PruebaCuenta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta();
		Cuenta c2 = new Cuenta("123456789","ES23423424242234");
		Cuenta c3 = new Cuenta("74867481C","ES59 3166 6423 4903 6179 2934",30000);
		
		//Matriz de cuentas
		Cuenta []matrizCuentas = new Cuenta[10];
		matrizCuentas[0] = c;
		matrizCuentas[1] = c2;
		matrizCuentas[2] = c3;
		matrizCuentas[3] = new Cuenta("11231212Q","ES2342342342",80000);
		
		
		//Mostrar por pantalla numeros de cuenta
		
		for(Cuenta cuenta : matrizCuentas) {
			if(cuenta!=null) {
			System.out.println(cuenta.getNumeroCuenta());
			}
			else {
				break;
			}
		}
		
		//Mostrar por pantalla el primer dígito del dni del titular
		
		for(Cuenta cuenta : matrizCuentas) {
			if(cuenta!=null) {
				if(cuenta.getDNI()!=null)
				System.out.println(cuenta.getDNI().charAt(0));
			}
			else {
				break;
			}
		}
		
	}

}
