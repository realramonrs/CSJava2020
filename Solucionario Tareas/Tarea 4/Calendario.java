/**
 * 
 */
package tarea;

import java.util.Arrays;

/**
 * @author Ramon RS
 *
 */
public class Calendario {
	
	private Evento eventos[];
	
	public Calendario() {
		eventos = new Evento[10];
	}
	
	public Calendario(int tamanho) {
		eventos = new Evento[tamanho];
	}
	
	public void setEvento(Evento e) {
		for(int i = 0;i<eventos.length;i++) {
			if(eventos[i]==null) {
				eventos[i] = e;
				break;
			}
		}
	}
	
	public Evento getEvento(int posicion) {
		
		
		if(posicion<eventos.length) {
			return eventos[posicion];
		}
		else {
			return null;
		}	
		
		
	}

	@Override
	public String toString() {
		String mensaje = "";
		for(Evento e : eventos) {
			if(e!=null) {
				mensaje+=e.toString() +"\n";
			}
			else {
				break;
			
			}
		}
		return mensaje ;
	}
	
	

}
