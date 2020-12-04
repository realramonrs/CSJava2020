import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PruebaSerializar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula ps[] = new Pelicula[2];
		
		ps[0] = new Pelicula("Jumanji",6,"Un director");
		ps[1] = new Pelicula("Los Cazafantasmas",9,"No me acuerdo");
		
		try {
			FileOutputStream salida = new FileOutputStream(Globals.ruta2);
			
			ObjectOutputStream writer = new ObjectOutputStream(salida);
			writer.writeObject(ps);
			
			writer.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
