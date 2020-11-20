
public class Movil extends Producto {

	private int resolucionCamara;
	private int numeroCamaras;
	
	public Movil() {
		super();
	}
	public Movil(String codigo, String marca, String modelo, double precio, int resolucionCamara, int numeroCamaras) {
		super(codigo, marca, modelo, precio);
		this.resolucionCamara = resolucionCamara;
		
		this.numeroCamaras = numeroCamaras;
	}
	public int getResolucionCamara() {
		return resolucionCamara;
	}
	public void setResolucionCamara(int resolucionCamara) {
		this.resolucionCamara = resolucionCamara;
	}
	public int getNumeroCamaras() {
		return numeroCamaras;
	}
	public void setNumeroCamaras(int numeroCamaras) {
		this.numeroCamaras = numeroCamaras;
	}
	
	@Override
	
	public String toString() {
		return "Movil: " + super.toString() + " [Camaras : " + numeroCamaras + " Resolución: " + this.resolucionCamara + "Mpx]";
	}
	
	public void subirPrecio() {
		if(resolucionCamara>16) {
			super.setPrecio(super.getPrecio()*1.20);
		}
		else {
			super.setPrecio(super.getPrecio()*1.05);
		}
	}
	
	
	
	
	
}
