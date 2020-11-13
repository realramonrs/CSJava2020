
public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JugadorCollection plantilla = new JugadorCollection(10);
		
		plantilla.addJugador(new Jugador("Aspas",34));
		plantilla.addJugador(new Jugador("Hugo Mallo",30));
		plantilla.addJugador(new Jugador("Murillo",29));
		
		
		plantilla.printarMatriz();
		
		
	}

}
