package bucles;

public class ForMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombres[] = {"Fernando","Iago","Angel","Maria","Luis","Angel"};
		//Mostrar todos los nombres que contienen una a
	/*	for(int i=0;i<nombres.length;i++) {
			if(nombres[i].indexOf("a")>=0) {
				nombres[i] = nombres[i].replace('a', 'e');
				System.out.println(nombres[i]);
			}			
		}*/
		
		System.out.println("Con bucle for mejorado o for each");
		//for mejorado for(TipoVariable nombre : matriz){...}
		
		for(String valor : nombres) {
			if(valor.contains("a")) {				
				System.out.println(valor);
				
			}
			
		}
		
		//Contar las veces que aparece Angel
		
		int contadorAngeles =0;
		for(String valor : nombres) {
			if(valor.equals("Angel")) {
				contadorAngeles++;
			}
		}
		
		System.out.println(" Hay " + contadorAngeles + " Angeles");
		
		
		
		
	}

}
