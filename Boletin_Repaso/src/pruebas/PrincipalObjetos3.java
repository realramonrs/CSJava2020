package pruebas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import misClases.Tarea;

public class PrincipalObjetos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos una lista de Tareas (Ver Tema 9: Colecciones)
		
		ArrayList<Tarea> misTareas = new ArrayList<Tarea>();
		//Creamos lista para guardar tareas completadas (Apartado G)
		ArrayList<Tarea> misTareasCompletadas = new ArrayList<Tarea>();
		//Metemos unas tareas inicialmente
		misTareas.add(new Tarea("Ir al supermercado","Comprar cena del Sábado",false,LocalDate.parse("2020-01-10")));
		misTareas.add(new Tarea("Renovar carnet conducir","Solicitar vez en psicotécnico",true,LocalDate.parse("2020-02-12")));
		
		char opcion=' ';
		
		do{
			System.out.println("Que desea hacer?");
			System.out.println("a.Añadir tarea.");
			System.out.println("b.Modificar tarea.");
			System.out.println("c.Ver tareas");
			System.out.println("d.Ver tareas importantes.");
			System.out.println("e.Completar una tarea: Permite marcar una tarea como realizada");
			System.out.println("f.Eliminar tareas realizadas.");
			System.out.println("g.Ver tareas realizadas.");
			System.out.println("h. Salir");
			Scanner lectorOpcion = new Scanner(System.in);
			opcion = lectorOpcion.nextLine().charAt(0);
			
			switch(opcion){
			case 'a':
				
			case 'A':
				//Añadir Tarea
				Tarea t = new Tarea();
				Scanner lector = new Scanner(System.in);
				System.out.println("Introduzca titulo tarea:");
				t.setTitulo(lector.nextLine());
				System.out.println("Introduzca descripcion");
				t.setDescripcion(lector.nextLine());
				System.out.println("Introduzca fecha : aaaa-mm-dd:");
				t.setFechaLimite(LocalDate.parse(lector.nextLine()));
				System.out.println("Es importante? s/n");
				String importante = lector.nextLine();
				if(importante.equals("s")){
					t.setImportante(true);
				}
				
				misTareas.add(t);
				break;
			case 'b':
			case 'B':
				Scanner lectorApartadoB = new Scanner(System.in);
				System.out.println("Introduzca titulo tarea que desea modificar");
				String titulo = lectorApartadoB.nextLine();
				//Buscamos tarea
				boolean encontrada = false;
				for(Tarea tareita:misTareas){
					if(tareita.getTitulo().contains(titulo)){
						System.out.println("Tarea que desea modificar es: ");
						//Mostramos datos actuales de la tarea.
						System.out.println(tareita);
						
						//Solicitamos datos para modificar tarea
						System.out.println("Cuántos días quiere retrasar la fecha límite?");
						int dias = lectorApartadoB.nextInt();
						
						tareita.setFechaLimite(tareita.getFechaLimite().plusDays(dias));
						//La marcamos como importante
						tareita.setImportante(true);
						
						//Actualizamos variable encontrada
						encontrada = true;
						break; //Salimos de bucle
					}
				}
				if(!encontrada){
					System.out.println("No se encontró la tarea");
				}
				break;
			case 'c':
			case 'C':
				//Ver todas la tareas
				System.out.println("*** Sus tareas son : ***");
				for(Tarea tareita:misTareas){
					
					System.out.println(tareita);
					System.out.println("////////////////////////");
				}
				System.out.println("********************");
				break;
			case 'd':
			case 'D':
				//Ver tareas importantes
				System.out.println("*** Sus tareas importantes son : ***");
				for(Tarea tareita : misTareas){
					if(tareita.isImportante()){
						System.out.println(tareita);
						
						
						
					}
				}
				System.out.println("********************");
				break;
			case 'e':
			case 'E':
				//Completar tarea
				Scanner lectorApartadoE = new Scanner(System.in);
				System.out.println("Introduzca titulo tarea que desea completar");
				String titulo2 = lectorApartadoE.nextLine();
				//Buscamos tarea
				boolean encontrada2 = false;
				
				for(Tarea tareita:misTareas){
					if(tareita.getTitulo().contains(titulo2)){
						System.out.println("Tarea que desea completar es: ");
						//Mostramos datos actuales de la tarea.
						System.out.println(tareita);
						
						tareita.setRealizada(true);
						
						//Actualizamos variable encontrada
						encontrada2 = true;
						break; //Salimos de bucle
					}
				}
				
				if(!encontrada2){
					System.out.println("No se encontró la tarea");
				}
				break;
			
			case 'f':
			case 'F':
				//Eliminar tareas realizadas.
				
				//Necesitamos un iterator para eliminar tareas de una lista (Ver Tema 9: Colecciones)
				
				Iterator<Tarea> it = misTareas.iterator();
				
				while(it.hasNext()){
					Tarea tareaLocal = it.next();
					if(tareaLocal.isRealizada()){
						//Lo añadimos a lista de tareas realizadas
						misTareasCompletadas.add(tareaLocal);
						//Lo eliinamos de la lista de tareas
						it.remove();
					}
				}
				break;
			case 'g':
			case 'G':
				//Ver tareas realizadas
				System.out.println("*** Sus tareas finalizadas son : ***");
				for(Tarea tareita : misTareasCompletadas){
					if(tareita.isRealizada()){
						System.out.println(tareita);
					}
				}
				System.out.println("********************");
				break;
				
			case 'h':
			case 'H':
				System.exit(0);
				break;
			default:
				opcion='h';
			}
		}
		
		while(opcion!='h'||opcion!='H');
	}

}
