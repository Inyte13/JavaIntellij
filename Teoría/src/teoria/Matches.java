package teoria;

import java.util.Scanner;

public class Matches {
	// Ingresar números de celular a un arreglo de tamño 100 los números de celular deben tener una longitud de 9
	// ademas se de inbresar números de celular hasta ingreas la lentra q, mostrar la lista de celulares
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String numero="Hola";
		String list[]=new String[100];
		int count=0;
		while(!numero.equalsIgnoreCase("q")) {
			System.out.print("Ingrese el número de celular N°"+count+": ");
			numero=teclado.next();
			if(!numero.equalsIgnoreCase("q")&&numero.charAt(0)=='9'&&numero.matches("\\d{9}")) {
				list[count]=numero;
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(list[i]);
		}
	}
}
