
public class Ordenador extends Producto {
	
	private int ram;
	private String so;
	
	public Ordenador() {
		 super();//llamada al constructor por defecto de la clase producto
	}
	
	//Constructor que inicialice todos los atributos de un ordenador
	
	public Ordenador(String codigo,String marca,String modelo,double precio,int ram,String so) {
		//Llamada al constructor de la clase producto
		super(codigo,marca,modelo,precio);
		this.ram = ram;
		this.so = so;
		
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}
	
	@Override
	public String toString() {
		String infoOrdenador = "Ordenador " +  super.toString();
		//Añadir info específica de un ordenador
		
		infoOrdenador+= "[Ram: " + ram + " SO: " + so+ "]";
		return infoOrdenador;
	}
	
	public void subirPrecio() {
		if(ram>8) {
			super.setPrecio(super.getPrecio()*1.20);
		}
		else {
			super.setPrecio(super.getPrecio()*1.05);
		}
	} 
	
}
