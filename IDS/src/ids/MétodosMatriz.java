package ids;

import java.util.Scanner;

public class MétodosMatriz {
	public static void mostrarMatriz(int matriz[][]) { // Método para mostrar la matriz
		for(int j=0;j<matriz.length;j++) { // Tantas veces como las filas
			for(int i=0;i<matriz[0].length;i++) { // Tantas veces como las columnas
				System.out.print(matriz[j][i]+"\t");} // Se mostrará el valor j y i, después un tab
			System.out.println();}} // Enter
	
	public static void histograma(int vector[] []) { // Método histograma
		for(int j=0;j<vector.length;j++) { // Recorrer las filas
			for(int i=0;i<vector[0].length;i++) { // Recorrer las columnas
				System.out.print(""); // Enter
				for(int k=0;k<vector[j][i];k++) System.out.print("*"); // Mostrar * matriz[j][i] veces
				System.out.println();}}} // Enter
	
	public static int [][] ingresarMatriz() { // Método para ingresar una matriz
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese m: ");
		int m=teclado.nextInt();
		System.out.print("Ingrese n: ");
		int n=teclado.nextInt();
		int matriz[][]=new int [m][n]; // Creamos la matriz mxn
		for(int j=0;j<matriz.length;j++) { // Tantas veces como las filas  
			for(int i=0;i<matriz[0].length;i++) { // Tantas veces como las columnas
				// Le pedimos que ingrese la matriz
				System.out.print("Ingrese el valor de "+j+", "+i+": ");
				matriz[j][i]=teclado.nextInt();}}
		return matriz;} // Retornamos
	
	public static int [][] generarMatriz(int j, int i) { // Método generarMatriz
		int matriz[][]=new int[j][i]; // Declaramos la matriz jxi
		for(int f=0;f<matriz.length;f++) { // Recorrer las filas
			for(int c=0;c<matriz[0].length;c++) { // Recorrer las columnas
				matriz[f][c]=(int)(Math.random()*9)+1;}} // Le asignamos un valor [1,9]
		return matriz;} // Retornamos la matriz
		
	public static void main(String[] args) {
		
	}}


