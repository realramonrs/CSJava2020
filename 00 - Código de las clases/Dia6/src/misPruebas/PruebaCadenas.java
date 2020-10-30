package misPruebas;

import misClases.MetodosCadenas;

public class PruebaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "Me encanta Java";
		int vocales = MetodosCadenas.contarVocales(mensaje);
		
		System.out.println(MetodosCadenas.contarVocales(mensaje));
		
		MetodosCadenas.p(mensaje + " tiene " + vocales + " vocales.");
		
		//Prueba de método spaceKiller
		String cadenaConSpacios = "  Estos es una   prueba  ";
		cadenaConSpacios =  MetodosCadenas.spaceKiller(cadenaConSpacios);
		
		System.out.println(cadenaConSpacios);
		
		
		
		
	}

}
