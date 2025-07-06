package ids;

import java.util.*;

public class MétodosVectoresList {
	public static ArrayList<Integer> contador(int n){ // Método contador {0...0}
		ArrayList<Integer> vector=new ArrayList<>(); // Creamos el vector
		for(int i=0;i<n;i++) vector.add(i,0); // Todos sus valores serán 0
		return vector;} // Retornamos
	
	public static int randomNotas() { // Método random desde [0, 21}
		return (int)(Math.random()*21);}
	
	public static ArrayList<Integer> notasTotales(int n) { // Método notasTotales
		ArrayList<Integer> vector=new ArrayList<>();// Creamos el vector de tamaño n
		for(int i=0;i<n;i++) vector.add(i,randomNotas()); // Le asignamos un valor del método random
		return vector;}
	
	public static void muestra(ArrayList<Integer> a, ArrayList<Integer> b) { // Método muestra
		for(int i=0;i<a.size();i++)   
			b.set(a.get(i),b.get(a.get(i))+1); // Añadimos al contador {0...0}
		histograma(b); // Mostramos el histograma
		mayor(b); // Mostramos el máximo
		menor(b);} // Mostramos el mínimo
	
	public static void mayor(ArrayList<Integer> vector) { // Método mayor
		int mayor=vector.get(0), indice=0; // Inicializamos el valor mayor y el índice
		for(int i=0;i<vector.size();i++) { // Se repetira el tamaño de vector
			if(vector.get(i)>mayor) { // Si el valor del vector es mayor se guardará como el nuevo mayor
				mayor=vector.get(i);
				indice=i;}} 
		System.out.println("El valor mayor es: "+indice+" con valor de: "+mayor+"");} // Imprimimos el mayor
	
	public static void menor(ArrayList<Integer> vector) { // Método menor
		int menor=vector.get(0), indice=0; // Inicializamos el valor meno y el índice
		for(int i=0;i<vector.size();i++) { // Se repetirá el tamaño del vector
			if(vector.get(i)<menor) { // Si el valor del vector es menor se guardará como el nuevo menor
				menor=vector.get(i);
				indice=i;}}			
		System.out.println("El valor menor es: "+indice+" con valor de: "+menor);} // Imprimimos el menor
	
	public static void histograma(ArrayList<Integer> vector) { // Método histograma
		for(int i=0;i<vector.size();i++) { 
			System.out.print("Nota "+i+": "); // Informamos la nota que es
			for(int k=0;k<vector.get(i);k++) System.out.print("*"); // Se repetira vector[i] veces
			System.out.println();}} // Enter
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		// Pedimos la cantidad de alumnos
		System.out.print("Ingrese la cantidad de alumnos: ");
		int n=teclado.nextInt();
		muestra(notasTotales(n), contador(21));
		teclado.close();}}