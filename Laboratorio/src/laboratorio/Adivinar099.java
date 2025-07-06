//Laboratorio Nro 19 - Ejercicio1
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 1:30
package laboratorio;

import java.util.Scanner;

public class Adivinar099 {
	// Método adivinando
	public static int adivinando() {
		Scanner teclado=new Scanner(System.in);
		int random=(int)(Math.random()*100); // Asigno a random un aleatorio entre [0, 99]
		System.out.println("Se genera un aleatorio entre 0 y 99, y el jugador tiene 6 oportunidades para "
				+ "encontrarlo..."); // Instrucciones
		int i=0; // Inicializo el contador
		for(;i<6;i++) { // Se repite 6 veces
			// Se pide el numero y se informa el intento
			System.out.print("Adivine el número (intento "+(i+1)+"): ");
			int numero=teclado.nextInt();
			if(0<=numero&&numero<=99) { // Si esta en el rango continuará
				if(numero==random) { // Si adivina
					System.out.println("Ganaste en el intento "+(i+1)); // Se informará en que intento ganó
					return 1;} // Si gano, retornará 1
				 // Si no consigo adivinar y mi número es mayor se informará
				else if(numero>random) System.out.println("El número generado es menor");
				// Si no consigo adivinar y mi número es menor se informará
				else System.out.println("El número generado es mayor");
				System.out.println("***************************");}
			else { // Si no está en el rango se pedirá de nuevo y no se contará ese intento
				System.out.println("Debe estar dentro de [0, 99]");
				i--;}}
		System.out.print("El número era "+random); // Si no logra ganar, se informara el número generado
		return 0;} // Si pierdo, retornará 0
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String confirmacion="y"; // Inicializo la variable confirmacion
		int ganoYo=0, ganaPc=0; // Inicializo los contadores de ganoYo y ganaPc
		while(confirmacion.equalsIgnoreCase("y")) { // Siempre que sea y continuará
			if(adivinando()==1) ganoYo++; // Si el juego lo ganó yo 
			else ganaPc++; // Si el juego lo ganá pc
			// Se pide si quiere continuar
			System.out.print("Desea volver a jugar? (y/n): ");
			confirmacion=teclado.next();}
		// Cuando no desee continuar se mostrará las estadísticas finales
		System.out.println("Yo ganadas "+ganoYo); 
		System.out.println("Pc ganadas "+ganaPc);
		if(ganoYo==ganaPc) System.out.println("Empataron");
		else if(ganoYo>ganaPc) System.out.println("Ganaste tú");
		else System.out.println("Gano la PC");}}
