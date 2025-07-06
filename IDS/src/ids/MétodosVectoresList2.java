package ids;

import java.util.*;

public class MétodosVectoresList2 {
	
	public static ArrayList<Integer> randomNumeros(int n){ // Método randomNumeros 
		ArrayList<Integer> numeros=new ArrayList<>(); // Inicializamos el vector numeros
		for(int i=0;i<n;i++) { // Bucle n veces
			numeros.add(randomLimite(1,6)+randomLimite(1,6));} // Agregamos la suma de dos tiradas
		return numeros;}
	
	public static int randomLimite(int a, int b) { // Método randomLimite
		return (int)(Math.random()*(b-a+1))+a;} // Retornamos un valor random dentro del límite [a,b]
	
	public static ArrayList<Integer> ceros(int n) { // Método contador
		ArrayList<Integer> vector=new ArrayList<Integer>(); // Inicializamos el vector 
		for(int i=0;i<n;i++) { // Bucle n veces
			vector.add(0);} // Cada valor será 0
		return vector;}
	
	public static ArrayList<Integer> contador(ArrayList<Integer> vector){ // El vector donde se contará
		ArrayList<Integer> ceros=ceros(11); // Asignamos el vector ceros a otro vector ceros
		for(int valor:vector) { // for each tantas veces como vector
			ceros.set(valor-2,ceros.get(valor-2)+1);} // Se suma depende de el valor [2,12]
		return ceros;}
	
	public static void mayor(ArrayList<Integer> vector) { // Método mayor
		int mayor=vector.get(0), indice=0; // Inicializamos el valor mayor y el índice
		for(int i=0;i<vector.size();i++) { // Se repetira el tamaño de vector
			if(vector.get(i)>mayor) { // Si el valor del vector es mayor se guardará como el nuevo mayor
				mayor=vector.get(i);
				indice=i;}} 
		System.out.println("El valor mayor es: "+(indice+2)+" con valor: "+mayor+"");} // Imprimimos el mayor
	
	public static void menor(ArrayList<Integer> vector) { // Método menor
		int menor=vector.get(0), indice=0; // Inicializamos el valor meno y el índice
		for(int i=0;i<vector.size();i++) { // Se repetirá el tamaño del vector
			if(vector.get(i)<menor) { // Si el valor del vector es menor se guardará como el nuevo menor
				menor=vector.get(i);
				indice=i;}}			
		System.out.println("El valor menor es: "+(indice+2)+" con valor: "+menor);} // Imprimimos el menor
	
	public static void main(String[] args) { // Main
		Scanner teclado=new Scanner(System.in); 
		System.out.print("Cuántos lanzamientos desea hacer: "); // Pedimos los lanzamientos (n)
		int n=teclado.nextInt();
		ArrayList<Integer> vector=contador(randomNumeros(n)); // Guardamos el vector random ya contado en vector
		for(int i=0;i<vector.size();i++) // Lo mostramos tantas veces como el tamaño del vector
			System.out.println((i+2)+": "+vector.get(i));
		mayor(vector); // Método mayor
 		menor(vector); // Método menor
		teclado.close();}}