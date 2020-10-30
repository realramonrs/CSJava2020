package misPruebas;
import misClases.*;
public class PruebaMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = {9,5,4,3,-8,10,29};
		
		MetodosMatrices.resetearMatriz(numeros);
		
		//Visualizar matriz por pantalla
		
		for(int numero : numeros) {
			System.out.print(numero + " ");
		}
		
		System.out.println();
		int numero = 9;
		//numero = MetodosMatrices.resetearVariable(numero);
		
		System.out.println("numero = " + numero);
		
		
		//Prueba método que obtiene posicion primer número negativo
		
		int posicion = MetodosMatrices.buscarNumeroNegativo(numeros);
		int posicion2 = MetodosMatrices.buscarNumeroNegativo(numeros, 2);
		
		if(posicion<0) {
			System.out.println("No hay números negativos");
		}
		else {
			System.out.println("El primer num negativo está en posicion: " + posicion);
		}
		
		
		double matriz2[]= {4.6,6.7,2.4};
		
		int posicion3 = MetodosMatrices.buscarNumeroNegativo(matriz2);
		
		double media = MetodosMatrices.getMedia(3,9);
		double media2 = MetodosMatrices.getMedia(2, 4, 1);
		
		double media3 = MetodosMatrices.getMedia(6);
		
		
		int numeros2[] = {5,4,6,7,8,3};
		MetodosMatrices.buscarNumeros(numeros2, 3);
		
	}

}
