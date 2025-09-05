package teoria;

import java.util.ArrayList;
import java.util.Collections;

public class _ArrayList_ {
	
	public static void main(String[] args) {
		ArrayList<Integer> vacio= new ArrayList<>(8); // Reserva internamente pero igual esta vacío
		ArrayList<Integer> list=new ArrayList<>(Collections.nCopies(10, 0));
		list.add(9,1); // Se coloca en ese índice y recorre todo lo demás
		list.set(9, 0); // Remplaza el valor en ese índice
		list.get(9); // Devuelve el valor del índice 9
		list.remove(10); // Elimina el valor del índice 10
		list.size(); // Tamaño de la lista
		list.contains(1); // Booleano que comprueba si esta el "1"
		System.out.println(list);		
	}
	public static void mayor(ArrayList<Integer> vector) { // Método mayor
		int mayor=vector.get(0), indice=0; // Inicializamos el valor mayor y el índice
		for(int i=0;i<vector.size();i++) { // Se repetira el tamaño de vector
			if(vector.get(i)>mayor) { // Si el valor del vector es mayor se guardará como el nuevo mayor
				mayor=vector.get(i);
				indice=i;
			}
		} 
		System.out.println("El valor mayor es: "+indice+" con valor de: "+mayor+"");
	} 
	
	public static void menor(ArrayList<Integer> vector) { // Método menor
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