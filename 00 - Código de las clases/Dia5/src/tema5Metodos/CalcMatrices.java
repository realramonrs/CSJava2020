package tema5Metodos;

public class CalcMatrices {

	//Función que devuelve la suma de los elementos de una matriz
	
	public static int sumaMatriz(int matriz[]) {
		int suma = 0;
		for(int valor : matriz) {
			suma+=valor;
		}
		return suma;
		}	
	//Método que devuelve la media de los valores de una matriz
	
	public static float mediaMatriz(int m[]) {
		
		//Sumar los valores
		int suma = sumaMatriz(m);
		float media = suma/m.length;
		return media;		
	}
	
	//función que reciba una matriz y los números que quiere buscar en esa matriz
	
	public static void buscarNumeros(int x[],int...valores) {
		
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<valores.length;j++) {
				if(x[i]==valores[j]) {
					System.out.println(valores[j] + " está en la posición " + i);
				}
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
}
