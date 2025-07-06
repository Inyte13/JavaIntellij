//Laboratorio Nro 15 - Ejercicio1
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 2:00
package laboratorio;

import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String confirmacion=""; //Inicializo "confirmación"
		while(!confirmacion.equalsIgnoreCase("n")) { //Si es diferente a n/N inicia el bucle
			if(!confirmacion.equalsIgnoreCase("n")) { //Si es diferente a n/N inicia el código
				//Pido la cantidad de números primos
				System.out.print("Ingrese cuantos números primos quiere: ");
				int numerosPrimos=teclado.nextInt();
				int contadorPrimos=0; //Inicializo el contador de número primos
				for(int i=2;;i++) { //Bucle sin cotar el 1 porque sabemos que no es primo
					int divisores=0; //Inicializo el contador de divisores
					for(int k=1;k<i;k++) { //Bucle sin contar al propio número
						if(i%k==0) { //Si tiene divisores
							divisores++;}}//Se sumará al contador
					if(divisores==1) { //Si solo tiene un divisor (1)
						System.out.print(i+" "); //Lo imprimirá
						contadorPrimos++;} //Se suma al contador de números primos
					else if(contadorPrimos==numerosPrimos)//Cuando sean iguales se rompera el bucle
						break;}}
			System.out.print("\nDe nuevo?: ");//Pido el nuevo valor de "confirmación"
			confirmacion=teclado.next();}		
		teclado.close();}}
