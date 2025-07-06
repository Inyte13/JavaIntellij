package todocode;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
			Scanner teclado=new Scanner(System.in); // Declaramos la variable teclado
			String patente=""; // Inicializamos la variable
			int count1=0,count2=0,count3=0,countTotal=0;
			while(!patente.equalsIgnoreCase("fin")){ // Si la patente no es fin, continua
				System.out.print("Ingrese la patente: "); // Preguntamos la patente
				patente=teclado.next(); // Almacenamos la patente
				if(!patente.equalsIgnoreCase("fin")) {
					teclado=new Scanner(System.in); // Limpiamos el scanner por cambiar de String a Int
					System.out.println("Elija el tipo de estacionamiento:\n(1) Por hora\n(2) " 
							+ "Media jornada\n(3) Jornada completa"); //(1) (2) (3)
					int tipoServicio=teclado.nextInt(); // Almacenamos el tipo de estacionamiento
					if(tipoServicio>3||tipoServicio<1) 
						System.out.println("Ingrese un dato válido");
					else if(tipoServicio==1) {
						System.out.print("Ingrese la cantidad de horas: ");
						int cantHoras=teclado.nextInt();
						int precioPorHoras=cantHoras*3;
						System.out.println("El total es de: "+precioPorHoras);
						count1++;
						countTotal+=precioPorHoras;}
					else if(tipoServicio==2) {
						double precioMediaJornada=15*0.95;
						System.out.println("El precio por Media Jornada es de: "+precioMediaJornada);
						count2++;
						countTotal+=precioMediaJornada;}
					else {
						double precioJornadaCompleta=30*0.90;
						System.out.println("El precio por Jornada Completa es de: "+precioJornadaCompleta);
						count3++;
						countTotal+=precioJornadaCompleta;}}}
			System.out.println(count1);
			System.out.println(count2);
			System.out.println(count3);
			System.out.println(countTotal);
			
	}

}
