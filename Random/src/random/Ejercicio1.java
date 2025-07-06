package random;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int estu;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Cuántos estudiantes están matriculados: ");
		estu=teclado.nextInt();
		int random=(int)(Math.random()*estu)+1;
		System.out.println("La elección aleatoria es: "+random);
		teclado.close();}}