package sentenciasSeleccion;

public class ExplicacionIfelseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float temperaturaDelAgua = 200f;
		
		//Programa indica si el agua está en fase líquida,gaseosa o sólida
		
		if(temperaturaDelAgua <= 0) {
			System.out.print("Sólida , es hielo");
		}
		else if(temperaturaDelAgua < 100) {
			System.out.println("Líquida, es agua");
		}
		else {
			System.out.println("Gaseosa , es vapor de agua");
		}
		
		
		
		
	}

}
