package tema5Metodos;

public class PruebaMetodosMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = {6,53,2,3,5,9,0,3,-3,7,3};
		
		MiConsola.pMatriz(numeros);
		
		double media = CalcMatrices.mediaMatriz(numeros);
		
		MiConsola.p("La media es " + media);
		
		CalcMatrices.buscarNumeros(numeros, 2,3);
		
	}

}
