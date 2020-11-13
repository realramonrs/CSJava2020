
public class Principal2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar una matriz para almacenar a 25 jugadores
		
		Jugador plantilla[] = new Jugador[25];
		
		//plantilla[0]----->null
	    //plantilla[1]----->null
	    //plantilla[2]----->null
		
		plantilla[0] = new Jugador("Luis Suárez",34);
		plantilla[1] = new Jugador("Pablo Costa",39);
		
		plantilla[0].setPuntos(230);
		Jugador j3 = new Jugador();
		Jugador.addJugador(plantilla,j3);
		
		j3.setNombre("Pepito Grillo");
		j3.setPuntos(450);
		//Añadir un jugador con instanciación anónima
		//new Jugador();//Garbage collector se lo carga
		Jugador.addJugador(plantilla, new Jugador("Gepetto",75));
		
		Jugador.printarMatriz(plantilla);
		
		//Mostrar jugadores con más de 70 ptos
		System.out.println();
		System.out.println("Jugadores con más de 70 puntos:");
		for(Jugador j : plantilla) {
			if(j!=null) {
				if(j.getPuntos()>70) {
					//j.mostrarJugadorPorConsola();
					System.out.println(j);
				}
			}
			else {
				break;
			}
			
		}
	
		//Mostrar por pantalla aquellos jugadores cuyo nombre empieza por P
		//startsWidth("P")
		for(Jugador j : plantilla) {
			if(j!=null) {
			if(j.getNombre().startsWith("P")) {
				System.out.println(j);
			}
			}
			else {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
