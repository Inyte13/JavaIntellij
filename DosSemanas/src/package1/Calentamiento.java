package package1;

import java.util.Scanner;

public class Calentamiento {
	public static int suma(int num1, int num2) {
		return num1+num2;
	}
	public static boolean esPar(int num1) {
		return num1%2==0;
	}
	public static void mostrarNumerosHasta(int n) {
		System.out.println("Números hasta "+n+":");
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		int num1=teclado.nextInt();
		System.out.print("Escribe el segundo número: ");
		int num2=teclado.nextInt();
		System.out.println("La suma es: "+suma(num1, num2));
		System.out.println("¿El primer número es par?: "+esPar(num1));
		mostrarNumerosHasta(num2);
		teclado.close();
	}
}
