
package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String password = JOptionPane.showInputDialog("Introduzca la contraseņa");
			String pass2 = JOptionPane.showInputDialog("Vuelva a introducir la contraseņa");
			
			boolean iguales = password.equals(pass2);
			
			System.out.println("Son iguales ? " + iguales);
	}

}
