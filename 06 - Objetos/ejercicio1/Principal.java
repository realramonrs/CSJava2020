/**
 * 
 */
package ejercicio1;

/**
 * @author Ramon RS
 *
 */

public class Principal {
	//Método buscar libro en matriz a partir del titulo
	public static Libro buscaLibro(Libro l[] , String titulo) {
		Libro buscado = null;
		for(int i = 0;i<l.length;i++) {
			if(l[i].getTitulo()==titulo) {
				buscado = l[i];
				break;
			}
		}
		
		return buscado;
	}
	
	//Método buscar libro en matriz a partir del titulo
		public static boolean contieneLibro(Libro l[] , String titulo) {
			boolean encontrado = false;
			for(int i = 0;i<l.length;i++) {
				if(l[i].getTitulo()==titulo) {
					encontrado = true;
					break;
				}
			}
			
			return encontrado;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro();
		Libro libro2 = new Libro("Los pilares de la Tierra","Ken follet",1998,(short)1350);
		
		//Establecemos valores para libro1
		libro1.setTitulo("El médico");
		libro1.setAutor("Noah Gordon");
		libro1.setAnho(1995);
		libro1.setNumPaginas((short)875);
		
		//Valoramos los dos libros , que inicialmente guardan el valor 0 en su valoracion
		libro1.setValoracion(9);
		libro2.setValoracion(9.5f);
		
		
		//Mostrar por pantalla los datos del libro con la valoración más alta
		if(libro1.getValoracion()>libro2.getValoracion()) {
			System.out.println(libro1);
		}
		else {
			System.out.println(libro2);
		}
		
		//Creamos una matriz de libros
		Libro []libreria = new Libro[10];
		libreria[0] = libro1;
		libreria[1] = libro2;
		
		//Añadimos otros 2 libros
		libreria[2] = new Libro("La fundacion","Isaac Asimov",1960,(short)900);
		libreria[3] = new Libro("Parque Jurásico","Michael Crichton",1992,(short)755);
		libreria[2].setValoracion(8);
		libreria[3].setValoracion(7);
		System.out.println();
		System.out.println("Libros guardados en la librería:");
		
		//Mostrar libros de la matriz
		
		for(Libro l : libreria) {
			if(l!=null)
			System.out.println(l);
		}
		
		//Mostrar el que tenga la valoración más alta
		float valoracion = libreria[0].getValoracion();
		Libro masValorado = null;
		for(int i = 1;i<libreria.length;i++) {
			if(libreria[i]!=null) {
			if(libreria[i].getValoracion()>valoracion) {
				valoracion = libreria[i].getValoracion();
				//Almacenamos en una referencia el libro
				masValorado = libreria[i];
			}
			}
			else {
				break;
			}
		}
		
		System.out.println();
		System.out.println("El libro más valorado es : ");
		if(masValorado==null) {
			//Quiere decir que el mas valorado es libreria[0]
			System.out.println(libreria[0]);
		}
		else {
			System.out.println(masValorado);
		}
		
		//Mostrar el que tenga la valoración más alta
				float valoracion2 = libreria[0].getValoracion();
				Libro menosValorado = null;
				for(int i = 1;i<libreria.length;i++) {
					if(libreria[i]!=null) {
					if(libreria[i].getValoracion()<valoracion2) {
						valoracion2 = libreria[i].getValoracion();
						//Almacenamos en una referencia el libro
						menosValorado = libreria[i];
					}
					}
					else {
						break;
					}
				}
				
				System.out.println();
				System.out.println("El libro con la valoracion más baja es : ");
				if(menosValorado==null) {
					//Quiere decir que el mas valorado es libreria[0]
					System.out.println(libreria[0]);
				}
				else {
					System.out.println(menosValorado);
				}
		
				System.out.println();
		//Probando la función que busca un libro en matriz a partir del titulo
				
				System.out.println("Probando función buscaLibro(libreria, Parque Jurásico)");
				Libro libroBuscado = buscaLibro(libreria , "Parque Jurásico");
				
				if(libroBuscado==null) {
					System.out.println("El libro no se encuentra en la libreria");
				}
				else {
					System.out.println(libroBuscado);
				}
				
				//Probando la función que dice si un libro está en matriz a partir del titulo
				
				System.out.println("Probando función contieneLibro(libreria, Parque Jurásico)");
				boolean libroEncontrado = contieneLibro(libreria , "Parque Jurásico");
				
				if(libroEncontrado==false) {
					System.out.println("El libro no se encuentra en la libreria");
				}
				else {
					System.out.println(libroBuscado);
				}
		
		
	}

}
