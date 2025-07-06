//Laboratorio Nro 10 - Ejercicio7
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 1:30
package laboratorio;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//El usuario ingresa los datos
		System.out.print("Ingrese x1: ");
		double x1=teclado.nextDouble();
		System.out.print("Ingrese y1: ");
		double y1=teclado.nextDouble();
		System.out.print("Ingrese x2: ");
		double x2=teclado.nextDouble();
		System.out.print("Ingrese y2: ");
		double y2=teclado.nextDouble();
		System.out.print("Ingrese x3: ");
		double x3=teclado.nextDouble();
		System.out.print("Ingrese y3: ");
		double y3=teclado.nextDouble();
		double l1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		double l2=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
		double l3=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
		//Verificamos
		if(l1+l2>l3&&l1+l3>l2&&l2+l3>l1) {
			System.out.print("Es un triangulo ");
			if(l1==l2&&l2==l3) {
				System.out.print("equilátero");}
			else {
				if(l1==l2||l1==l3||l2==l3) {
					System.out.print("isósceles");}
				else {System.out.println("escaleno");}}}
		else {
			System.out.println("No es un triángulo");}
		teclado.close();}}
