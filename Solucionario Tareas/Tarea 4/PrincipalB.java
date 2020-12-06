/**
 * 
 */
package tarea;

/**
 * @author Ramon RS
 *
 */
public class PrincipalB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evento eventos[] = new Evento[10];
		Calendario calendario = new Calendario();
		
		calendario.setEvento(new Evento(new Fecha(10,2,2018),"Concierto de U2"));
		calendario.setEvento(new Evento(10,3,2019,"Partido del Celta"));
		Evento e1 = new Evento(new Fecha(19,5,2019),"Revisión medica");
		calendario.setEvento(e1);
		
		System.out.println(calendario);
		
		//Prueba getEvento
		
		Evento e2 = calendario.getEvento(0);
		System.out.println(calendario.getEvento(1));
		
		

	}

}
