/**
 * 
 */
package tarea;

import javax.swing.JOptionPane;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = JOptionPane.showInputDialog("Escriba una frase");
		
		//a. Número de palabras introducidas.
			System.out.println("Número de palabras introducidas: " + frase.split(" ").length);
			
		//b. Número de caracteres no espacios.
			int caracteres = frase.length();
			int espacios = frase.split(" ").length - 1;
			System.out.println("Número de caracteres no espacios: " + (caracteres - espacios));
			
		//c. Primera letra de las palabras introducidas.
			
			String palabras[] = frase.split(" ");
			//Como no sabemos bucles vamos a suponer que
			//la frase tiene 3 palabras
			char letraPalabra0 = palabras[0].charAt(0);
			char letraPalabra1 = palabras[1].charAt(0);
			char letraPalabra2 = palabras[2].charAt(0);
			
			System.out.println("Primeras letras ");
			System.out.println(letraPalabra0);
			System.out.println(letraPalabra1);
			System.out.println(letraPalabra2);
			
		//d. Posición del primer espacio.
			System.out.println("Posición del primer espacio:"  + frase.indexOf(' '));
	}

}
