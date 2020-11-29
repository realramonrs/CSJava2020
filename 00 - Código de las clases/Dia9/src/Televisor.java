
public class Televisor extends Producto {

	
	private int pulgadas;
	private float frecuencia;
	
	public Televisor() {
		super();
		
	}

	public Televisor(String codigo, String marca, String modelo, double precio, int pulgadas, float frecuencia) {
		super(codigo, marca, modelo, precio);
		this.pulgadas = pulgadas;
		this.frecuencia = frecuencia;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public float getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(float frecuencia) {
		this.frecuencia = frecuencia;
	}

	

	@Override
	public String toString() {
		return "Televisor " +super.toString() + "[pulgadas=" + pulgadas + ", frecuencia=" + frecuencia + ", ]";
	}

	
	
	//Aplicar descuento
	public void aplicarDescuento() {
		//Aplica 20% de descuento a televisores de tamaño > 60
		
		if(this.pulgadas>60) {
			super.setPrecio(super.getPrecio()*0.8);
		}
		else {
			super.setPrecio(super.getPrecio()*0.9);
		}
		
		
	}
	
	public void subirPrecio() {
		if(pulgadas>60) {
			super.setPrecio(super.getPrecio()*1.20);
		}
		else {
			super.setPrecio(super.getPrecio()*1.05);
		}
	}
	
	
}
