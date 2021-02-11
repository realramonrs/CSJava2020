package pruebas;

import misClases.Ingrediente;

public class PrincipalObjetos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ingrediente i1 = new Ingrediente("Ajo",50,0.4f,20);
		Ingrediente i2 = new Ingrediente("Perejil",35,0.3f,10);
		Ingrediente i3 = new Ingrediente("Cebolla",100,0.2f,50);
		
		//Obtenemos las calorías de los 3 ingredientes
		int aporteCaloricoTotal = i1.getCalorias() + i2.getCalorias() + i3.getCalorias();
		
		//Obtenemos el precio total de cada ingrediente
		
		float precioI1 = i1.getCantidad()*i1.getPrecioKilo();
		float precioI2 = i2.getCantidad()*i2.getPrecioKilo();
		float precioI3 = i3.getCantidad()*i3.getPrecioKilo();
		
		//Mostramos info de los 3 ingrecientes junto con el precio final de cada uno
		
		System.out.println(i1);
		System.out.println("Precio total i1 :" + precioI1);
		System.out.println(i2);
		System.out.println("Precio total i2 :" + precioI2);
		System.out.println(i3);
		System.out.println("Precio total i3 :" + precioI3);
		
		System.out.println("Aporte calórico total : " + aporteCaloricoTotal + " calorias");
		
	}

}
