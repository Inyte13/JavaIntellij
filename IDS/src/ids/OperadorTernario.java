package ids;

import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese su edad: ");
		int age=teclado.nextInt();
		String confirmacion=(age>=18)?"Eres mayor de edad":"Eres menor de edad";
		System.out.println(confirmacion);
		teclado.close();
	}

}
