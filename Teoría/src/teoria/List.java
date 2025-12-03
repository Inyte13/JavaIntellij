package teoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {
	
	public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<>(8);
    ArrayList<Integer> numeros = new ArrayList<>(Collections.nCopies(10, 0)); // C  rea un ArrayList de size 10 y values de 0
    ArrayList<Integer> numeros2 = new ArrayList<>(Arrays.asList(3, 4, 5, 5, 63, 23));
    numeros.add(1); // Inserta el value de 1 al final de la cola
    numeros.add(0, 99); // Inserta el value de 99 en el index 0
    numeros.set(10, -1); // Reemplaza el valor
    numeros.get(11); // Devuelve el value del index 11
    numeros.remove(11); // Elimiunar el value del index 11
    numeros.size(); // Devuelve el tamaño del ArrayList
    numeros.contains(2); // El value 2 se encuentra en el ArrayList?
    numeros.indexOf(9); // Busca el value 9, devuelve el index si lo encuentra
    numeros.lastIndexOf(9); // Busca el value 9 desde atrás, devuelve el index si lo encuentra
    numeros.isEmpty(); // Nos dice si está vacía
    // numeros.isNotEmpty(); NO EXISTE
    ArrayList<Integer> copia = new ArrayList<>(numeros); // Copiar el ArrayList
    Collections.sort(numeros2); // Ordenar ASC
    Collections.reverse(numeros2); // Invertir el Orden
    Collections.shuffle(numeros2); // Mezcla aleatoriamente
    Collections.max(numeros2); // Devuelve el MAX
    Collections.min(numeros2); // Deuvelve el MIN
	}
	public static void mayor(ArrayList<Integer> vector) { 
		int mayor=vector.get(0), indice=0; // Inicializamos el valor mayor y el índice
		for(int i=0;i<vector.size();i++) { // Se repetira el tamaño de vector
			if(vector.get(i)>mayor) { // Si el valor del vector es mayor se guardará como el nuevo mayor
				mayor=vector.get(i);
				indice=i;
			}
		} 
		System.out.println("El valor mayor es: "+indice+" con valor de: "+mayor);
	} 
	
	public static void menor(ArrayList<Integer> vector) {
		int menor=vector.get(0), indice=0; // Inicializamos el valor meno y el índice
		for(int i=0;i<vector.size();i++) { // Se repetirá el tamaño del vector
			if(vector.get(i)<menor) { // Si el valor del vector es menor se guardará como el nuevo menor
				menor=vector.get(i);
				indice=i;
			}
		}			
		System.out.println("El valor menor es: "+indice+" con valor de: "+menor);
	}
	
}