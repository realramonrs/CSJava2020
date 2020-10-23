package sentenciasSeleccion;

import java.util.Scanner;

public class ExplicacionIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que solicite la edad y si es > 18 mande
		//un mensaje : "Puede ud pasar" y si no "No tiene la edad suficiente"
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca la edad:");
		int edad = lector.nextInt();
		
		if(edad >= 18) {						
			System.out.println("Puede ud pasar");
		}
		else {
			System.out.println("No puede pasar");
		}
		
		//Cerrar el lector
		lector.close();
	}

}
