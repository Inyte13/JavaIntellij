//Laboratorio Nro 15 - Ejercicio2
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 2:00
package laboratorio;

import java.util.Scanner;

public class Ejercicio_6 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String confirmacion=""; // Inicializamos "confirmacion"
		while(!confirmacion.equalsIgnoreCase("n")) { // Continuará solo si es diferente a n/N
			if(!confirmacion.equalsIgnoreCase("n")) { // Si es diferente a n/N ejecutará el código
				System.out.print("Ingrese la cantidad de lanzamientos: ");
				int numeroIteraciones=teclado.nextInt(); // Pido el número de lanzamientos
				int estaDentro=0; //Inicializo el contador cuando esté dentro del círculo
				for(int i=1;i<=numeroIteraciones;i++) { //Repito los lanzamientos
					double ejeX=Math.random(); //Randomizo el eje x
					double ejeY=Math.random(); //Randomizo el eje y
					if(ejeX*ejeX+ejeY*ejeY<=1) //Si está dentro lo sumo al contador
						estaDentro++;}
				//Hallo la estimación de PI y lo redondeo a 4 decimales
				double estimacionPi=Math.round((4.0*estaDentro/numeroIteraciones)*10000)/10000.0;
				//Imprimo "Número de lanzamientos, "Dentro del círculo" y "Pi aproximado"
				System.out.println("Número de lanzamientos: "+numeroIteraciones+"\nDentro del círculo: "+
						estaDentro+"\nPi aproximado: "+estimacionPi);}
			//Pido el nuevo valor de "confirmación"
			System.out.print("De nuevo? y/n: "); 
			confirmacion=teclado.next();}
		teclado.close();}}
