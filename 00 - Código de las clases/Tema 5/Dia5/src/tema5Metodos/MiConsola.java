package tema5Metodos;

public class MiConsola {
	
	//Métodos que faciliten el envío de información a la consola
	
	public static void p(String mensaje) {
		System.out.println(mensaje);
	}
	
	//Método que reciba una matriz y la printe por Consola
	
	public static void pMatriz(int matriz[]) {
		
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	

}
