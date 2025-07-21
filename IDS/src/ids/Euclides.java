package ids;

import java.util.Scanner;

public class Euclides {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese el primer número: ");
		int mm=teclado.nextInt(); // Guarda el primer término 
		System.out.print("Ingrese el segundo número: ");
		int nm=teclado.nextInt(); // Guarda el segundo término
		int m=Math.max(mm, nm); // El mayor
		int n=Math.min(mm, nm); // El menor
		while(n!=0) { // Mientras el menor no sea 0
			int mcd=m%n; // Guarda el módulo
			m=n; // Ahora m toma el valor de n
			n=mcd;} // n toma el valor del resto
		System.out.println(m); // Muestra el MCD
		teclado.close();}}
