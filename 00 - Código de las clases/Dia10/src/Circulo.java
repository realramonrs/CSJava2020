
public class Circulo extends Figura{
	
	private double radio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	public void calcularArea() {
		super.setArea(Math.PI*radio*radio);
	}

	

}
