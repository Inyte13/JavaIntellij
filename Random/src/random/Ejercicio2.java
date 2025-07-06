
package random;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int pribole, bole;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese el primer boleto: ");
		pribole=teclado.nextInt();
		System.out.println("Ingrese la cantidad de boletos: ");
		bole=teclado.nextInt();
		int random=(int)(Math.random()*bole)+pribole;
		System.out.println("¡Y el premio es para! "+random);
		teclado.close();}}
