package ejercicioMonograma;

import java.util.Scanner;

public class EjercicioMonograma {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese su primer nombre");
		String nombre=teclado.next();
		String primera=nombre.substring(0,1);
		String ultima=nombre.substring(nombre.length()-1);
		int lugara=nombre.indexOf("a");
		String monograma=primera+ultima+lugara;
		System.out.println(monograma);
		teclado.close();}}
