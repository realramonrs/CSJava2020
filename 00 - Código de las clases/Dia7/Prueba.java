
public class Prueba { 
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo;
		CuentaBancaria cb1 = new CuentaBancaria();
		CuentaBancaria cb2; //No hay objeto creado
		//Modificar valores iniciales de cb1
		CuentaBancaria cb3 = new CuentaBancaria();
		
		CuentaBancaria cb4 = new CuentaBancaria("12345678P",3400,"ES8934567834456737");
		CuentaBancaria cb5 = new CuentaBancaria("90909090W", 4000,"ES67458765345903939");
		CuentaBancaria cb6 = new CuentaBancaria("19019190Q","ES67383838383838",100);
		cb1.setDNI("12345678P");
		//cb1.saldo = -9000000;
		cb1.setIban("ES67985653737383830");
		
		cb3.setDNI("99999999W");
		//cb3.saldo = 2000;
		cb3.setIban("ES451234567890134");
		
		//Ingrear dinero en cb1
		double cantidadAIngresar = 300;
		//cb1.saldo = cb1.saldo + cantidadAIngresar;
		cb1.ingresar(cantidadAIngresar);
		
		//Ingresar dinero en cb3
		//cb3.saldo = cb1.saldo + cantidadAIngresar;
		cb3.ingresar(cantidadAIngresar);
		
				
		//Quitar dinero de cb1
		if(cb1.quitarDinero(9000)) {
			System.out.println("Operación realizada con éxito");
		}
		else {
			System.out.println("Operación no permitida,no dispone de saldo");
		}
		
		System.out.println("DNI: " + cb1.getdniTitular());
		System.out.println("Saldo: " + cb1.getSaldo() + " euros.");
		System.out.println("iban: " + cb1.getIban());
		
		//Modificar los valores de cb2
		System.out.println("Cuenta cb5: ");
		System.out.println("DNI: " + cb5.getdniTitular());
		System.out.println("Saldo: " + cb5.getSaldo() + " euros.");
		System.out.println("iban: " + cb5.getIban());
		System.out.println("Contador ingresos: " + cb5.getContadorIngresos());
		
		//Probar funcionamiento del histórico
		cb5.ingresar(2000);
		cb5.ingresar(4500);
		cb5.quitarDinero(1200);
		
		//Ver el histórico por pantalla.
		System.out.println(("******* Movimientos cuenta cb5:********* "));
		cb5.verHistorico();	
		
		
		System.out.println("Cantidad movimientos: " + cb5.contarMovimientos());
	
		
		
		
		
		
		
	}

}
