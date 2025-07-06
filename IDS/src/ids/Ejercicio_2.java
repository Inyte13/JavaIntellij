package ids;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int y=21; // Siempre será mayor nota 
		int count=0; // Contador de notas válidas
		int x=0; // Variable para almacenar cada nota ingresada
		int sum=0; // Suma acumulada de las notas
		while(true) {
			System.out.print("Ingrese las notas: ");
			x=teclado.nextInt();
			if(x>20||x<0) // Si la nota no es válida, salir del bucle
				break;
			y=Math.min(y, x); // Actualizar la menor nota
			count++; // Aumentar contador de notas válidas
			sum=sum+x;} // Acumular la nota
		if(count>0) {
			double prom=sum/(count*1.0); // Calcular promedio
			System.out.println("La menor nota es: "+y);
			System.out.println("El promedio es: "+prom);}
		else {
			System.out.println("Nota inválida");}
		teclado.close();}}

