package bloqueEjercicios1;

import java.util.Arrays;
import java.util.Random;

public class misMetodos {
	//Este m�todo no lo pide el boletin pero va a ser �til para probar los siguientes m�todos.
	//M�todo que muestra la matriz por consola
	public static void mostrarMatriz(int matriz[]){
		for(int i = 0;i<matriz.length;i++){
			System.out.print(matriz[i]+ " ");
		}
		
	}

	//1. M�todo que reciba una matriz y la llene de n�meros aleatorios
	
	public static void generarMatiz(int matriz[]){
		Random r = new Random();
		for(int i = 0;i<matriz.length;i++){
			matriz[i]=r.nextInt();
		}
	}
	
	//2.Sobrecargar el m�todo anterior para que adem�s de la matriz reciba dos enteros .
	//llena la matriz con valores generados entre los dos n�meros recibidos como argumento
	
	public static void generarMatiz(int matriz[],int limiteInferior,int limiteSuperior){
		Random r = new Random();
		for(int i = 0;i<matriz.length;i++){
			matriz[i]=r.nextInt(limiteSuperior +1 - limiteInferior) + limiteInferior;
		}
	}
	
	//3. Obtener letra del dni
	
	public static char getLetraDni(String dni){
		char letra = ' ';
		
		if(dni.length()!=8){
			return letra;
		}
		else{
			for(int i = 0;i<dni.length();i++){
				if(!Character.isDigit(dni.charAt(i))){
					return letra; //En cuanto detectamos una letra salimos del m�todo
				}
			}
			
			//Si llega a este punto es que el dni tiene 8 d�gitos --> Pasamos a implementar algoritmo de obtenci�n de letra
			int dniNumerico = Integer.parseInt(dni);
			char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N',
					'J','Z','S','Q','V','H','L','C','K','E'};
			int resto = dniNumerico%23;
			
			letra = letras[resto];
			
		}
		
