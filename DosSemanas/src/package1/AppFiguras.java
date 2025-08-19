package package1;

public class AppFiguras {
	public static void main(String[] args) {
		Figura[] figuras=new Figura[2];
		figuras[0]=new Circulo(2,0,0);
		figuras[1]=new Rectangulo(0,3,4);
		for(Figura i: figuras) {
			System.out.println(i.calcularArea());;
		}
	}
}
