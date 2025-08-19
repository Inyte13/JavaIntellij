package package1;

public class Circulo extends Figura {
	public Circulo(int r,int h,int b) {
		super(r,h,b);
	}
	@Override
	public double calcularArea(){
		return Math.PI*getRadio()*getRadio();
	}
} 
