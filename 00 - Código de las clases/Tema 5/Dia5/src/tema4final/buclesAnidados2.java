package tema4final;

public class buclesAnidados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String matriz[]= {"12345fhfh678R","K3430V","PT09876543F"};
		int contador=0;	
		//Contar cuantas letras hay en cada string de la matriz
						
		for(int posicion = 0;posicion<matriz.length;posicion++) {
			String palabra = matriz[posicion];
			contador = 0;
			for(int j = 0;j<palabra.length();j++) {
				if(Character.isLetter(palabra.charAt(j))) {
					contador++;
				}
			}//Cierre del for interno
			System.out.println(palabra + " tiene " + contador + " letras");
			
		}//Cierre del for externo
		
		
		
		
	}

}
