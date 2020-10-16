package bucles;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mostrar la tabla de multiplicar de un número
		int numero = 9;
		int i = 1;
		
		while(i<=10) {
			System.out.println(numero + "*" + i +" = " + numero*i);
			
			//modificación de la variable de control
			//i = i + 1;
			//i+=1
			i++;
		}
		
		System.out.println("Variable i = " + i);
		
		/*System.out.println(numero + "*1 = " + numero*1);
		System.out.println(numero + "*2 = " + numero*2);
		System.out.println(numero + "*3 = " + numero*3);
		System.out.println(numero + "*4 = " + numero*4);
		System.out.println(numero + "*5 = " + numero*5);*/
		//...
		//System.out.println(numero + "*10 = " + numero*10);
		
		
		
		
	}

}
