package tema4final;

import java.util.Scanner;

public class DoWhileExplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0;i<-10;i=i+3) {
			System.out.println("Hola");
		}
		
		System.out.println("Fuera del for");
		
		int contador = 0;
		do {
			System.out.println("Estoy dentro del bucle " + contador);
			contador++;
		}
		while(contador<3);
		
		
		int opcion;
		char seguir;
			
		do {
			System.out.println("1. Sumar ");
			System.out.println("2. Restar ");
			System.out.println("3. Salir");
			Scanner lector = new Scanner(System.in);
			opcion = lector.nextInt();
			//slector.close();
		switch(opcion) {
		case 1: 
			System.out.println("Sumar ");
			break;
		case 2:
			System.out.println("Restar");
			break;
		default:
			System.exit(0);
			break;
		}
		
		System.out.println("Desea continuar s/n");
		lector = new Scanner(System.in);
		String letra = lector.nextLine();
		
		seguir = letra.charAt(0);
		
		}
		while(seguir=='s');
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
