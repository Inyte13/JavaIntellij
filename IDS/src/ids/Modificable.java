package ids;

import java.util.Scanner;

public class Modificable {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int matriz[][]= {{120,15,30},{65,1,2},{4,52,7},{46,32,16},{64,23,11},{61,12,91}};
		String key=" ";
		while(!key.equalsIgnoreCase("finish")) {
			System.out.print("Ingrese el destino: ");
			int f=teclado.nextInt();
			System.out.print("Ingrese el horario: ");
			int c=teclado.nextInt();
			System.out.print("Ingrse la cantidad de pasajes que desea comprar: ");
			int num=teclado.nextInt();

			if(matriz[f][c]>=num) {
				System.out.println("Su reseva fue realizada con éxito");
				matriz[f][c]-=num;
			}else {
				System.out.println("No hay asientos disponibles");
			}
			System.out.print("¿Desea finalizar?: ");
			key=teclado.next();
		}	
	}
}
