package probar;

import java.util.Scanner;

public class DistanciaEuclidiana {
	public static void main(String[] args) {
		int n1, n2, n3, n4;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese un par ordenado: ");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		System.out.println("Ingrese un par ordenado: ");
		n3=teclado.nextInt();
		n4=teclado.nextInt();
		double distancia=Math.sqrt((n1-n3)*(n1-n3)+(n2-n4)*(n2-n4));
		long distanciae=Math.round(distancia);
		System.out.println(distancia);
		System.out.println(distanciae);
		teclado.close();}}
