
public abstract class Figura implements Areable,Comparable<Figura> {

	private double area;
	private double perimetro;
	
	public Figura() {
		
	}	
		
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		return "Figura [area=" + area + ", perimetro=" + perimetro + "]";
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		Double area1 = new Double(area);
		return area1.compareTo(o.getArea());
	}

	
	
	
	
		
}
