package ids;

import java.util.Scanner;

public class OperacionesMatriz {
	public static void mostrarMatriz(int matriz[][]) { // Método para mostrar la matriz
		for(int j=0;j<matriz.length;j++) { // Tantas veces como las filas 
			for(int i=0;i<matriz[0].length;i++) { // Tantas veces como las columnas
				System.out.print(matriz[j][i]+"\t");} // Se mostrará el valor y después un tab
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
	
	public static void main(String[] args) {
		int A[][]=ingresarMatriz(); // Ingresamos A
		int B[][]=ingresarMatriz(); // Ingresamos B
		mostrarMatriz(sumaMatriz(A,B));
		System.out.println(); // Enter
		mostrarMatriz(restaMatriz(A,B));
		System.out.println(); // Enter
		mostrarMatriz(productoMatriz(A,B));}}


