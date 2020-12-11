package listas;

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructores de un ArrayList
		ArrayList<String> libros = new ArrayList<String>(2);
		ArrayList<String> otrosLibros = new ArrayList<String>();
		ArrayList<String> copiaLibros = new ArrayList<String>(libros);
		
		
		//Insertar elementos en una lista
		libros.add("Matar a un ruiseñor");
		libros.add("El camino de los Reyes");
		libros.add(0,"La carretera");
		
		//Reemplazar un elemento por otro 
		libros.set(1, "EDune");
		
		try {
		libros.add(0,"La conjura de los necios");	
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Error en la posición indicada");
		}
		
		//Búsquedas en listas
		//Por índice
		String libro = libros.get(0);
		
		//Por valor --> indexOf
		int libro2 = libros.indexOf("La carretera");
		
		//Por valor --> contains
		boolean encontrado = libros.contains("La conjura de los necios");
		
		//Consultar cuantos objetos hay guardados en una lista
		
		int numeroElementosActuales = libros.size();
		
		libros.trimToSize();
		
		//Recorrer una lista --> 3 opciones
		//Mostrar los libros cuyo titulo empiece por La
		for(int i = 0;i<libros.size();i++) {
			if(libros.get(i).startsWith("La")) {
				System.out.println(libros.get(i));
			}
		}
		
		//For each --> for(String cadena : libros)
		System.out.println("Con un for each");
		for(String c : libros) {
			System.out.println(c);
		}
		
		//Con un Iterator
		Iterator<String> it = libros.iterator();
		System.out.println("Recorrer con un iterator:");
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
			
		//Eliminar los libros cuyo título sólo tenga una palabra
		
		for(String c : libros) {
			if(c.startsWith("E")) {
				libros.remove(c);
			}
		}
		System.out.println("Después de eliminar Dune:");
		for(String c: libros) {
			System.out.println(c);
		}
		
		//Eliminar objetos
		//Por índice -->remove
		
		libros.remove(0);
		libros.remove("El camino de los Reyes");
		
		
		//Si mequiero cargar toda la coleccion
		libros.clear();
		
		
		
		
		
		
	}

}
