package teoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _ArrayList_ {
	
	public static void main(String[] args) {
<<<<<<< HEAD
		ArrayList<Integer> vacio= new ArrayList<>(8); // Reserva internamente pero igual esta vacío
		ArrayList<Integer> list=new ArrayList<>(Collections.nCopies(10, 0));
		list.add(9,1); // Se coloca en ese índice y recorre lo demás
		list.set(9, 0); // Remplaza el valor en ese índice
		list.get(9); // Devuelve el valor del índice 9
		list.remove(10); // Elimina el valor del índice 10
		list.size(); // Tamaño de la lista
		list.contains(1); // Booleano que comprueba si esta el "1"
		list.indexOf(0); // Nos da el índice del primer 0 que encuentre y si no -1
		list.lastIndexOf(0); // Nos da el índice el primer 0 que encuentre desde el final
		ArrayList<Integer> copia=new ArrayList<>(list); // Para copiar la lista
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(2,3,19,5,10,0,1));
		Collections.sort(list2); // Ordenar la lista ascendentemente
		Collections.reverse(list2); // Invertir el orden
		Collections.shuffle(list2); // Mezclar el orden aleatoriamente
		Collections.max(list2); // El mayor valor
		Collections.min(list2); // El menor valor
		System.out.println(Collections.max(list2));		
=======
    ArrayList<String> nombres = new ArrayList<>(8);
    ArrayList<Integer> numeros = new ArrayList<>(Collections.nCopies(10, 0)); // Crea un ArrayList de size 10 y values de 0
    ArrayList<Integer> numeros2 = new ArrayList<>(Arrays.asList(3, 4, 5, 5, 63, 23));
    numeros.add(1); // Inserta el value de 1 al final de la cola
    numeros.add(0, 99); // Inserta el value de 99 en el index 0
    numeros.set(10, -1); // Reemplaza el valor
    numeros.get(11); // Devuelve el value del index 11
    numeros.remove(11); // Elimiunar el value del index 11
    numeros.size(); // Devuelve el tamaño del ArrayList
    numeros.contains(2); // El value 2 se encuentra en el ArrayList?
    numeros.indexOf(9); // Busca el value 9, devuelve el index si lo encuentra
    numeros.lastIndexOf(9); // Busca el value 9 desde atrás, devuelve el index si lo encuentra+
    ArrayList<Integer> copia = new ArrayList<>(numeros); // Copiar el ArrayList
    Collections.sort(numeros2); // Ordenar ASC
    Collections.reverse(numeros2); // Invertir el Orden
    Collections.shuffle(numeros2); // Mezcla aleatoriamente
    Collections.max(numeros2); // Devuelve el MAX
    Collections.min(numeros2); // Deuvelve el MIN
        
>>>>>>> b833f35e0fbddfb75519da59654b2563cb21a453
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