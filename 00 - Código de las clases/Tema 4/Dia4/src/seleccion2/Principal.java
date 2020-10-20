package seleccion2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sentencia switch --> if else if else --> Cuando se evalúa una variable
		//con valores discretos
		
		
		//Por ejemplo: 
		
		int opcion = 2; 
		
		switch(opcion) {
		
			case 1:
				System.out.println("Has pulsado el 1.");
			break;
						
			case 2:
				System.out.println("Has pulsado el 2");
				break;
			case 3:
				System.out.println("Has pulsado el 3");
				break;
			default:
				System.out.println("Has escogido otra opción");
				break;
		}//Llave que cierra el switch
		
		char opcion2='e';
		
		
		switch(opcion2) {
		case 'A':
		case 'a':
		case 'i':
			System.out.println("Opción a: o Opción i");
			break;
		case 'e':
			break;
		
		default:
			break;
		}
		
				
		
		/*
		if(opcion==1) {
			System.out.println("Has pulsado el 1");
		}
		else if(opcion==2) {
			System.out.println("Has pulsado el 2");
		}
		else if(opcion==3) {
			System.out.println("Has pulsado el 3");
		}
		else {
			System.out.println("Has pulsado otra tecla");
		} */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
