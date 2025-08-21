package ids;

import java.util.Scanner;

public class Modificable {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese las filas: ");
		int f=teclado.nextInt();
		for(int c=0;c<f;c++) {
			for(int emp=0;emp<=f-c-1;emp++) {
				System.out.print(" ");
			}
			for(int ast=0;ast<c*2+1;ast++) {
				System.out.print("*");
			}			
			System.out.println();
		}
	}

}
