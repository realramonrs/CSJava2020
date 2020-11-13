
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador.equipo = "Real Oviedo";
		Jugador.setCompeticion("Liga das cidades");
		
		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador("Yeray",20);
		Jugador j3 = new Jugador("Zidane",55);
		j3.setPuntos(200);
		//Establecer nombre de j1
		j1.setNombre("Aspas");
		
		Jugador.equipo="FC Barcelona";
		
		System.out.println("Jugador 2: " + j2.getNombre() + " edad: " + j2.getEdad() + " puntos: " + j2.getPuntos());
		
		//Mostrar info de j3
		
		j3.mostrarJugadorPorConsola();
		
		System.out.println("J3 con tostring:");
		System.out.println(j3.toString());
		System.out.println(j3);
		
		//Más métodos de la clase object
		System.out.println("Código hash de j3 : " + j3.hashCode());
		System.out.println("Código hash de j2 : " + j2.hashCode());
		System.out.println("Código hash de j1 : " + j1.hashCode());
		
		//equals : compara referencias (hashcodes)
		//j1 = j2;
		boolean iguales = j1.equals(j2);
		boolean iguales2 = j2.equals(j3);
		
		
		System.out.println("j1 = j2 ?? " + iguales);
		System.out.println("Código hash de j2 : " + j2.hashCode());
		System.out.println("Código hash de j1 : " + j1.hashCode());
		
		
		
	}

}
