import java.io.*;
public class PruebaLectura {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Globals.ruta);
		
		try {
			FileReader lector = new FileReader(Globals.ruta);
			BufferedReader bf = new BufferedReader(lector);
			
			String registro = "";
			while(registro!=null) {
				//Mostrar peliculas de Nolan
				registro = bf.readLine();
				if(registro!=null)
					if(registro.split("_")[2].equals("Nolan"))
							System.out.println(registro);
			}
			
			//Cerrar los accesos al recurso
			bf.close();
			lector.close();
			
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en la lectura del fichero");
		}
		
		
	}

}
