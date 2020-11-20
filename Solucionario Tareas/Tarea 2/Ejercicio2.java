import java.util.Scanner;

public class Ejercicio2 {

	public static void guardarCorreo(String []matriz , String correo) {
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i] == null) {
				matriz[i] = correo;
				break;
			}
		}
	}
	
	public static int buscarCorreo(String []matriz , String correo) {
		int pos = -1;
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]!=null) {
				if(matriz[i].equals(correo)) {
					pos = i;
					break;
				}
			}
		
		}
		return pos;
	}
	
	public static int contarCorreo(String []matriz , String dominio) {
		int contador = 0;
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]!=null) {
				//Obtener substring a partir del @
				String dom = matriz[i].substring(matriz[i].indexOf("@"));
			
				if(dom.contains(dominio)) {
					contador++;
				}
			}
				
		}
		return contador;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String emails[] = new String[10];
			
			boolean salir = false;
			String opcion;
			do {
				System.out.println("");
				System.out.println("a. Guardar correo");
				System.out.println("b. Buscar correo");
				System.out.println("c. Contar correos");
				System.out.println("c. Porcentaje correos");
				System.out.println("d. Salir");
				Scanner lector = new Scanner(System.in);
				opcion = lector.nextLine();
				
				switch (opcion) {
				
				case "a":
					System.out.println("");
					System.out.println("Introduzca su correo");
					String correo= lector.nextLine();
					guardarCorreo(emails,correo);
					
					
					break;

				case "b":
					System.out.println("");
					System.out.println("Introduzca el correo a buscar");
					String correoB= lector.nextLine();
					
					int posicion = buscarCorreo(emails, correoB);
					if(posicion > -1) {
						System.out.println("El correo está en la posición : " + posicion);
						}
					else {
						
						System.out.println("No se encontró el correo");
					}
					
					
					break;
					
				case "c":
					System.out.println("");
					System.out.println("Introduzca un dominio" );
					String dominio= lector.nextLine();
					
					int contador = contarCorreo(emails, dominio);
					
					System.out.println("Hay " + contador + " correos");
					break;
				case "d":
					int contadorgmails= contarCorreo(emails, "gmail");
					int contadorhotmails = contarCorreo(emails, "hotmail");;
					int contadoryahoos = contarCorreo(emails, "yahoo");
					int totalCorreos = contadorgmails + contadorhotmails + contadoryahoos;
					
					double porcentajeGmails = ((double)contadorgmails / totalCorreos)*100;
					double porcentajehotmails = ((double)contadorhotmails / totalCorreos)*100;
					double porcentajeyahoos = ((double)contadoryahoos / totalCorreos)*100;
					
					System.out.println("Porcentaje gmail: " + porcentajeGmails +" %." );
					System.out.println("Porcentaje hotmail: " + porcentajehotmails +" %." );
					System.out.println("Porcentaje yahoos: " + porcentajeyahoos +" %." );
					
				case "e":
					salir=true; //Se podría hacer también con System.exit(0);
					System.out.println("");
					System.out.println("Programa cerrado con éxito");
					break;	
				}
				
				
			} while(salir!=true);
	}

}
