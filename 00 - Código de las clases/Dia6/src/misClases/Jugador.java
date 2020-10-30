package misClases;

public class Jugador {

	public String nombre;
	public int edad;
	public int numeroGoles;
	public String posicion;
	public String equipo;
	public int asistencias;
	public int tarjetasAmarillas;	
	public double sueldo;
	
	
	public void subirSueldo() {
		if(numeroGoles>20) {
			sueldo+=1000;
		}
	}
	
	
}
