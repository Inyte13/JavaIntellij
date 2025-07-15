//Laboratorio Nro 23 - Ejercicio 1
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 2:00
package laboratorio;

import java.util.*;

public class Ejercicio1 {
	// Método amp
	public static String amp (String adn, int ini, int fin){
		String primer=adn.substring(0,fin+1);
		String segundo=adn.substring(fin+1,adn.length());
		String duplicar=adn.substring(ini,fin+1);
		return primer+duplicar+segundo;}
	
	public static String del (String adn, int ini, int fin){
		String primer=adn.substring(0,ini);
		String segundo=adn.substring(fin+1,adn.length());
		return primer+segundo;}
	
	public static String inv(String adn, int ini, int fin){
		String primer=adn.substring(0,ini);
		String segundo=adn.substring(ini,fin);
		String tercer=adn.substring(fin, adn.length());
		String reverse=new StringBuilder(segundo).reverse().toString();
		return primer+reverse+tercer;
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese una cadena de ADN: ");
		String adn=teclado.nextLine();
		/*System.out.print("Cantidad de mutaciones: ");
		int n=teclado.nextInt();*/
		System.out.println(inv(adn,1,5));
		//System.out.println(del(adn,6,9));
		//System.out.println(inv(adn,2,3));
		/*for(int i=0;i<n;i++) {
			System.out.println("Ingrese la mutación "+n);}*/
	}

}
