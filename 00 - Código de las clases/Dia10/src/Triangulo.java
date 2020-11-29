
public class Triangulo extends Figura {

	private double altura;
	private double base;
	private double lado;
	
	public Triangulo() {
		
	}

	public Triangulo(double altura, double base, double lado) {
		super();
		this.altura = altura;
		this.base = base;
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + base + ", lado=" + lado + "]";
	}
	
	public void calcularArea() {
		super.setArea(base*altura/2);
	}
}
