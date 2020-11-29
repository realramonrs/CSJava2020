
public class PruebaProducto {

	public static void guardarProducto(Producto []matriz,Producto p) {
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]==null) {
				matriz[i] = p;
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 5.6;
		float y = (float)x;  //No heredan de Object
		
		//UpCasting
		Producto p ;
		Producto p1 = new Televisor("WE344","Panasonic","Olympus",900,80,450);
		Ordenador o1 = new Ordenador("qwe123","HP","Omen",2000,16,"Windows10");
		Televisor t1 = new Televisor("qwre1432","Phillips","Quantium",900,45,100);
		
		//Aplicar descuento
		t1.aplicarDescuento();
		
		//Downcast (Televisor)p1;
		Televisor tAux = (Televisor)p1;
		tAux.aplicarDescuento();
		
		//Downcast erróneo
		//Producto pOrdenador = new Ordenador("qwer25df","Lenovo","Premium",900,16,"Windows10");
		//Televisor tAux2 = (Televisor)pOrdenador;
		
		
		
		
		
		
		
		
		//toString
		System.out.println(o1);
		
		System.out.println(t1);
		//Usando polimorfismo
		Producto p2 = new Ordenador("eqewr123","Lenovo","Yoga",1800,8,"Windows10");
		Producto t2 = new Televisor("zxcv18","Panasonic","MegaTrend",550,60,200);
		System.out.println("Polimorfismo:");
		System.out.println(p2.toString());
		System.out.println(t2.toString());
		
		Producto []ps = new Producto[10];
		ps[0] = new Ordenador("asdf12","MAC","Airbook",2700,16,"MACOs");
		ps[1] = p1;
		ps[2] = new Televisor("aswe213","Loewe","Magic",4000,90,1000);
		ps[3] = new Movil("asdf123","Samsung","A5",300,4,25);
		
		guardarProducto(ps,o1);
		guardarProducto(ps,t1);
		guardarProducto(ps,new Movil("oiu12","Huawei","Lite 50",450,8,90));
		
		System.out.println("****** CATÁLOGO DE PRODUCTOS: ********");
		
		for(Producto pr : ps) {
			System.out.println(pr);
		}
		
		//Aplicar descuento a todos los televisores de la matriz
		
		/*for(Producto pro : ps) {
			if(pro!=null) {
				if(pro instanceof Televisor) {
					Televisor t = (Televisor)pro;
					t.aplicarDescuento();
				}
			}
			
		}*/
		
		for(int i = 0;i<ps.length;i++) {
			if(ps[i]!=null) {
				if(ps[i] instanceof Televisor) {
					Televisor tele = (Televisor)ps[i];
					tele.aplicarDescuento();
				}
			}
		}
		
		System.out.println("**** DESCUENTOS ESPECTACULARES EN TODOS LOS TELEVISORES*****");
		
		for(Producto pr : ps) {
			System.out.println(pr);
		}
		
		//SUBIDA DE PRECIO GENERALIZADA , ESTAMOS EN CRISIS
		
		for(Producto pr : ps) {
			
			pr.subirPrecio();
			
			/*if(pr instanceof Televisor) {
				Televisor tel = (Televisor)pr;
				tel.subirPrecio();
			}
			else if (pr instanceof Ordenador) {
				Ordenador or = (Ordenador)pr;
				or.subirPrecio();
			}
			else {
				Movil mov = (Movil)pr;
				mov.subirPrecio();
			}*/
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
