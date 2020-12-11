package conjuntos;
import java.util.*;
public class PruebaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> peliculas = new HashSet<String>();
		peliculas.add("Interestellar");
		peliculas.add("Bohemian Rhapsody");
		peliculas.add("Road movie");
		peliculas.add("Road movie");
		
		
		//Métodos de búsqueda
		
		boolean encontrado = peliculas.contains("Interestellar");
		
		
		
		//Recorrer el hasset tengo dos opciones
		for(String p : peliculas) {
			System.out.println(p);
		}
		//Estructura de datos en Java.
		//Piensa en Java
		//Con un iterator
		
		Iterator<String> it = peliculas.iterator();
		System.out.println();
		System.out.println("COn un iterador: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<String> libros = new ArrayList<String>(2);
		//Insertar elementos en una lista
		libros.add("Matar a un ruiseñor");
		libros.add("El camino de los Reyes");
		libros.add("Matar a un ruiseñor");
		
		HashSet<String> librosHash = new HashSet<String>(libros);
		
		System.out.println();
		System.out.println("LibrosHash ");
		for(String l : librosHash) {
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
