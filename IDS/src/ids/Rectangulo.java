package ids;

import java.util.Scanner;

public class Rectangulo {
	int base, altura; // Declaramos variables
	public Rectangulo() { // Constructor default
		this.base=1;
		this.altura=1;}
	public Rectangulo(int base) { // Constructor cuadrado
		this.base=base;
		this.altura=base;}
	public Rectangulo(int base, int altura) { // Constructor rectángulo
		this.base=base;
		this.altura=altura;}
	public int getBase() {return base;} // Getters and Setters
	public void setBase(int base) {this.base=base;}
	public int getAltura() {return altura;}
	public void setAltura(int altura) {this.altura=altura;}
	public int area() { // Método area
		return base*altura;}
	public int perimetro() { // Método perimetro
		return 2*(base+altura);}
	public boolean esCuadrado() { // Método esCuadrado
		return base==altura;}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese la base: ");
		int a=teclado.nextInt();
		System.out.print("Ingrese la altura: ");
		int b=teclado.nextInt();
		Rectangulo r=new Rectangulo(a,b); // Creamos el objeto
		System.out.println("Su área es: "+r.area());
		System.out.println("Su perímetro es: "+r.perimetro());
		System.out.println("Es cuadrado?"+r.esCuadrado());}
}
