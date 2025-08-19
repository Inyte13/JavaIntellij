package package1;

import java.util.Scanner;

public class AppOperaciones {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		int num1=teclado.nextInt();
		System.out.print("Escribe el segundo número: ");
		int num2=teclado.nextInt();
		// Ya no se crea "Operaciones" porque "OperacionesAvanzadas" lo hereda todo
		OperacionesAvanzadas opa1=new OperacionesAvanzadas(num1,num2); 
		System.out.println("La suma es: "+opa1.suma());	
		System.out.println("¿El primer número es par?: "+opa1.esPar());
		opa1.mostrarNumerosHasta();
		System.out.println("La multiplicación es: "+opa1.multiplicar());
		System.out.println("La división (padre) es: "+opa1.dividirP());
		System.out.println("La división (hija) es: "+opa1.dividir());
		teclado.close();			
	}
}
