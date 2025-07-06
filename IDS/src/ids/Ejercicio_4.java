package ids;

import java.util.Scanner;

public class Ejercicio_4 {
	public static int factorial(int num) {
		int prodnum=1;
		for(int i=1;i<=num;i++) {
			prodnum*=i;}
		return prodnum;}
	public static void main(String[] args) {
		//Se pide 2 números enteros
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese el primer número: ");
		int num1=teclado.nextInt();
		System.out.print("Ingrese el segundo número: ");
		int num2=teclado.nextInt();
		//Si al menos uno es negativo, se mostrara error
		if(num1<0||num2<0) {
			System.out.println("Error");
			return;}
		//Calculamos los factoriales y se muestras su producto
		System.out.println("El producto de sus factoriales es: "+factorial(num1)*factorial(num2));
		teclado.close();
	}
}