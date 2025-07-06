package todocode;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int matriz[][]=new int[3][5];
		for(int i=0;i<matriz.length;i++) { // Matriz.length nos muestra la cantidad de filas
			// Matriz[0].length nos muestra la cantidad de columnas tomando de ejmplo la fila 0
			for(int j=0;j<matriz[0].length;j++) { 
				System.out.println("Ingrese el valor "+i+","+j);
				matriz[i][j]=teclado.nextInt();}}
		
		for(int i=0;i<matriz.length;i++) {
			System.out.println("\n");
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+"\t");}}
		teclado.close();
		
}}
