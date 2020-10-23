package tema5Metodos;

public class Matematicas {

	//Función que devuelve el valor más pequeño de 2 numeros (Math.min)
	
	public static int minimo(int...n) {
		
		int numeroArgumentos = n.length;
		
		int minimo = n[0];
		
		for(int i = 1;i<numeroArgumentos;i++) {
			if(n[i]<minimo) {
				minimo = n[i];
			}
		}
		return minimo;		
	}
	
	
}
