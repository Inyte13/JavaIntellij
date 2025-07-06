package ids;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int mujer=0; // Contador de mujeres
		int hombre=0; // Contador de hombres
		int total=0; // Contador total de personas
		while(true) {
			System.out.print("Ingrese si es hombre (0) o mujer (1): ");
			int x=teclado.nextInt();
			if(x==1)
				mujer++; // Si es 1, aumentar contador de mujeres
			else if(x==0)
				hombre++; // Si es 0, aumentar contador de hombres
			else if(x==-1)
				break; // Si es -1, finalizar el ciclo
			else {
				System.out.println("Ingrese datos válidos");
				continue;} // Volver al inicio del bucle sin aumentar total
			total++;} // Aumentar total si el valor es válido (0 o 1)
		double porcm=mujer/(total*1.0)*100;
		double porch=hombre/(total*1.0)*100;
		System.out.println(total);
		System.out.println("Son "+hombre+" hombres");
		System.out.println("Son "+mujer+" mujeres");
		System.out.println("Las mujeres son el "+porcm+"%");
		System.out.println("Los hombres son el "+porch+"%");
		teclado.close();}}
