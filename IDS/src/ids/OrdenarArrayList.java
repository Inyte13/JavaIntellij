package ids;

import java.util.*;

public class OrdenarArrayList {
	
	public static ArrayList<Integer> notasTotales(int n) { // Método notasTotales
		ArrayList<Integer> vector=new ArrayList<>(n);// Creamos el vector de tamaño n
		for(int i=0;i<n;i++) 
			vector.add(i,randomNotas()); // Le asignamos un valor del método randomNotas
		return vector;}
	
	public static int randomNotas() { // Método random desde [0, 21}
		return (int)(Math.random()*21);}
	
	public static ArrayList<Integer> ordenDescendente(ArrayList<Integer> vector){ // Método ordenDescendete
		ArrayList<Integer> copiaDeVector=new ArrayList<>(vector); // Copiamos el vector
		copiaDeVector.sort(Collections.reverseOrder()); // Ordenamos de mayor a menor
		return copiaDeVector;}

public static void main(String[] args) { // Main
	Scanner teclado=new Scanner(System.in);
	System.out.print("Ingrese el número de notas: ");
	int n=teclado.nextInt();
	ArrayList<Integer> notas=notasTotales(n); // Asignamos el vector creado a notas
	System.out.println(notas); // Imprimimos el vector notas
	System.out.println(ordenDescendente(notas));}} // Imprimimos usando el método ordenDescendente