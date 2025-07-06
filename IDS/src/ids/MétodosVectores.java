package ids;

import java.util.Scanner;

public class MétodosVectores {
	public static int []contador(int n){ // Método contador {0...0}
		int vector[]=new int[n]; // Creamos el vector
		for(int i=0;i<vector.length;i++) vector[i]=0; // Todos sus valores serán 0
		return vector;} // Retornamos
	
	public static int randomNotas() { // Método random desde [0, 21}
		return (int)(Math.random()*21);}
	
	public static int [] notasTotales(int n) { // Método notasTotales
		int vector[]=new int[n]; // Creamos el vector de tamaño n
		for(int i=0;i<n;i++) vector[i]=randomNotas(); // Le asignamos un valor del método random
		return vector;}
	
	public static void muestra(int a[], int b[]) { // Método muestra
		for(int i=0;i<a.length;i++)   
			b[a[i]]++; // Añadimos al contador {0...0}
		histograma(b); // Mostramos el histograma
		max(b); // Mostramos el máximo
		min(b);} // Mostramos el mínimo
	
	public static void max(int vector[]) { // Método max
		int max=0, indice=0; // Inicializamos variables
		for(int i=0;i<vector.length;i++) {
			if(vector[i]>max) { // Si el valor con índice i es mayor que max (0) 
				max=vector[i]; // Se convierte en el nuevo max
				indice=i;}} // Y se guarda el índice
		System.out.println("La mayor frecuencia es "+indice+" con "+max);}
	
	public static void min(int vector[]) { // Método min
		int min=21, indice=0; // Inicializamos variables
		for(int i=0;i<vector.length;i++) { 
			if(vector[i]<min) { // Si el valor con índice i es menor que min (21)
				min=vector[i]; // Se convierte en el nuevo min
				indice=i;}} // Y se guarda el índice
		System.out.println("La menor frecuencia es "+indice+" con "+min);}
	
	public static void histograma(int vector[]) { // Método histograma
		for(int i=0;i<vector.length;i++) { 
			System.out.print("Nota "+i+": "); // Informamos la nota que es
			for(int k=0;k<vector[i];k++) System.out.print("*"); // Se repetira vector[i] veces
			System.out.println();}} // Enter
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		// Pedimos la cantidad de alumnos
		System.out.print("Ingrese la cantidad de alumnos: ");
		int n=teclado.nextInt();
		muestra(notasTotales(n), contador(21));
		teclado.close();}}





