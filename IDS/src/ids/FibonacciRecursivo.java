package ids;

import java.util.Scanner;

public class FibonacciRecursivo {
	// Creamos el método fibonacci
	public static int fibonacci(int posicion) {
		if (posicion==0) // Si la posicion es 0, retornamos 0
			return 0;
		else if (posicion==1) // Si la posicion es 1, retornamos 1
			return 1;
		else
			// Si es mas de 2, será la suma de los dos anteriores
			return fibonacci(posicion-2)+fibonacci(posicion-1);} 	
	// Main
	public static void main(String[] args) {
		// Pedimos los turnos y la dificultad
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese la posición en la serie fibonacci: ");
		int lugar=teclado.nextInt();
		System.out.println("S("+lugar+") es: "+fibonacci(lugar));
		teclado.close();}}