/**
 * 
 */
package tarea;

/**
 * @author Ramon RS
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha f1 = new Fecha();
		
		System.out.println(f1);
		f1.setAnho(2018);
		f1.setDia(23);
		f1.setMes(10);
		System.out.println(f1);
		
		Evento e1 = new Evento(f1,"Cita médico");
		Evento e2 = new Evento(new Fecha(10,12,2018),"Examen Programacion");
		Evento e3 = new Evento(12 , 5 , 2020 , "Examen Conducir");
		
		e1.setDescripcion("Revisión anual");
		e2.setDescripcion("Examen final de la asignatura del Ciclo Superior");
		
		e2.getFecha().setMes(2);
		e2.getFecha().setDia(10);
		
		e2.setFecha(new Fecha(3,10,2019));
		
		System.out.println(e2);
		
		
		Evento misEventos[] = new Evento[4];
		misEventos[0]= e1;
		misEventos[1] = e2;
		misEventos[2] = e3;
		misEventos[3] = new Evento(10,2,2019,"Vacuna gripe");
		
		for(Evento e : misEventos) {
			if(e!=null) {
			System.out.println(e);
			}
		}
		
		
		
	}

}
