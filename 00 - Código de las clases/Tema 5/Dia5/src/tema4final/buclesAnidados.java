package tema4final;

public class buclesAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 2;
		
		for(int exterior = numero;exterior>=1;exterior--) {
		
		System.out.println("Tabla del " + exterior);
		for(int i = 1;i<=10;i++) {
			System.out.println(exterior +"*" + i +" = " + exterior*i);
		}
		
		
		}
		
	/*	System.out.println("Tabla del 8");
		for(int i = 1;i<=10;i++) {
			System.out.println(8 +"*" + i +" = " + 8*i);
		}
		
		System.out.println("Tabla del 7");
		for(int i = 1;i<=10;i++) {
			System.out.println(7 +"*" + i +" = " + 7*i);
		}
		*/
		
		
	}

}
