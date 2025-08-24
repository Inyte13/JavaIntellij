package ids;

import java.util.Scanner;

public class Modificable {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		char matriz[][]=new char[10][10];
		boolean bandera=true;
		boolean confirmacion=false;
		for(int j=0;j<matriz.length;j++) {
			for(int i=0;i<matriz[0].length;i++) {
				matriz[j][i]='L';
			}
		}
		while(bandera) {
			System.out.print("¿Desea ver los asientos disponibles?: ");
			confirmacion=teclado.nextBoolean();
			if(confirmacion) {
				mostrarMatriz(matriz);
			}
			System.out.print("Ingrese la fila: ");
			int f=teclado.nextInt()-1;
			System.out.print("Ingrese la columna: ");
			int c=teclado.nextInt()-1;
			if(matriz[f][c]=='L') {
				System.out.println("¡Gracias por su compra!");
				matriz[f][c]='X';
			}else {
				System.out.println("Este asiento esta ocupado");
			}
			System.out.print("Desea comprar de nuevo?: ");
			bandera=teclado.nextBoolean();
		}
		
	}
	public static void mostrarMatriz(char matriz[][]) {
		for(int j=0;j<matriz.length;j++) {
			System.out.print(j+1+"\t");
			for(int i=0;i<matriz[0].length;i++) {
				System.out.print(matriz[j][i]+"\t");
			}
			System.out.println();
		}				
		
	}
}
