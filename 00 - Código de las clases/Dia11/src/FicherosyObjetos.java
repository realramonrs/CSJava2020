import java.io.File;
import java.util.Arrays;

public class FicherosyObjetos {

	public static Pelicula[] redim(Pelicula p[]) {
		Pelicula copia[] = new Pelicula[p.length+1];
		
		for(int i = 0;i<p.length;i++) {
			copia[i] = p[i];
		}
		
		return copia;
	}
	
	
	public static Pelicula[] eliminar(Pelicula p[],int posicion) {
		
		if(posicion<p.length) {
			
			p[posicion] = null;
			
			//Reordenar la matriz
			Pelicula copia[] = new Pelicula[p.length];
			int contador = 0;
			
			for(int i = 0;i<p.length;i++) {
				if(p[i]!=null) {
					copia[contador] = p[i];
					contador++;
				}
			}
			
			
			return copia;
		}
		else {
			return p;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula ps[] = new Pelicula[2];
		
		ps[0] = new Pelicula("Jumanji",6,"Un director");
		ps[1] = new Pelicula("Los Cazafantasmas",9,"No me acuerdo");
		/*ps[2] = new Pelicula("Adf",3,"adsf");
		ps[3] = new Pelicula("dsf",45,"wer");*/
		//algoritmo para redimensionar matrices estáticas (Estructuras de datos Java (Mark Allen Weis)
			
		
		ps = redim(ps);
		ps[2] = new Pelicula("dsaf",9,"adf");
		
		ps = eliminar(ps, 0);
		
		for(Pelicula pel : ps) {
			System.out.println(pel);
		}
		
		
		//peli1
		//peli3
		//peli4
		//peli4
		//null
		//null
		
		
		
			String registro="";	
			for(Pelicula o : ps) {
				registro = o.getTitulo()+"_"+o.getValoracion()+"_"+o.getDirector();
				
				Globals.escribirFichero(Globals.ruta, true, registro);
			}
			
			File f = new File(Globals.ruta);
		
			
		
	}

}
