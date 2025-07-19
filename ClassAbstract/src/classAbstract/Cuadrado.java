package classAbstract;

public class Cuadrado extends Figura{
	private int lado;

	public Cuadrado() {
	}
	
	public Cuadrado(double x, double y, int lado) {
		super(x, y);
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado*lado;
	}
	

}
