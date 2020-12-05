import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PruebaEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector;
		try {
			System.out.println(Globals.ruta);
			FileWriter escritor = new FileWriter(Globals.ruta,true);
			BufferedWriter bf = new BufferedWriter(escritor);
			bf.newLine();
			
			lector = new Scanner(System.in);
			System.out.println("Introduzca titulo:");
			
			String titulo = lector.next();
			lector = new Scanner(System.in);
			
			System.out.println("Introduzca la valoración:");
			int valoracion = lector.nextInt();
			
			lector = new Scanner(System.in);
			System.out.println("Intro director:");
			String director = lector.next();
			String registro = titulo + "_" + valoracion + "_" + director;
			//lector.close();
			
			bf.write(registro);
			bf.close();
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
