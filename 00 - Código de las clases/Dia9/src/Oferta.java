
public class Oferta {

	private String descripcion;
	private float descuento;
	
	
	
	public Oferta(String descripcion, float descuento) {
		super();
		this.descripcion = descripcion;
		this.descuento = descuento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	
	
}
