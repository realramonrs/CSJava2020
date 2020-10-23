package tema5Metodos;

public class PruenaMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menor1 = Matematicas.minimo(4,5,8);
		int menor2 = Matematicas.minimo(1,2,3,4,5,6,7,8,9);
		int menor3 = Matematicas.minimo(8,4,1,90,-4);
		
		MiConsola.p("Minimo 1 " + menor1);
		MiConsola.p("Minimo 2 " + menor2);
		MiConsola.p("Minimo 3 " + menor3);
	}

}
