package pruebas;

import java.util.Arrays;
import java.util.Scanner;

import misClases.Ingrediente;

public class PrincipalObjetos1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ingrediente ing[] = new Ingrediente[3];
		
		ing[0]= new Ingrediente("Azucar",250,0.6f,1000);
		ing[1] = new Ingrediente("Harina",350,0.1f,600);
		ing[2] = new Ingrediente("Chocolate",300,0.99f,2000);
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escoja el ingrediente que desee modificar la cantidad: ");
		
		//Mostramos menú con ingredientes
		System.out.println("0." + ing[0].getNombre());
		System.out.println("1." + ing[1].getNombre());
		System.out.println("2." + ing[2].getNombre());
		
		int opcion = lector.nextInt();
		
		System.out.println("Introduzca la cantidad deseada: ");
		int cantidad = lector.nextInt();
		
		//Asignamos la cantidad al ingrediente escogido
		
		ing[opcion].setCantidad(cantidad);
		
		//Calculamos precio final
		float precioFinal = 0;
		for(Ingrediente i : ing){
			precioFinal+=i.getPrecioKilo()*i.getCantidad();
		}
		
		//Calculamos aporte calorico total
		
		float aporteCalorico = 0;
		
		for(Ingrediente i : ing){
			aporteCalorico+=i.getCalorias();
		}
		
		//Mostramos info por pantalla
		
		
		System.out.println(Arrays.toString(ing));
		System.out.println("Precio final: " + precioFinal);
		System.out.println("Calorías total " + aporteCalorico);
		
	}

}
