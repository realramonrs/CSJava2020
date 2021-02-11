package pruebas;
import java.util.Scanner;

import bloqueEjercicios1.MTDNumeros;
import bloqueEjercicios2.MTDCadenas;

public class PrincipalBloque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		
		do{
			System.out.println("Escoja una opción:1-9");
			opcion = lector.nextInt();
			
			switch(opcion){
			case 1:
				String palabra = "cocodrilo";
				
				System.out.println(MTDCadenas.crearCadenaConGuiones(palabra));
				break;
			case 2:
				
				String palabra2 = "cocodrilo";
				
				System.out.println(MTDCadenas.crearCadenaConGuiones(palabra2));
				break;
			case 3:
				String palabra3 = "cocodrilo";
				
				System.out.println(MTDCadenas.crearCadenaConGuiones(palabra3,'o','c'));
				
				break;
			case 4:
				String palabra4="Teng0 algún d1g1to";
				System.out.println(palabra4 + " tiene dígitos? " + MTDCadenas.buscarDigitos(palabra4));
				break;
			case 5:
				String palabra5=" Probando a eliminar espacios ";
				System.out.println(palabra5 + "!");
				System.out.println(MTDCadenas.eliminarEspacios(palabra5)+"!");
				break;
			case 6:
				String palabra6 = "Codificando codificando ando";
				System.out.println(palabra6);
				System.out.println(MTDCadenas.codificar(palabra6));
				
				break;
			case 7:
				
				
				break;
				
			case 8:
			
				break;
			
			case 9:
					break;
			}
			
		}
		while(opcion!=11);
		
		System.out.println("Adiós , gracias por jugar con nosotros!!.");

	

	}

}
