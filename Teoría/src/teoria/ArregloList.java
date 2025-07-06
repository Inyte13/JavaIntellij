package teoria;

import java.util.*;

public class ArregloList {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//ArrayList<String> nombres=new ArrayList<String>(); // Siempre va en <>
		ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Luis", "Alberto", "García", "Daza"));
		nombres.set(2,"Paula"); // Cambio el índice 2 "García" por "Paula"
		String posicion=nombres.get(2); // Para buscar el índice del arreglo
		nombres.remove(2); // Remuevo "Paula" y el arreglo pasa 4 elementos a 3
		nombres.add(2,"Mafer"); // Se añadirá al final 
		//si quiere sobreescribir el elemento, no lo hará se correra el otro elemento		
		int tamaño=nombres.size();
		int lugar=nombres.indexOf("Mafer");
		boolean estaVacio=nombres.isEmpty();
		int lugarDesdeFinal=nombres.lastIndexOf("a");
		boolean tieneEsteElemento=nombres.contains("c");
		nombres.add("Elena");
		nombres.clear(); // El arreglo pasa a tener 0 elementos		
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		int n=numeros.get(2);
		System.out.println(n);}}
