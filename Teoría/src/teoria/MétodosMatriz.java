package teoria;

import java.util.Random;
import java.util.Scanner;

public class MétodosMatriz {
	public static void mostrarMatriz(int matriz[][]) {
		for(int j=0;j<matriz.length;j++) { // Recorrer las filas
			for(int i=0;i<matriz[0].length;i++) { // Recorrer las columnas
				System.out.print(matriz[j][i]+"\t");} // Se mostrará el valor, después un tab
			System.out.println(); // Enter
		}
	} 
	
	public static void histograma(int matriz[][]) {
		for(int j=0;j<matriz.length;j++) { // Recorrer las filas
			for(int i=0;i<matriz[0].length;i++) { // Recorrer las columnas
				for(int k=0;k<matriz[j][i];k++) {
					System.out.print("*"); // Mostrar * matriz[j][i] veces
				}
				System.out.println(); // Enter
			}
		}
	} 
	
	public static int [][] ingresarMatriz() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese número de fila: ");
		int f=teclado.nextInt();
		System.out.print("Ingrese número de columnas: ");
		int c=teclado.nextInt();
		int matriz[][]=new int [f][c]; // Creamos la matriz fxc
		for(int j=0;j<matriz.length;j++) { // Iteramos las filas
			for(int i=0;i<matriz[0].length;i++) { // Iteramos las columnas
				// Le pedimos que ingrese la matriz
				System.out.print("Ingrese el valor de "+j+", "+i+": ");
				matriz[j][i]=teclado.nextInt();
			}
		}
		return matriz;
	}
	
	public static int [][] generarMatriz(int j, int i) { // Generar matriz random de [1,9]
		Random random= new Random();
		int matriz[][]=new int[j][i]; // Declaramos la matriz jxi
		for(int f=0;f<matriz.length;f++) { // Iteramos las filas
			for(int c=0;c<matriz[0].length;c++) { // Iteramos las columnas
				matriz[f][c]=random.nextInt(10); // Le asignamos un valor random entre [0,10}
			}
		}
		return matriz;
	} 
		
	public static void main(String[] args) {
		int matriz[][]=generarMatriz(3, 3);
		mostrarMatriz(matriz);
	}
}


