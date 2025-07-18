package modoConsola;

import java.util.Scanner;

public class Monograma {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Cuál es tu nombre: ");
		String name=teclado.next(); // Guardamos en name
		String pri=name.substring(0,1); // .substring [0,1)
		char ult=name.charAt(name.length()-1); // .charAt(length-1)
		int lugarA=name.indexOf("a"); // Lugar de la primera "a" que encuentre
		System.out.println(pri+ult+lugarA);
		teclado.close();}}
