
public class Portatil extends Ordenador {

	private int bateria;

	public Portatil(String codigo, String marca, String modelo, double precio, int ram, String so, int bateria) {
		super(codigo, marca, modelo, precio, ram, so);
		this.bateria = bateria;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "Portatil [bateria=" + bateria + ", toString()=" + super.toString() + "]";
	}
	
	
}
