package interfaces;

public class Circulo implements Figura, Dibujable, Rotable{
	private double radio;
	
	public Circulo() {}
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI*radio*radio;
	}
	@Override
	public void rotar() {
		System.out.println("Rotando un círculo");
	}
	@Override
	public void dibujar() {
		System.out.println("Dibuando un círculo");
	}
	
	
	

}
