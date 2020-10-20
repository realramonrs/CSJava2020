package bucles;

import java.util.Random;

public class BuclesMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[] = new int[100];
		
		Random aleatorio = new Random();
		
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(50);
		}
			   
		for(int i = 0;i<matriz.length;i++) {
			System.out.print(matriz[i] + " ");
		}
		
		int suma = 0;
		
		//suma = matriz[0] + matriz[1] + matriz[2] + 
		
		for(int i = 0;i<matriz.length;i++) {
			suma = suma + matriz[i];   
		}
		
		
		System.out.println("La suma de todos los valores de la matriz es: " + suma);
		
		
		
		
		
		
		/*matriz[0] = aleatorio.nextInt(50);
		matriz[1] = aleatorio.nextInt(50);
		matriz[2] = aleatorio.nextInt(50);
		matriz[3] = aleatorio.nextInt(50);
		matriz[4] = aleatorio.nextInt(50);*/
		//... hasta 99
		
		
		
	}

}
