package sentenciasSeleccion;

public class IfsAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que evalúe si un número es par y múltiplo de 5
		
		int numero = 17;
		boolean par = false;
		boolean multiplo5 = false;		
		
		
		if(numero%2==0) {
			if(numero%5==0) {
				numero+=10;
				System.out.println("Par y múltiplo de 5");
			}
			else {
				System.out.println("Par y no múltiplo de 5");
			} //Fin del else
		} //Cierre del if exterior
		else {
			if(numero%5==0) {
				System.out.println("Impar y múltiplo de 5");
			}
			else {
				System.out.println("Impar y no es múltiplo de 5");
			}
		}
		
		/*
		if(numero % 2 == 0 && numero % 5 == 0) {
			System.out.println("Par y múltiplo de 5");
		}
		else if(numero %2 != 0 && numero%5 == 0) {
			System.out.println("Impar y múltiplo de 5");
		}
		
		else if(numero %2 == 0 && numero%5 !=0) {
			System.out.println("Par y no múltiplo de 5");
		}
		else {
			System.out.println("Impar y no múltiplo de 5");
		}
		
		*/
		
		
		
		
		
		
		
		
	}

}
