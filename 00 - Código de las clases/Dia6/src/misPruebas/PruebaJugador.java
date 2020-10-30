package misPruebas;
import misClases.Jugador;
public class PruebaJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador js[] = new Jugador[10];
		Jugador CR7 = new Jugador();
		
		CR7.equipo = "Juventus";
		CR7.edad = 36;
		
		CR7.numeroGoles = 6;
		CR7.asistencias = 0;
		
		CR7.subirSueldo();
		
		
		
		
	}

}
