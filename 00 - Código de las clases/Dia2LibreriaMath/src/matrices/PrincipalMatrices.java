package matrices;

public class PrincipalMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matrices-->Variables que permiten almacenar muchos valores
		//Sintaxis <tipo_dato> nombre[] = new <tipo_dato>[tamaño];
		//Matriz de 10 números enteros
		int matriz[] = new int[5];
		matriz[0] = 9;
		matriz[1] = 3;
		matriz[2] = 4;
		matriz[3] = 7;
		
		int posicionCero = matriz[0];
		
		System.out.println("Datos de la matriz:");
		System.out.println("Posicion 0 : " + matriz[0]);
		System.out.println("Posicion 1 : " + matriz[1]);
		System.out.println("Posicion 2 : " + matriz[2]);
		System.out.println("Posicion 3 : " + matriz[3]);
		System.out.println("Posicion 4 : " + matriz[4]);
		
		//Declarar la matriz e inicializarla 
		float []notasJava = {9.5f,8.75f,4.3f,5.5f};
		
		//Revisión nota de Cousiño
		notasJava[2] = notasJava[2] - 1;
		
		//Calcular la media de notas de Java
		float suma = notasJava[0] + notasJava[1] + notasJava[2] + notasJava[3];
		
		int tamanhoMatriz = notasJava.length;
		
		float media = suma/tamanhoMatriz;
		
		System.out.println("La media es : " + media);
		
		
		
		
		
	}

}
