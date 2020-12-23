package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> libros = new ArrayList<String>(2);
		
		libros.add("Matar a un ruiseñor");
		libros.add("El camino de los Reyes");
		libros.add(0,"La carretera");
		
		LinkedList<String> librosLinkados = new LinkedList<String>(libros);
		
		
		String libro = librosLinkados.get(2);
		
		for(String l : librosLinkados) {
			System.out.println(l);
		}
		
		
		
		
	}

}
