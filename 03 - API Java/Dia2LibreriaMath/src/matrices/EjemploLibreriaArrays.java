package matrices;
import java.util.*;


public class EjemploLibreriaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = {4,2,9,0,6,7,5};
		int numeros2[] = {4,2,9,0,6,7,5};
		//Arrays.sort()-->Permite ordenar valores que están guardados en una matriz
		Arrays.sort(numeros);
		//Mostrar el array ordenado
		System.out.println(numeros[0] + "," + numeros[1] + "," + 
		numeros[2] + "," + numeros[3] + "," + numeros[4] + ","
		+ numeros[5] + "," + numeros[6]);
		
		//Arrays.binarySearch(valor)-->Me devuelve la posición que ocupa el valor que estoy buscando
		
		int posicion = Arrays.binarySearch(numeros, 0);
		System.out.println("El cero está en la posición " + posicion);
		
		//Arrays.equals(a1,a2)--> Si son iguales
		int n[] = {4,2,9,0,6,7,5};
		int n2[] = {4,2,9,0,6,7,5};
		boolean iguales = Arrays.equals(n, n2);
		
		System.out.println("Son iguales? " + iguales);
		
		//Arrays.copy(a1,cantidaValores a copiar)-->Copia  los valores de a1 en otra matriz
		int x1[]= {1,2,3,4,5,6};
		int x2[] = new int[6];
		//x2 = x1;
		
		x2[0] = 79;
		System.out.println("***************************");
		System.out.println(x1[0]);
		System.out.println("***************************");
		
		
		x2 = Arrays.copyOf(x1,6);
		//System.out.println(x2[0] + " " + x2[1] + " " + x2[2]);
		System.out.println(x2[0] + " " + x2[1] + " " + x2[2] + " " + x2[3] +" "+ x2[4] + " " + x2[5]);
		
		//Arrays.toString(a1)-->Pasa todo el contenido de una matriz a un String
		System.out.println(Arrays.toString(x1));
		
	}

}
