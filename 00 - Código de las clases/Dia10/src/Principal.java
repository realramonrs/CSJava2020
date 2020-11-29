import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y = 9;
		final int c = 9;
		
		
		Figura misFiguras[] = new Figura[3];
		misFiguras[0] = new Triangulo(3,4,1);
		misFiguras[1] = new Circulo(6);
		misFiguras[2] = new Cuadrado(3);
		
		//Calcular area 
		
		for(Figura fg : misFiguras) {
			fg.calcularArea();
		}
		
		Arrays.sort(misFiguras);
		
		for(Figura f : misFiguras) {
			System.out.println(f.getArea());
		}
			
		//Calcular el area de todas las figuras
		
		for(Figura f : misFiguras) {
			if(f!=null) {
				f.calcularArea();
			}
		}
		
		Areable a = new Circulo(3);
		Areable a2 = new Triangulo(4,3,2);
		Areable a3 = new Cuadrado(5);
		Areable a4 = new Estadio(340,450);
		Figura a5 = new Cuadrado(2);
		
		Areable as[] = new Areable[10];
		
		as[0] = a;
		as[1] = a2;
		as[2] = a3;
		as[3] = a4;
		as[4] = a5;
		
		
		//Calcular el area de todos los objetos areables
		
		for(Areable ar : as) {
			if(ar!=null)
			ar.calcularArea();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
