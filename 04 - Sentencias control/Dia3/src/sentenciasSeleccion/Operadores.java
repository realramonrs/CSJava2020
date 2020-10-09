package sentenciasSeleccion;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores relacionales
		//igualdad ==
		int x = 9,y=8;
		
		
		boolean c1 = x == y;
		System.out.println(c1);
		
		//Distinto que !=
		
		boolean c2 = x!=y;
		//<,> ,<=,>=
		
		boolean c3 = x<y;
		boolean c4 = x<=y;
		
		//Operadores lógicos.
		//Y lógico ---> && -->Devuelve true si las 2 condiciones son verdaderas
		
		boolean c5 = x<100 && y>50;
		
		//O lógico --> || -->Devuelve true si 1 de las condiciones es verdadera
		boolean c6 = x<100 || y>50;
		
		//No ->! !true = false --> !false = true
		
		boolean c7 = !c6;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
