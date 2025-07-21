package ids;

import java.util.Scanner;

public class OperacionesMatriz {
	
	public static int [][] sumaMatriz(int a[][], int b[][]){ // Método para sumar
		int C[][]=new int[a.length][a[0].length]; // Iniciamos la matriz C con el mismo tamaño que a
		for(int j=0;j<a.length;j++) { // Tantas veces como las filas
			for(int i=0;i<a[0].length;i++) { // Tantas veces como las columnas
				C[j][i]=a[j][i]+b[j][i];}} // Calculamos el valor para c
		return C;}
	
	public static int [][] restaMatriz(int a[][], int b[][]){ // Método para restar
		int C[][]=new int[a.length][a[0].length]; // Iniciamos la matriz C con el mismo tamaño que a
		for(int j=0;j<a.length;j++) { // Tantas veces como las filas
			for(int i=0;i<a[0].length;i++) { // Tantas veces como las columna
				C[j][i]=a[j][i]-b[j][i];}} // Calculamos el valor para c
		return C;}
	
	public static int [][] productoMatriz(int a[][], int b[][]){ // Método para producto punto
		int C[][]=new int[a.length][a[0].length]; // Iniciamos la matriz C con el mismo tamaño que a
		for(int j=0;j<a.length;j++) { // Tantas veces como las filas
			for(int i=0;i<a[0].length;i++) { // Tantas veces como las columna
				C[j][i]=a[j][i]*b[j][i];}} // Calculamos el valor para c
		return C;}
	
	public static int[][] multiplicarMatrices(int a[][], int b[][]) {
        int C[][] = new int[a.length][b[0].length]; // filas de a y columnas de b
        for(int i=0;i<a.length;i++) { // Tantas veces como las filas a
            for(int j=0;j<b[0].length;j++) { // Tantas veces como las columnas b
                for(int k=0;k<a[0].length;k++) { // Columnas de a 
                    C[i][j]+=a[i][k]*b[k][j];}}}
        return C;}
	
	public static void main(String[] args) {
		
	}}


