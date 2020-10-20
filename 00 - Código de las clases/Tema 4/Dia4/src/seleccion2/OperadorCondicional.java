package seleccion2;

public class OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		String clasificacion;
		
		/*if(numero<0) {
			clasificacion = "Negativo";
		}
		
		else {
			clasificacion = "Positivo";
		}*/
		
		//Operador condicional: 
		// variable = condicion ? valor condicion true : valor condicion false;
		clasificacion = numero < 0 ? "Negativo" : "Positivo";
		
		System.out.println(clasificacion);
	}

}