		return letra;
	}
	
	//4. M�todo que comprueba si el dni es correcto
	
	public static boolean validarDni(String dni){
		//Comprobamos que tiene 9 caracteres
		if(dni.length()!=9){
			return false;
		}
		else{
			String dniSinLetra = dni.substring(0,8);
			char letra = getLetraDni(dniSinLetra);
			char letraDni = dni.charAt(8);
			if(letra==letraDni){
				return true;
				}
			else{
				return false;
			}
		}
	}
	
	//5. Buscar n�mero en matriz
	public static int buscarNumero(int matriz[],int numero){
		int posicion = -1;
		
		for(int i = 0;i<matriz.length;i++){
			if(matriz[i]==numero){
				posicion = i;
				return posicion; //Sale del m�todo con el valor obtenido para la posicion
			}
		}
		return posicion;
	}
	
	//6. Buscar �ltima posicion n�mero en matriz
		public static int buscarNumero(int matriz[],int numero,boolean ultimaPosicion){
			int posicion = -1;
			
			//Si el booleano es true empezamos a buscar por la �ltima posicion
			if(ultimaPosicion){
			for(int i = matriz.length-1;i>=0;i--){
				if(matriz[i]==numero){
					posicion = i;
					return posicion; //Sale del m�todo con el valor obtenido para la posicion
				}
			}
			return posicion;
			}
			//Si el booleano es false entonces podemos llamar al m�todo ya programado en apartado 5.
			else{
				return buscarNumero(matriz, numero);
			}
		}
	
	//7. Hallar el mcm de 3 enteros
		
		public static int getMinimoComun(int x,int y , int z) {
			int mayor = Math.max(x, Math.max(y, z)); //El mayor es el valor m�s peque�o que puede ser m�ltiplo de los 3
			//Por ejemplo e,4 y 8 , el 8 es el mcm
			int mcm = x*y*z; //El producto de los 3 valores tambi�n da un m�ltiplo com�n de los 3
			//Recorremos entre estos dos intervalos para ver cual es el mcm
			int i = mayor;
			
			while(i<mcm) {
				if(i%x==0 && i%y==0 && i%z==0) {
					mcm = i;
					break;
				}
				i++;
			}
			
			return mcm;
		}
	
	//8. Hallar el m�ximo de n valores, (m�nimo 2 valores , el resto son opcionales
		public static int getMaximo(int x,int y,int...m) {
			int maximo1 = Math.max(x, y);
			int maximoOpcionales = 0,maximoTotal;
			
			//COmpruebo si hay valores opcionales
			if(m.length>0) {
				maximoOpcionales = m[0];
				for(int i = 1;i<m.length;i++) {
					if(maximoOpcionales<m[i]) {
						maximoOpcionales = m[i];
					}
				}
				//El maximo ser� el mayor entre maximo1 y maximoopcionales
				maximoTotal = Math.max(maximo1,maximoOpcionales);
			
			}
			else {
				maximoTotal = maximo1;
			}			
			
			return maximoTotal;
		}
		
	//9. Crear matriz ordenada de mayor a menor
		public static int[] ordenar(int original[]){
			//Creamos una matriz del mismo tama�o que la original
			int copia[] = Arrays.copyOf(original, original.length);
						
			//Ordenamos por burbuja la copia
			
			for(int i = 0;i<copia.length-1;i++){
				for(int j = 0;j<copia.length - 1;j++){
					if(copia[j]<copia[j+1]){
						//intercambiamos
						int aux = copia[j];
						copia[j]=copia[j+1];
						copia[j+1] = aux;
					}
				}
			}
			
			return copia;
			
		}
	
	//10. Clasificar password como no v�lido, d�bil, muy d�bil , media o fuerte
		
		public static void validarPassword(String password){
			if(password.length()<6){
				System.out.println("No v�lido");
			}
			
			else if(getLetras(password)){
				
			
				if(getMayusculas(password)){
					System.out.println("D�bil");
				}
				else {
					System.out.println("Muy d�bil");
				}
				}
			else if(getMayuscMinuscYDigitos(password) && ! getSimbolos(password)) {
				 
					System.out.println("Media");
				}
			else {
					System.out.println("Fuerte");
				}
			
			}
		
		
		//M�todo que comprueba si un String tiene solo letras.
		private static boolean getLetras(String p){
			boolean todoletras = true;
			for(int i = 0;i<p.length();i++){
				if(!(p.charAt(i)>='a' && p.charAt(i)<='z')&& !(p.charAt(i)>='A' && p.charAt(i)<='Z')){
					todoletras = false;
					break;
				}
			}
			return todoletras;
		}
		//M�todo que comprueba si un String tiene solo letras.
				private static boolean getMayusculas(String p){
					boolean mayuscula = false;
					for(int i = 0;i<p.length();i++){
						if(Character.isUpperCase(p.charAt(i))){
							mayuscula = true;
							break;
						}
					}
					return mayuscula;
				}
		//M�todo que comprueba que un string tiene letras,may�sculas y min�sculas y d�gitos,
		
				public static boolean getMayuscMinuscYDigitos(String password) {
					
					boolean letra = false;
					boolean digitos= false;
					boolean mayuscula = false;
					
					for(int i = 0;i<password.length();i++){
						if(Character.isUpperCase(password.charAt(i))){
								mayuscula = true;
							break;
							}				
						}	
					for(int i = 0;i<password.length();i++){
						if(password.charAt(i)>'a' && password.charAt(i)<'z'){
								letra = true;
							break;
							}				
						}
					for(int i = 0;i<password.length();i++){
						if(Character.isDigit(password.charAt(i))){
								digitos = true;
							
							}				
						}			
				
							return letra && digitos && mayuscula;			
				
				}
				
				public static boolean getSimbolos(String password) {
					boolean caracterBarraInclinada = password.indexOf("/") >= 0;
					boolean caracterInterrogacion = password.indexOf("?") >= 0;
					boolean caracterAsterisco = password.indexOf("*") >= 0;
					boolean caracterDolar = password.indexOf("$") >= 0;
					
					return caracterBarraInclinada || caracterInterrogacion || caracterAsterisco || caracterDolar;
				}
}
