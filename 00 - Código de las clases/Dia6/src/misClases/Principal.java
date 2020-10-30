package misClases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "Estamos en cuarentena";
		int numeroVocales = MetodosCadenas.contarVocales(mensaje);
		
		
		System.out.println(mensaje + " tiene " + numeroVocales + " vocales.");
		
		//Probar método getFirstNullPosition
		
		String cadenas[] = {"Rodrigo",null,"Alejandro","Cousiño"};
		
		int primeraPosVacía = MetodosCadenas.getFirstNullPosition(cadenas);
		
		
		if(primeraPosVacía<0) {
			System.out.println("No hay posiciones vacías.");
		}
		else {
			System.out.println("La primera pos vacía es : " + primeraPosVacía);
		}
		
		
		
	}

}
