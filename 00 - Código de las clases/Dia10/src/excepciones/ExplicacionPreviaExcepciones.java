package excepciones;

public class ExplicacionPreviaExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Coche c1 = new Coche("adfdsh31234");
		
		System.out.println(c1);
		try {
			int matriz[] = new int[9];
			matriz[10] = 9;
			int resultado = 45/0;
			char caracter = c1.getMatricula().charAt(0);		
			
		}
		
		catch(NullPointerException e) {
			System.out.println("Error fatal, no hay mat´ricula");
		}
		catch(ArithmeticException a) {
			System.out.println("No se realizar el cálculo");
		}
		catch(Exception e) {
			System.out.println("Algo ha ido mal!!");
		}
		finally {
			System.out.println("Adios amigo");
		}
	}

}
