package ids;

import java.util.Scanner;

public class MétodosMatriz {
	public static int [] [] notasTotales(int j, int i, Scanner teclado) { // Método notasTotales
		int matriz[][]=new int[j][i]; // Declaramos la matriz jxi
		for(int f=0;f<matriz.length;f++) { // Recorrer las filas
			for(int c=0;c<matriz[0].length;c++) { // Recorrer las columnas
				System.out.print("Ingrese una nota [1,5]: "); // Pedimos la nota
				matriz[f][c]=teclado.nextInt();}}
		return matriz;} // Retornamos la matriz
	
	public static void muestra(int matriz[][]) { // Método muestra
		for(int f=0;f<matriz.length;f++) { // Recorrer las filas 
			for(int c=0;c<matriz[0].length;c++) { // Recorrer las columnas
				System.out.print(matriz[f][c]+"\t");} // Mostramos la matriz
			System.out.println();} // Enter
		System.out.println(); // Enter
		histograma(matriz);} // Mostramos el histograma
	
	public static void histograma(int vector[] []) { // Método histograma
		for(int j=0;j<vector.length;j++) { // Recorrer las filas
			for(int i=0;i<vector[0].length;i++) { // Recorrer las columnas
				System.out.print(""); // Enter
				for(int k=0;k<vector[j][i];k++) System.out.print("*"); // Mostrar * matriz[j][i] veces
				System.out.println();}}} // Enter
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		muestra(notasTotales(5,2, teclado));}}


