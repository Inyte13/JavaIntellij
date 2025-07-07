package ids;

import java.util.Scanner;

public class MétodosMatriz {
	
	public static void mostrarMatriz(int matriz[][]) { // Método mostrarMatriz
		for(int f=0;f<matriz.length;f++) { // Recorrer las filas 
			for(int c=0;c<matriz[0].length;c++) { // Recorrer las columnas
				System.out.print(matriz[f][c]+"\t");} // Mostramos la matriz
			System.out.println();} // Enter
		System.out.println();} // Enter
	
	public static void histograma(int vector[] []) { // Método histograma
		for(int j=0;j<vector.length;j++) { // Recorrer las filas
			for(int i=0;i<vector[0].length;i++) { // Recorrer las columnas
				System.out.print(""); // Enter
				for(int k=0;k<vector[j][i];k++) System.out.print("*"); // Mostrar * matriz[j][i] veces
				System.out.println();}}} // Enter
	
	public static int [][] generarMatriz(int j, int i) { // Método generarMatriz
		int matriz[][]=new int[j][i]; // Declaramos la matriz jxi
		for(int f=0;f<matriz.length;f++) { // Recorrer las filas
			for(int c=0;c<matriz[0].length;c++) { // Recorrer las columnas
				matriz[f][c]=(int)(Math.random()*9)+1;}} // Le asignamos un valor [1,9]
		return matriz;} // Retornamos la matriz
	
	public static boolean esIdentidad(int matriz[][]) {
		for(int f=0;f<matriz.length;f++) { // Recorrer las filas
			for(int c=0;c<matriz[0].length;c++) { // Recorrer las columnas
				if(f==c) { // En la diagonal
					if(matriz[f][c]!=1) // Si es diferente a 1
						return false;} // False
				else { // En cualquier otra posición
					if(matriz[f][c]!=0) // Si es diferente a 0
					return false;}}} // False
		return true;} // Si paso todo es True
	
	public static int [][] generarMatrizIde(int j, int i) { // Método generarMatrizIde
		int matriz[][]=new int[j][i]; // Declaramos la matriz jxi
		for(int f=0;f<matriz.length;f++) { // Recorrer las filas
			for(int c=0;c<matriz[0].length;c++) { // Recorrer las columnas
				if(f==c) matriz[f][c]=1; // En la diagonal será 1
				else matriz[f][c]=0;}} // En cualquier otra posición será 0
		return matriz;} // Retornamos la matriz
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		mostrarMatriz(generarMatriz(5,2));}}


