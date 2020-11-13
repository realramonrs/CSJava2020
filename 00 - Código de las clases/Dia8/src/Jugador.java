
public class Jugador extends Object {

	private String nombre;
	private int edad;
	private int puntos;
	//Atributos de clase--> static
	public static String equipo;
	private static String competicion;
	
	//Constructores
	
	public Jugador() {
		
	}
	
	public Jugador(String nombre,int edad) {
		this.nombre = nombre;
		
		setEdad(edad);
		//puntos = 0;
	}
	
	//Métodos de acceso
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad>=18)
			this.edad = edad;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public static void setCompeticion(String competicion) {
		Jugador.competicion = competicion;
	}
	
	public static String getCompeticion() {
		return competicion;
	}
	
	
	public void mostrarJugadorPorConsola() {
		System.out.println("Nombre: " + nombre + " edad: " + edad + " puntos: " + puntos);
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", puntos=" + puntos + " equipo= " + equipo+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public static void addJugador(Jugador j[],Jugador j1) {
	
				for(int i = 0;i<j.length;i++) {
					if(j[i]==null) {
						j[i] = j1;
						break;
					}
				}
		
	}
	
	public static void printarMatriz(Jugador j[]) {
		for(Jugador jugador : j) {
			if(jugador!=null) {
				System.out.println(jugador);
			}
			else {
				break;
			}
		}
	}
	
	public static int contarJugadores(Jugador j[]) {
		int contador = 0;
		
		for(Jugador jug : j) {
			if(jug!=null) {
				contador++;
			}
		}
		return contador;
	}	
		
}
