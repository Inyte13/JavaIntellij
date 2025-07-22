package ids;

import java.util.*;

public class Mezclar1_6 {
	public static void main(String[] args) { // Main
		Scanner teclado=new Scanner(System.in);
		String confirmacion="Y"; // Inicializamos la variable confirmción
		while(!confirmacion.equalsIgnoreCase("n")){ // Siempre que sea diferente que n/N
			System.out.print("Quiere jugar (y/n): "); // Le preguntamos si quiere jugar
			confirmacion=teclado.next();			
			if(!confirmacion.equalsIgnoreCase("n")) { // Si es diferente a n/N
				ArrayList<Integer> vector=new ArrayList<>(); // Creamos nuestro vector
				while(vector.size()<6) { // Siempre que el vector sea menor que 6
					int num=randomLimite(1,6); // Inicializamos num con valor de random [1,6]
					if(!vector.contains(num)) // Si ese número no esta
						vector.add(num);} // lo agregamos
				System.out.println(vector);}}} // Imprimimos el vector 
	
	public static int randomLimite(int a, int b) { // Método randomLimite
		return (int)(Math.random()*(b-a+1))+a;}} // Retornamos un valor random dentro del límite [a,b]