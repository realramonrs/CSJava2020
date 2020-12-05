import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Globals {

	public static final String ruta = System.getProperty("user.dir") + "\\datos.txt";
	public static final String ruta2 = System.getProperty("user.dir") + "\\datos2.txt";
	
	public static String leerFichero(String ruta) {
		String contenido="";
		try {
			FileReader lector = new FileReader(ruta);
			BufferedReader bf = new BufferedReader(lector);
			
			String registro = "";
			while(registro!=null) {
				registro = bf.readLine();
				contenido+=registro +"\n";
				
			}
			
			bf.close();
			lector.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("**************************");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return contenido;
	}
	
	public static void escribirFichero(String ruta,boolean a,String registro) {
		
		try {
			FileWriter escritor = new FileWriter(ruta,a);
			BufferedWriter bf = new BufferedWriter(escritor);
			bf.newLine();
			bf.write(registro);
			
			bf.close();
			escritor.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
