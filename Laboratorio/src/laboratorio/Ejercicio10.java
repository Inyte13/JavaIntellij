//Laboratorio Nro 23 - Ejercicio 1
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 2:00
package laboratorio;

public class Ejercicio10 {
	public static int dado() { // Método para calcular número aleatorio entre el [1,6]
		return (int)(Math.random()*6)+1;}
	
	public static void mostrar(int dado1, int dado2, int lanzamiento) { // Método mostrar
		System.out.println("Lanzamiento "+lanzamiento+":"+" "+dado1+" - "+dado2);}
	
	public static void jugar() { // Jugar
		int i=1; // Inicializo el contador
		int dado1=0; // Inicializo la variable dado1
		int dado2=0; // Inicializoa la variable dado2
		while(dado2+dado1!=12){ // Si la suma es diferente a 12, ejecuta
			dado1=dado(); // Asigno un aleatorio a dado1 
			dado2=dado(); // Asigno un aleatorio a dado2
			mostrar(dado1,dado2,i); // Muestro con el método mostrar
			i++;} // Aumento el contador
		System.out.println("¡Doble seis conseguiedo en "+(i-1)+" intento(s)!");}
	
	public static void main(String[] args) {
		// Pedimos el N números de notas
		jugar();}}
			
