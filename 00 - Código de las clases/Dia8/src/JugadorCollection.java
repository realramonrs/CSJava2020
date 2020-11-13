
public class JugadorCollection {

	private Jugador j[];
	
	public JugadorCollection() {
		j = new Jugador[2];
	}
	
	public JugadorCollection(int capacidad) {
		j = new Jugador[capacidad];
	}
	
	public JugadorCollection(Jugador j[]) {
		this.j = j;
	}
	
	//Método que añade un jugador en la primera posición vacía
	
	public void addJugador(Jugador j1) {
		for(int i = 0;i<j.length;i++) {
			if(j[i]==null) {
				j[i] = j1;
				break;
			}
		}
	}
	
	//Metodo que printa matriz por pantalla
	public void printarMatriz() {
		for(Jugador jug : j) {
			if(jug!=null) {
				System.out.println(jug);
			}
			else {
				break;
			}
		}
	}
	
	
}
