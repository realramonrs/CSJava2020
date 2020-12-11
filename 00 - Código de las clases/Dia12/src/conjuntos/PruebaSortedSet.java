package conjuntos;

import java.util.HashSet;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> listaNumerica = new HashSet<Integer>();
		
		Random aleatorio = new Random();
		
		
		for(int i = 0;i<50;i++) {
			listaNumerica.add(aleatorio.nextInt(500));
		}
		
		for(Integer n : listaNumerica) {
			System.out.print(n + " ");
		}
		TreeSet<Integer> listaOrdenada = new TreeSet<Integer>(listaNumerica);
		
		
		
		System.out.println("SortedSet :  ");
		
		for(Integer n : listaOrdenada) {
			System.out.print(n + " ");
		}
		
		
		
		TreeSet<String> listaalfabetica = new TreeSet<String>();
		
		listaalfabetica.add("Zacarias");
		listaalfabetica.add("Manuel");
		listaalfabetica.add("Alejandro");
		
		
		System.out.println();
		System.out.println("Nombres : ");
		
		for(String n : listaalfabetica) {
			System.out.println(n);
		}
		
		
		
		
		

	}

}
