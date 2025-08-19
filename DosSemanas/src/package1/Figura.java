package package1;

public abstract class Figura { // Clase abstracta porque "Figura" es muy general
	private int radio,altura,base; // Inicializamos variables privadas
	public Figura(int r,int h, int b) {
		setRadio(r);
		setAltura(h);
		setBase(b);
	}
	public int getRadio() {
		return radio;
	}
	public int getAltura() {
		return altura;
	}
	public int getBase() {
		return base;
	}
	public void setRadio(int r) {
		radio=r;
	}
	public void setAltura(int h) {
		altura=h;
	}
	public void setBase(int b) {
		base=b;
	}
	public abstract double calcularArea(); // Método abstracto
}
