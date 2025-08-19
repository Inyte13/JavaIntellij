package package1;

public class Rectangulo extends Figura{
	public Rectangulo(int r,int h, int b) {
		super(r,h,b);
	}
	@Override
	public double calcularArea() {
		return getAltura()*getBase();
	}
}
