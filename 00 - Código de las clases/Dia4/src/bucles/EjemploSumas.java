package bucles;

public class EjemploSumas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sumar los 1000 primeros números = 1 + 2 + 3 + 4 + ... + 1000
		
		int suma=0;
		int i = 1;
		
		for(i = 1;i<=1000;i=i+1) {
			suma = suma + i;
		}
		
		System.out.println(suma);
		
		/*
		int suma = 1;
		
		for(;suma<1000;) {
			suma = suma + suma;
		}
		*/
		

	}

}
