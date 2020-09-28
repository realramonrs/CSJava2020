
public class IntroVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int numero1; //Sin inicializar
		int numero2 = 9;
		byte numero3 = -128;
		short numero4 = 900;
		long numero5 = 9_000_000_000_000L;
		
		float numero6 = 4.56f;
		double numero7 = 4.90;
		
		//Modificar valores de una variable
		numero2 = 10;
		//Aumentar en una unidad el valor de la variable numero2
		numero2 = numero2 + 1;
		numero2 = numero2 + 2;
		
		//numero1 = numero1 + 1;
		
		//Promoción de variables:
		//numero3 = numero3 + 1;
		//Conversión explícita de tipos
		numero3 = (byte)(numero3 - 5);
		System.out.println(numero3);
		
		//Declaración de varias variables en una misma linea
		int x1,x2,x3;
		float Temp1 = 9.4f,temp2 = 7.4f,temp3 = 2.9f;
		
		//Reglas para los nombres de las variables.
		//1. No pueden contener espacios int x 1;
		//2. No pueden empezar por números int 1x;
		//3. No pueden contener caracteres especiales , salvo _ . $
		//4. No pueden ser palabras reservadas.
		//5. Empiezan siempre por minúsculas(convención)
		//6. Si el nombre es compuesto , la inicial de la segunda se escribe en mayúscula
		float temperaturaMaxima= 90;
		
		//Mostrar info de variables por consola
		System.out.println("La temperatura máxima es de : " + temperaturaMaxima + " grados.");
		
		System.out.println("Como dijo Valdano: \"El fútbol así\"");
		
		System.out.println("Voy a \t escribir \n en otra línea");
		
		System.out.println("El archivo está en C:\\mis documentos");
		
				
				
		
		

	}

}
