//Laboratorio Nro 9 - Ejercicio4
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 1:30
package laboratorio;

import java.util.Scanner;

public class Ejecicio0C {
	public static void main(String[] args) {
		//El usuario ingresa los datos
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese un rango a: ");
		double aI=teclado.nextDouble();
		System.out.print("Ingrese un rango b: ");
		double bI=teclado.nextDouble();
		//Operamos
		double x1=Math.round((Math.random()*(bI-aI)+aI)*10)/10.0;
		double y1=Math.round((Math.random()*(bI-aI)+aI)*10)/10.0;
		double x2=Math.round((Math.random()*(bI-aI)+aI)*10)/10.0;
		double y2=Math.round((Math.random()*(bI-aI)+aI)*10)/10.0;
		String coordenadas="("+x1+","+y1+") y"+"("+x2+","+y2+")";
		String triangulo1="("+x1+","+y1+"), "+"("+x2+","+y2+"), "+"("+x2+","+y1+")";
		String triangulo2="("+x1+","+y1+"), "+"("+x2+","+y2+"), "+"("+x1+","+y2+")";
		double base=Math.abs(Math.round((y2-y1)*10)/10.0);
		double altura=Math.abs(Math.round((x2-x1)*10)/10.0);
		double diagonal=Math.round((Math.sqrt(base*base+altura*altura))*10)/10.0;
		double area=Math.abs(Math.round((base*altura/2)*10)/10.0);
		//Mostramos la respuesta
		System.out.println("Los puntos generados: "+coordenadas+
							"\n1er triángulo rectángulo: "+triangulo1+
							"\n2do triángulo rectángulo: "+triangulo2+
							"\nLa base es: "+base+
							"\nLa altura es: "+altura+
							"\nLa hipotenusa es: "+diagonal+
							"\nEl área es: "+area);
		teclado.close();}}
