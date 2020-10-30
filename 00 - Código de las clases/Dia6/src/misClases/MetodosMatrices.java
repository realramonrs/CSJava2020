package misClases;

public class MetodosMatrices {
	
	int x = 4;
	String cadena = "Esto es flipante";

	//Método que recibe una matriz y pone todas sus posiciones a cero
	//Las matrices se pasan a los métodos por referencia
		public static void resetearMatriz(int matriz[]) {
			
			for(int i = 0;i<matriz.length;i++) {
				matriz[i] = 0;
			}			
		}
		
		//Método que busca el primer número negativo en la matriz y devuelve la posicion en que se encuentra
		
		public static int buscarNumeroNegativo(int matriz[]) {
			int posicion = -1;
			
			for(int i = 0;i<matriz.length;i++) {
				if(matriz[i]<0) {
					posicion = i;
					break;
				}
				
			}			
			return posicion;			
		}		
		public static int buscarNumeroNegativo(double matriz[]) {
			int posicion = -1;
			
			for(int i = 0;i<matriz.length;i++) {
				if(matriz[i]<0) {
					posicion = i;
					break;
				}
				
			}			
			return posicion;
		}
		
		public static int buscarNumeroNegativo(int matriz[],int posicion) {
			int posicion2 = -1;
			
			if(posicion<matriz.length) {
			
			for(int i = posicion;i<matriz.length;i++) {
				if(matriz[i]<0) {
					posicion = i;
					break;
				}
				
			}	
			}
			return posicion;			
		}	
		
	/*	public static double getMedia(int x,int y) {
			return (x + y)/2;
		}
		
		public static double getMedia(int x,int y,int z) {
			return (x + y + z)/3;
		}
		
		public static double getMedia(int x,int y,int z,int a) {
			return (x + y + z + a)/4;
		}*/
		
		public static  double getMedia(int n,int...x) {
			
			int suma = n;
			
			for(int i = 0;i<x.length;i++) {
				suma+=x[i];
			}
			
			return (double)suma/x.length;
			
		}	
		
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
