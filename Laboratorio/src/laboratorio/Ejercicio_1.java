//Laboratorio Nro 6 - Ejercicio2
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 1:30
package laboratorio;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		//Declaramos las variables que utilizaremos
		double radio;
		Scanner teclado=new Scanner(System.in);
		//El usuario ingresa las variables
		System.out.println("Ingrese un número: ");
		radio=teclado.nextDouble();
		double area=Math.round((Math.PI*Math.pow(radio,2))*100)/100.0;
		double volumen=Math.round((4/3*(Math.PI*Math.pow(radio,3))*100))/100.0;
		//Se muestra la respuesta
		System.out.println("El área del círculo es: "+area);
		System.out.println("El volumen de la esfera es: "+volumen);
		teclado.close();}}
