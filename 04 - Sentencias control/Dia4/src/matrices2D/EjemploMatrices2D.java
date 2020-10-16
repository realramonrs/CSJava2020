package matrices2D;

public class EjemploMatrices2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz2d[][] = new int[2][2];
		int matriz2d2[][] = {{1,2},{3,4},{6,7}};
		
		int numeroDeFilas = matriz2d.length;
		
		int numeroColumnas = matriz2d[0].length;
		
		// 2 2 
		// 4 5
		
		for(int i = 0;i<matriz2d2.length;i++) {
			for(int j = 0;j<matriz2d2[0].length;j++) {
				System.out.print(matriz2d2[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
