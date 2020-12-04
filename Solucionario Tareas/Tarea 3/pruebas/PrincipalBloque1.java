package pruebas;
import java.util.Scanner;

import bloqueEjercicios1.misMetodos;
public class PrincipalBloque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectorEjercicio = new Scanner(System.in); // Este el lector permite leer el ejercicio que el usuari oquiere probar
		
		int ejercicio; //Esta variable almacenará el ejercicio escogido por el usuario
		
		char continuar; //Esta variable se utiliza para decidir si el usuario quiere salir o no del programa
		
		//A continuación mostramos el menú , añadimos bucle do - while ya que todo lo que viene a continuación debe de repetirse
		//mientras el usuario quiera seguir ejecutando el programa
		
		do{
		System.out.println("Escoge un ejercicio:");
		System.out.println("1. Llenar matriz con números aleatorios");
		System.out.println("2. Llenar matriz con úmeros aleatorios entre dos valores.");
		System.out.println("3. Obtener letra del dni.");
		System.out.println("4. Comprobar dni");
		System.out.println("5 y 6. Buscar número en matriz");
		System.out.println("7. Calcular el mínimo común múltiplo de 3 números.");
		System.out.println("8. Calcular el máximo de n números.");
		System.out.println("9. Ordenar matriz de mayor a menor.");
		System.out.println("10. Comprobar seguridad contraseña.");
		ejercicio = lectorEjercicio.nextInt();
		switch (ejercicio) {
		case 1:
			int matriz[];
			Scanner lectorEjercicio1 = new Scanner(System.in);
			int capacidadMatriz;
			System.out.println("Cuántos elementos desea guardar en la matriz?");
			capacidadMatriz = lectorEjercicio1.nextInt();
			
			matriz = new int[capacidadMatriz];
			
			misMetodos.generarMatiz(matriz);
			
			misMetodos.mostrarMatriz(matriz);
			break;
		case 2:
			int matriz2[];
			Scanner lectorEjercicio2 = new Scanner(System.in);
			int capacidadMatriz2,limiteInferior,limiteSuperior;
			System.out.println("Cuántos elementos desea guardar en la matriz?");
			capacidadMatriz2 = lectorEjercicio2.nextInt();
			
			matriz2 = new int[capacidadMatriz2];
			
			System.out.print("Escoja límite inferior:");
			limiteInferior = lectorEjercicio2.nextInt();
			System.out.print("Escoja límite superior:");
			limiteSuperior = lectorEjercicio2.nextInt();
			misMetodos.generarMatiz(matriz2,limiteInferior,limiteSuperior);
			
			misMetodos.mostrarMatriz(matriz2);
			break;
		case 3:
			String dni;
			Scanner lectorDni = new Scanner(System.in);
			System.out.println("Introduce dni sin letra");
			dni = lectorDni.nextLine();
			
			char letra = misMetodos.getLetraDni(dni);
			if(letra==' ')
				System.out.println("El dni introducido es erróneo");
			else
			System.out.println("Su letra es: " + letra);
			break;
		case 4:
			String dni2;
			Scanner lectorDni2 = new Scanner(System.in);
			System.out.println("Introduce dni con letra");
			dni2 = lectorDni2.nextLine();
			
			boolean correcto = misMetodos.validarDni(dni2);
			if(correcto)
				System.out.println("El dni introducido es correcto");
			else
			System.out.println("Dni no válido");
			break;
		case 5:
		case 6:
			int matriz5[];
			Scanner lectorEjercicio5 = new Scanner(System.in);
			int capacidadMatriz5,limiteInferior5,limiteSuperior5;
			System.out.println("Cuántos elementos desea guardar en la matriz?");
			capacidadMatriz5 = lectorEjercicio5.nextInt();
			
			matriz5 = new int[capacidadMatriz5];
			
			System.out.print("Escoja límite inferior:");
			limiteInferior5 = lectorEjercicio5.nextInt();
			System.out.print("Escoja límite superior:");
			limiteSuperior5 = lectorEjercicio5.nextInt();
			misMetodos.generarMatiz(matriz5,limiteInferior5,limiteSuperior5);
			
			misMetodos.mostrarMatriz(matriz5);
			
			System.out.println("¿Qué número desea buscar en la matriz?");
			int numeroABuscar = lectorEjercicio5.nextInt();
			System.out.println("Desea obtener la última o la primera posicion");
			System.out.println("Ultima aparición: u");
			System.out.println("Primera aparición: p");
			Scanner lectorUltimaPos = new Scanner(System.in);
			char ultima = lectorUltimaPos.nextLine().charAt(0);
			
			if(ultima=='u'){
				int posicion = misMetodos.buscarNumero(matriz5, numeroABuscar, true);
				if(posicion == -1){
					System.out.println("No está el número en la matriz");
				}
				else{
					System.out.println("El " + numeroABuscar + "aparece por última vez en la posición: " + posicion);
				}
				
			}
			else{
				int posicion = misMetodos.buscarNumero(matriz5, numeroABuscar);
				if(posicion == -1){
					System.out.println("No está el número en la matriz");
				}
				else{
					System.out.println("El " + numeroABuscar + " está en la posición: " + posicion);
				}
			}
			break;
			
		case 7:
			int x,y,z;
			Scanner lector7 = new Scanner(System.in);
			System.out.println("Introduce el primer valor:");
			x = lector7.nextInt();
			System.out.println("Introduce el segundo valor:");
			y = lector7.nextInt();
			System.out.println("Introduce el tercer valor:");
			z = lector7.nextInt();
			
			int minComun = misMetodos.getMinimoComun(x, y, z);
			System.out.println("El mínimo común múltiplo de: " + x + " " + y + " " + z + " es: " + minComun);
			break;
		case 8:
			int cantidadNumeros=0;
			
			//Si queremos que los valores los decida el usuario se complica un poco
			//la situación
			Scanner lector8 = new Scanner(System.in);
			System.out.println("Introduzca cantidad de numeros :");
			cantidadNumeros = lector8.nextInt();
			int matriz8[]= new int[cantidadNumeros];
			
			for(int i = 0;i<matriz8.length;i++) {
				System.out.println("Introduzca valor : " + i);
				matriz8[i] = lector8.nextInt();
			}		
			
			switch(matriz8.length) {
			case 2:
				int max2 = misMetodos.getMaximo(matriz8[0], matriz8[1]);
				System.out.println("El mayor es: " + max2);
				break;
			case 3:
				int max3 = misMetodos.getMaximo(matriz8[0], matriz8[1],matriz8[2]);
				System.out.println("El mayor es: " + max3);
				break;
			case 4:
				
				int max4 = misMetodos.getMaximo(matriz8[0], matriz8[1],matriz8[2],matriz8[3]);
				System.out.println("El mayor es: " + max4);
				break;
			case 5:
				
				int max5 = misMetodos.getMaximo(matriz8[0], matriz8[1],matriz8[2],matriz8[3],matriz8[4]);
				System.out.println("El mayor es: " + max5);
				break;
			default:
				System.out.println("Cantidad demasiado grande.");
				break;
			}
			
			//Podríamos ejecutarlo para probar con diferentes situaciones
			//de la siguiente forma.
			/*int max1 = misMetodos.getMaximo(9, 4);
			int max2 = misMetodos.getMaximo(9, 4, 10);
			int max3 = misMetodos.getMaximo(9, 4, 3,1,10,3,5,12);
			int max4 = misMetodos.getMaximo(7, 13, 1,2);
			
			System.out.println("Maximo de (9, 4) " + max1);
			System.out.println("Maximo de (9, 4, 10) " + max2);
			System.out.println("Maximo de (9, 4, 3,1,10,3,5,12) " + max3);
			System.out.println("Maximo de (7, 13, 1,2) " + max4);*/
			
			break;
		case 9:
			int matriz9[];
			Scanner lectorEjercicio9 = new Scanner(System.in);
			int capacidadMatriz9;
			System.out.println("Cuántos elementos desea guardar en la matriz?");
			capacidadMatriz9 = lectorEjercicio9.nextInt();
			
			matriz9 = new int[capacidadMatriz9];
			
			misMetodos.generarMatiz(matriz9,1,50);
			
			misMetodos.mostrarMatriz(matriz9);
			System.out.println();
			int copiaOrdenada[] = misMetodos.ordenar(matriz9);
			
			System.out.println("Matriz ordenada de mayor a menor:");
			misMetodos.mostrarMatriz(copiaOrdenada);
			System.out.println();
			
		case 10:
			String password;
			Scanner lector10 = new Scanner(System.in);
			System.out.println("Introduce el password :");
			password = lector10.nextLine();
			
			misMetodos.validarPassword(password);
			break;
		
		default:
			break;
		} //Fin del switch
		
	    Scanner lectorContinuar = new Scanner(System.in);	    
		
		System.out.println("Desea ejecutar otro ejercicio: Pulse la s en caso afirmativo, o cualquier otra tecla si desea salir.");
		continuar = lectorContinuar.nextLine().charAt(0);
		} while(continuar=='s');
	}

}
