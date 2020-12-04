import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PruebaDeserializar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula []misPelis;
		
		FileInputStream entrada;
		try {
			entrada = new FileInputStream(Globals.ruta2);
			ObjectInputStream lector = new ObjectInputStream(entrada);

			misPelis = (Pelicula[])lector.readObject();
			
			for(Pelicula p : misPelis) {
				System.out.println(p);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
