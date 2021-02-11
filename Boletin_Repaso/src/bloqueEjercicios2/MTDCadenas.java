package bloqueEjercicios2;

public class MTDCadenas {

	/*1,Crear un método que reciba un String y devuelva un String formado por tantos "-" como caracteres
	 * tenía el String oroginal	 */
	public static String crearCadenaConGuiones(String original){
		String guionizado="";
		for(int i=0;i<original.length();i++){
			guionizado+="- ";
		}
		
		return guionizado;
	}
	
	/*
	 * 2. Sobrecargar el método para que reciba un char y devuelva un String 
	 * formado por guiones menos en las posiciones en las que encuentre el char , 
	 * en las que se verá el caracter
	 */
	public static String crearCadenaConGuiones(String original,char c){
		String guionizado="";
		for(int i=0;i<original.length();i++){
			if(original.charAt(i)==c)
				guionizado+=c+" ";
			else
			guionizado+="- ";
		}
		
		return guionizado;
	}
	
	/*
	 * 3, Sobrecargar el método anterior para que pueda recibir un String y un número opcional de variables de 
	 * tipo char. El método devolverá un String formado por los caracteres encontrados y guiones en aquellas 
	 * posiciones donde no están los caracteres que recibe como parámetro. (Algoritmo explicado en Tema 5 , pág 7 de los apuntes)

	 */
	public static String crearCadenaConGuiones(String original,char ...c){
		String guionizado="";
		boolean encontrado = false;
		for(int i=0;i<original.length();i++){
			//Recorremos array de caracteres pasados como parámetros
			encontrado = false;
			for(char j:c){
			if(original.charAt(i)==j){
				guionizado+=j+" ";
				encontrado = true;
			}
			}
			if(!encontrado){
				guionizado+="- ";
			}
			
		}
		
		return guionizado;
	}
	
	/* 4.
	 * Programar un método que reciba un String y devuelva true si contiene algún digito y false si no lo contiene.

	 */
	
	public static boolean buscarDigitos(String cadena){
		boolean encontrado = false;
		
		for(int i = 0;i<cadena.length();i++){
			if(Character.isDigit(cadena.charAt(i))){
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}
	
	/*
	 * 5.Programar un método que reciba un String y si este String contiene un espacio al principio o al final del mismo los elimina.

	 */
	
	public static String eliminarEspacios(String original){
		String copia = original;
		
		if(Character.isWhitespace(original.charAt(0)) || Character.isWhitespace(original.charAt(original.length()-1))){
			copia = original.trim();
		}
		
		return copia;		
	}
	
	/*
	 * 6. Crear un método que codifique el String que recibe como parámetro siguiendo el siguiente algoritmo:
			Las letras “i” las sustituye por un 1
			Las letras “o” las sustituye por un cero.
			Las letras “a” por un *
			Añade al final de cada palabra del String el hashcode de dicha palabra.
			Añade al principio de cada palabra el número de caracteres de la palabra resultante después de las transformaciones anteriores.

	 */
	
	public static String codificar(String original){
		String codificado = original;
		
		//1 Sustituimos vocales
		codificado = original.replace("i", "1");
		codificado= codificado.replace("o", "0");
		codificado = codificado.replace("a", "*");
		//2. Troceamos en palabras
		
		String palabras[] = codificado.split(" ");
		
		//3. Añadimos en cada palabra su hashcode
		
		for(int i = 0;i<palabras.length;i++){
			palabras[i]+=Integer.toString(palabras[i].hashCode());
		}
		
		//4. Debemos añadir al inicio de cada palabra el número de caracteres
		
		for(int i = 0;i<palabras.length;i++){
			palabras[i] = Integer.toBinaryString(palabras[i].length()) + palabras[i];
		}
		
		//5. Debemos reconstruir el String codificado con las nuevas palabras generadas
		codificado = "";
		for(int i = 0;i<palabras.length;i++){
			codificado+=palabras[i]+" ";
		}
		return codificado;
	}
}
