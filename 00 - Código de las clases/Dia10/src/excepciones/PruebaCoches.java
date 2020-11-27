package excepciones;

public class PruebaCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche c1;
		try {
			c1 = new Coche("1234qwe");
			System.out.println(c1.getMatricula().charAt(0));
			c1.setMatricula("wdfsd23");			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido crear el coche porque la matrícula es errónea");
		}
		
		
		
		System.out.println("Hola a todos amigos !!!!");	
		
		try {
			Coche c2 = new Coche("adfd1234");
		} catch (MatriculaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
