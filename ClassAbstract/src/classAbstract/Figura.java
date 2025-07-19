package classAbstract;

public abstract class Figura { // Convertimos abstract
	protected double x;
	protected double y;
	
	protected Figura() {
	}
	protected Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public abstract double area();

}
