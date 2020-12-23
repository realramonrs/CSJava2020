package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	
	public static void main(String[] args) {
		
		// Declarar matriz
		Prestable[] matriz = new Prestable[7];
		//Con una lista sería
		ArrayList<Prestable> listaLibros = new ArrayList<Prestable>();
		
		// Guardar elementos en la matriz
		try {
			matriz[0] = new Pelicula("QW12", "Bohemian Rhapsody", 133, "Bryan Singer", "Drama / Biografía");
			matriz[1] = new Pelicula("ER34", "The Girl in the Spider's Web", 117, "Fede Álvarez", "Drama / Suspense");
			matriz[2] = new DVDMusica("TY56", "El mal querer", 30, "Rosalía");
			matriz[3] = new DVDMusica("UI78", "Principios", 33, "Cepeda");
			matriz[4] = new Libro("OP90", "Yo, Julia", "Santiago Posteguillo", 704);
			matriz[5] = new Libro("AS12", "Finales que merecen una historia", "Albert Espinosa", 216);
			matriz[6] = new Libro("DF34", "Sempiterno", "Defreds Jose. A. Gomez Iglesias", 160);
			
			//Con una lista sería
			listaLibros.add(new Pelicula("QW12", "Bohemian Rhapsody", 133, "Bryan Singer", "Drama / Biografía"));
			listaLibros.add(new Pelicula("ER34", "The Girl in the Spider's Web", 117, "Fede Álvarez", "Drama / Suspense"));
			listaLibros.add(new DVDMusica("TY56", "El mal querer", 30, "Rosalía"));
			listaLibros.add(new DVDMusica("UI78", "Principios", 33, "Cepeda"));
			listaLibros.add(new Libro("OP90", "Yo, Julia", "Santiago Posteguillo", 704));
			//etc...
		}
		catch (Exception e) {
			System.out.println("Error de formato");
		}
		
		// Preguntar tipo de producto a alquilar
		System.out.println("¿Qué tipo de producto desea alquilar?");
		System.out.println("1. Libro");
		System.out.println("2. Película");
		System.out.println("3. DVD de música");
		
		// Obtener tipo de producto a alquilar
		Scanner lector = new Scanner(System.in);
		String tipoProducto = lector.nextLine();
		
		// Preguntar producto a alquilar
		switch (tipoProducto) {
			case "1":
				System.out.println("¿Qué libro desea alquilar?");
				for (int i = 0; i < matriz.length; i++) {
					if (matriz[i] == null) {
						break;
					}
					else if (matriz[i] instanceof Libro && ((Producto)matriz[i]).getPrestado() == false) {
						System.out.println(((Producto)matriz[i]).getCodigo() + ": " + ((Producto)matriz[i]).getTitulo());
					}
				}
				/*Con una lista sería
				for(Prestable p : listaLibros){
					if(p instanceof Libro && ((Producto) p).getPrestado() == false){
						System.out.println(((Producto)p).getCodigo() + ": " + ((Producto)p).getTitulo());
					}
				}*/
				break;
			case "2":
				System.out.println("¿Qué película desea alquilar?");
				for (int i = 0; i < matriz.length; i++) {
					if (matriz[i] == null) {
						break;
					}
					else if (matriz[i] instanceof Pelicula && ((Producto)matriz[i]).getPrestado() == false) {
						System.out.println(((Producto)matriz[i]).getCodigo() + ": " + ((Producto)matriz[i]).getTitulo());
					}
				}
				break;
			case "3":
				System.out.println("¿Qué DVD de música desea alquilar?");
				for (int i = 0; i < matriz.length; i++) {
					if (matriz[i] == null) {
						break;
					}
					else if (matriz[i] instanceof DVDMusica && ((Producto)matriz[i]).getPrestado() == false) {
						System.out.println(((Producto)matriz[i]).getCodigo() + ": " + ((Producto)matriz[i]).getTitulo());
					}
				}
				break;
			default:
				System.out.println("Debe introducir un tipo de producto");
				break;
		}
		
		// Obtener producto a alquilar
		String producto = lector.nextLine();
		
		for (int i = 0; i < matriz.length; i++) {
			if (((Producto)matriz[i]).getCodigo().equals(producto)) {
				matriz[i].prestar();
				System.out.println("Ha alquilado \"" + ((Producto)matriz[i]).getTitulo() + "\". Debe devolverlo el " + ((Producto)matriz[i]).getFechaDevolucion().getDayOfMonth() + " de " + ((Producto)matriz[i]).getFechaDevolucion().getMonth() + ".");
				break;
			}
		}
		
		// Preguntar producto a devolver
		System.out.println("Introduzca el código del producto que desea devolver:");
		String devolucion = lector.nextLine();
		lector.close();
		
		if (devolucion != null) {
			for (int i = 0; i < matriz.length; i++) {
				if (((Producto)matriz[i]).getCodigo().equals(devolucion)) {
					((Producto)matriz[i]).devolver();
					break;
				}
			}
		}
		
		// Mostrar productos disponibles
		System.out.println();
		System.out.println("Los productos disponibles son:");
		for (int i = 0; i < matriz.length; i++) {
			if (((Producto)matriz[i]).getPrestado() == false) {
				System.out.println("(" + ((Producto)matriz[i]).getCodigo() + ") \"" + ((Producto)matriz[i]).getTitulo() + "\"");
			}
		}
		
	}

}
