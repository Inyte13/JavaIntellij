package ids;

import java.util.Scanner;

public class Ejercicio9 {
	public static void mostrarMatriz(int matriz[][]) { // Método para mostrar la matriz
		for(int j=0;j<matriz.length;j++) { // Tantas veces como las filas
			for(int i=0;i<matriz[0].length;i++) { // Tantas veces como las columnas
				System.out.print(matriz[j][i]+"\t");} // Se mostrará el valor j y i, después un tab
			System.out.println();}} // Enter
	
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
	
	public static int[][] multiplicarMatrices(int a[][], int b[][]) {
        int C[][] = new int[a.length][b[0].length]; // filas de a y columnas de b
        for(int i=0;i<a.length;i++) { // Tantas veces como las filas a
            for(int j=0;j<b[0].length;j++) { // Tantas veces como las columnas b
                for(int k=0;k<a[0].length;k++) { // Columnas de a 
                    C[i][j]+=a[i][k]*b[k][j];}}}
        return C;}
	
	public static void main(String[] args) {
		mostrarMatriz(multiplicarMatrices(ingresarMatriz(), ingresarMatriz()));}}


