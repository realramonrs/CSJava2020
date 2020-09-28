
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operadores Matemáticos = asignacion
		//+ suma
		//- resta 
		//Ojo con la promoción numérica
		
		short numero2 = 34;
		short numero3 = (short)(numero2 - 1);
		
		//* multiplicación
		// / cociente: Devuelve un entero si los operandos son enteros
		
		int x = 7 , y = 0;
		double cociente = (double)x / y;
		System.out.println("El cociente es : " + cociente);
		
		//Otros operadores matemáticos
		// %: Resto de la división entera
		int resto = x % y;
		System.out.println("El resto de la división entera es: " + resto);
		
		//Incremento y asignación +=
		
		int n = 9;
		n = n+ 5;
		n+=5;
		//Decremento y asignación
		n = n - 2;
		n-=2;
		
		//Preincremento y postIncremento ++
		n = 1;
		int n2 = n++;
		System.out.println("n = " + n);
		System.out.println("n2 = " + n2);
		
		//Predecremento y postdecremento --
		
		int x1 = 10;
		int x2 = x1--;
		
		
		
		
		
	}

}
