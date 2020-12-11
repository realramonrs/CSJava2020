package conjuntos;

import java.util.*;

public class PruebaHashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> listaNumerica = new HashSet<Integer>();
		
		Random aleatorio = new Random();
		
		
		for(int i = 0;i<200;i++) {
			listaNumerica.add(aleatorio.nextInt(500));
		}
		
		for(Integer numero : listaNumerica) {
			System.out.print(numero + " ");
		}
		
	}

}
