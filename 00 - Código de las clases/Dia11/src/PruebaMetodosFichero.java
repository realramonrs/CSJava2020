
public class PruebaMetodosFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String peliculas = Globals.leerFichero(Globals.ruta);
		
		Globals.escribirFichero(Globals.ruta, true, "Solo en casa_6_No se");
		
		System.out.println(peliculas);
	}

}
