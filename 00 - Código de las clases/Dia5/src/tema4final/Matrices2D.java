package tema4final;

public class Matrices2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = new int[4][7];
		
		int gabriel[][] = {{1,2,9,3,2,4},{0,8,7},{1,2,3,4,5,6,7,8}};
		
		
		
		int numeroDeFilas = m.length;
		int numeroDeColumnas = m[0].length;
		
		/*System.out.println(m[0][0] + " " + m[0][1] + " " + m[0][2]);
		System.out.println(m[1][0] + " " + m[1][1] + " " + m[1][2]);
		*/
		
		//apartado a) Bucle anidado para recorrer matriz y mostrar por pantalla
		for(int fila[] : gabriel) {
			for(int valor : fila) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
		
		System.out.println(" ************* ");
			
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
