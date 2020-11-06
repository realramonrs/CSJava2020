
public class CuentaBancaria {
	
	//Atributos de CuentaBancaria
   private String dniTitular;
   private double saldo;
   private String iban;
   private int contadorIngresos;
   String historico[];
   
   //Constructores: Inicializar los atributos de la clase.
   //Métodos que son llamados al crear un objeto de la clase
   //Se llaman con el operador new
   
   //Constructor por defecto : No recibe argumentos
   public CuentaBancaria() {
	   saldo = 0;
	   iban = null;
	   dniTitular = null;
	   contadorIngresos = 0;
	   
	   //Dar tamaño a la matriz de históricos
	   historico = new String[30];
   }
   
   public CuentaBancaria(String dniTitular,double saldo,String iban) {
	   
	   //Llamar al método setDNI para procesar el dni que se está guardando
	   setDNI(dniTitular);
	   this.saldo = saldo;
	   this.iban = iban;
	   
	   historico = new String[30];
	   
   }
   public CuentaBancaria(String dniTitular,String iban,int capacidadHistorico) {
	 //Llamar al método setDNI para procesar el dni que se está guardando
	   setDNI(dniTitular);
	   this.iban = iban;
	   historico = new String[capacidadHistorico];
	   saldo = 10000;
   }
   
   
   //Métodos de acceso
   
   public void setIban(String nuevoIban) {
	   //Debería de procesar el string que recibe , no lo voy a hacer
	   iban = nuevoIban;
   }
   
   public String getIban() {
	   return iban;
   }
   
   
   public int getContadorIngresos() {
	   return contadorIngresos;
   	}

   public void setContadorIngresos(int contadorIngresos2) {
	   contadorIngresos = contadorIngresos2;
   	}

public void setDNI(String dniNuevo) {
	   //Comprobar dniNuevo es correcto si tiene 9 caracteres
	   //De los cuales los 8 primeros son números y el noveno es una letra
	   boolean dniCorrecto = true;
	   if(dniNuevo.length()==9) {
		   for(int i = 0;i<8;i++) {
			   if(Character.isLetter(dniNuevo.charAt(i))) {
				   dniCorrecto = false;
				   break;
			   }
		   }
		   
		   if(!Character.isLetter(dniNuevo.charAt(8))) {
			   dniCorrecto = false;
		   }
		   
	   }
	   else {
		   dniCorrecto = false;
	   }	   
	   
	   if(dniCorrecto) {
		   dniTitular = dniNuevo;
	   }
   }
   
   public String getdniTitular() {
	   return dniTitular;
   }
   
   //Acceso a saldo de la cuenta
   public double getSaldo() {
	   return saldo;
   }   

   //Métodos de CuentaBancaria
   
   public void ingresar(double cantidadAIngresar) {
	   
	   contadorIngresos++;
	   String movimiento = "Saldo inicial " + saldo + " ingreso " + cantidadAIngresar;
	   saldo+=cantidadAIngresar;
	   movimiento+= " saldo final : " + saldo;
	   
	   //Guardar el movimiento en la matriz de histórico
	   actualizarHistorico(movimiento);
	   
   }   
   //Método que permita sacar dinero , siempre y cuando no se endeude
   //en más de 1000 €
   
   public boolean quitarDinero(double cantidadAQuitar) {
	   double saldoFinal = saldo - cantidadAQuitar;
	   boolean opRealizada = false;
	   if(saldoFinal > -1000) {
		   
		   opRealizada = true;
		   String movimiento = "Saldo inicial " + saldo + " cantidad retirada " + cantidadAQuitar;
		   movimiento+="Saldo final: " + saldo;
		   
		   
		 //Guardar el movimiento en la matriz de histórico
		   actualizarHistorico(movimiento);
		     
		   saldo = saldoFinal;
	   }   
	   
	   return opRealizada;
   }
   
   //Método que printa el histórico de movimientos
   
   public void verHistorico() {
	   for(int i = 0;i<this.historico.length;i++) {
			if(historico[i]!=null) {
				System.out.println(this.historico[i]);
			}
			else {
				break;
			}
		}
   }
   
   public int contarMovimientos() {
	   int contador = 0;
	   
	   for(int i = 0;i<historico.length;i++) {
		   if(historico[i]!=null) {
			   contador++;
		   }
		   else {
			   break;
		   }
	   }
	   return contador;
   }
   
   
   
   private void actualizarHistorico(String movimiento) {
	   for(int i = 0;i<historico.length;i++) {
		   if(historico[i]==null) {
			   historico[i] = movimiento;
			   break;
		   }
	   }		 
   }  
   
   
}
