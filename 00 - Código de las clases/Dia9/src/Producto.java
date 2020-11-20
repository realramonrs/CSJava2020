
public abstract class Producto {

	private String codigo;
	private String marca;
	private String modelo;
	private double precio;
	
	
	public Producto() {
		
	}

	public Producto(String codigo,String marca, String modelo, double precio) {
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	
	@Override
	public String toString() {
		//String m = "cualquier cosa";
		return "[codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	public abstract void subirPrecio();
		
	
	
	
}
