package ids;

import java.util.*;

public class Comparador {
	public static ArrayList<Integer> notasTotales(int n) { // Método notasTotales
		ArrayList<Integer> vector=new ArrayList<>();// Creamos el vector de tamaño n
		for(int i=0;i<n;i++) vector.add(i,randomNotas()); // Le asignamos un valor del método random
		return vector;}
	
	public static int randomNotas() { // Método random desde [0, 21}
		return (int)(Math.random()*21);}
	
	public static void main(String[] args) { // Main
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese el número de notas: ");
		int n=teclado.nextInt();
		ArrayList<Integer> notas=notasTotales(n); // Asignamos el vector creado a notas
		System.out.println(notas); // Imprimimos el vector notas
		System.out.println(ordenDescendete(notas));} // Imprimimos usando el método ordenDescendete
	
	public static ArrayList<Integer> ordenDescendete(ArrayList<Integer> vector){
		ArrayList<Integer> copiaDeVector=new ArrayList<>(vector); // Copiamos el vector
		copiaDeVector.sort(Collections.reverseOrder()); // Ordenamos de mayor a menor
		return copiaDeVector;}}
