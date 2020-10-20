package cadenas;

public class EjemploStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dni = "12345678E";
		String telefono = "(+34)667546362";
		
		//Métodos de la clase String
		//length()-->Devuelve el número de caracteres de un String
		int numeroCaracteres = dni.length();
		
		//startsWith(string)--> Devuelve true si empieza por ese caracter
		boolean empiezaPor65 = dni.startsWith("65");
		//endsWith(string)
		boolean acabaEnA = dni.endsWith("A");
		
		//charAt(posicion)--> Devuelve el caracter que ocupa esa pos
		
		char primeraLetra = dni.charAt(0);
		char ultimoCaracter = dni.charAt(dni.length()-1);
		System.out.println("Primer caracter del dni : " + primeraLetra);
		System.out.println("Último caracter del dni : " + ultimoCaracter);
		
		//indexOf(string b)-->Devuelve la posición que ocupa ese String
		
		int posicionUltimoparentesis = telefono.indexOf("-");
		
		System.out.println("Posicion de ) : " + posicionUltimoparentesis);
		
		//lastIndexOf(String b)
		
		//substring
		
		String numero = telefono.substring(5);
		String prefijo = telefono.substring(2,4);
		
		System.out.println(numero);
		System.out.println(prefijo);
		
		
		
		
		
		
		
		
		
		
	}

}
