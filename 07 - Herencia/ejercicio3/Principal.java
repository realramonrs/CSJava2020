/**
 * 
 */
package ejercicio3;

import java.util.Scanner;

/**
 * @author Ramon RS
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	static void guardarTrabajador(Trabajador tr[] , Trabajador tra) {
		for(int i = 0;i<tr.length;i++) {
			if(tr[i]==null) {
				tr[i] = tra;
				break;
			}
		}
	}
	
	static void mostrarTrabajadores(Trabajador tr[]) {
		for(Trabajador trabajador : tr) {
			if(trabajador==null) {
				break;
			}
			System.out.println(trabajador);
		}
	}
	
	static Trabajador getTrabajadorByDNI(Trabajador t[],String dni) {
		Trabajador trab = null;
		for(int i = 0;i<t.length;i++) {
			if(t[i]==null) {
				break;
			}
			if(t[i].getDni().equals(dni)) {
				trab = t[i];
				break;
			}
		}
		
		return trab;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trabajador trabajadores[] = new Trabajador[100];
		char opcion;
		Scanner lector;
		
		do {
			System.out.println("Escoge una opción: ");
			lector = new Scanner(System.in);
			System.out.println("a.) Añadir trabajador");
			System.out.println("b.)Mostrar trabajador");
			System.out.println("c. Calcular neto"); 
			opcion = lector.nextLine().charAt(0);
			
			switch(opcion) {
			case 'a':
				Trabajador t;
				System.out.println("Qué tipo de trabajador desea añadir");
				System.out.println("a. Medico / b. Profesor");
				lector = new Scanner(System.in);
				String tipoTrabajador = lector.nextLine();
				switch(tipoTrabajador) {
				case "a":
					//Creamos un médico por defecto
					t = new Medico();
					//Solicitamos los datos del médico
					System.out.println("Introduzca el nombre: ");
					lector = new Scanner(System.in);
					String nombre = lector.nextLine();
					t.setNombre(nombre);
					
					System.out.println("Introduzca el DNI: ");
					
					String dni = lector.nextLine();
					t.setDni(dni);
					
					System.out.println("Introduzca el sueldo bruto: ");
					
					float sueldo = lector.nextFloat();
					t.setSueldoBruto(sueldo);
					
					System.out.println("Introduzca la especialidad: ");
					lector = new Scanner(System.in);
					String especialidad = lector.nextLine();
					
					((Medico)t).setEspecialidad(especialidad);
					
					//Almacenamos el trabajador creado en la matriz de trabajadores
					guardarTrabajador(trabajadores,t);
					
					mostrarTrabajadores(trabajadores);
					
					break;
				case "b":
					//Creamos un profesor por defecto
					t = new Profesor();
					
					//Solicitamos los datos del médico
					System.out.println("Introduzca el nombre: ");
					lector = new Scanner(System.in);
					String nombreProfe = lector.nextLine();
					t.setNombre(nombreProfe);
					
					System.out.println("Introduzca el DNI: ");
					
					String dniProfe = lector.nextLine();
					t.setDni(dniProfe);
					
					System.out.println("Introduzca el sueldo bruto: ");
					
					float sueldoProfe = lector.nextFloat();
					t.setSueldoBruto(sueldoProfe);
					
					System.out.println("Introduzca el curso: ");
					lector = new Scanner(System.in);
					String curso = lector.nextLine();
					((Profesor)t).setCurso(curso);
					
					
					System.out.println("Introduzca el complemento: ");
					
					float complemento = lector.nextFloat();
					((Profesor)t).setComplemento(complemento);
					
					//Agregamos al profesor a la matriz
					
					guardarTrabajador(trabajadores , t);
					
					mostrarTrabajadores(trabajadores);
					
					break;
					default:
						System.out.println("Error");
						break;
				}
				
				
				break;
			case 'b':
				System.out.println("Indique el dni del trabajador");
				String dni = null;
				lector = new Scanner(System.in);
				dni = lector.nextLine();
				
				//Obtener el trabajador a partir del dni
				Trabajador trab = getTrabajadorByDNI(trabajadores, dni);
				if(trab==null) {
					System.out.println("No se ha encontrado el trabajdor");
					}
				else {
					System.out.println(trab);
				}
				break;
			case 'c':
				//Actualizar salario neto de todos los trabajadores
				
				for(Trabajador trabaj : trabajadores) {
					if(trabaj!=null) {
					System.out.println(trabaj.calcularSueldoNeto());
					}
					else {
						break;
					}
				}
				
				
				
				break;
			default:
				
				break;
			}
			
		}
		
		while(opcion=='a'||opcion=='b'||opcion=='c');
	}

}
