
public class Estadio extends Construccion implements Areable {

	private double areaCampo;
	private double areaGradas;
	private double areaTotal;
	
	
	public Estadio(double areaCampo, double areaGradas) {
		super();
		this.areaCampo = areaCampo;
		this.areaGradas = areaGradas;
	}


	public void calcularArea() {
		areaTotal = areaCampo + areaGradas;
	}


	public double getAreaCampo() {
		return areaCampo;
	}


	public void setAreaCampo(double areaCampo) {
		this.areaCampo = areaCampo;
	}


	public double getAreaGradas() {
		return areaGradas;
	}


	public void setAreaGradas(double areaGradas) {
		this.areaGradas = areaGradas;
	}


	public double getAreaTotal() {
		return areaTotal;
	}
	
}
