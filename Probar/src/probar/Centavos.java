package probar;

import java.util.Scanner;

public class Centavos {
	public static void main(String[] args) {
		int centavos;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba la cantidad en centavos: ");
		centavos=teclado.nextInt();
		int dos=centavos/200;
		int uno=(centavos%200)/100;
		int cincu=((centavos%200)%100)/50;
		int veinte=(((centavos%200)%100)%50)/20;
		System.out.println(dos);
		System.out.println(uno);
		System.out.println(cincu);
		System.out.println(veinte);
		teclado.close();}}
