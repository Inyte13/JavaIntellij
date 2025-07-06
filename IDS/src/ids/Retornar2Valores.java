package ids;

import java.util.Scanner;

public class Retornar2Valores {
	
	public static void lanzamiento(int dados, int jugadores) { // Método lanzamiento
		int matriz[][]=new int [jugadores][dados]; // Creamos la matriz 
		int sumas[]=new int [jugadores]; // Creamos el vector que guardará las sumas de cada fila
		int contador[]=new int[6]; // Creamos el vector que contará las veces que aparece cada valor del dado
		int sumaJ=0; // Iniciamos la variable sumaJ que calculará la suma de la fila
		for(int j=0;j<matriz.length;j++) { // Tantas veces como las filas 
			for(int i=0;i<matriz[0].length;i++) { // Tantas veces como las columnas
				matriz[j][i]=(int)(Math.random()*6)+1; // A cada valor de la matriz le asignaremos uno random
				contador[matriz[j][i]-1]++;}} // Por cada valor del 1-6 se añadirá al vector de índice 0-5
				
		for(int j=0;j<matriz.length;j++) { // Tantas veces como las filas 
			for(int i=0;i<matriz[0].length;i++) { // Tantas veces como las columnas
				sumaJ+=matriz[j][i];} // La sumaJ será la suma de cada fila
			sumas[j]=sumaJ; // El vector recogerá los valores totales
			sumaJ=0;} // Reniciaremos la suma para la siguiente vuelta
		for(int j=0;j<matriz.length;j++) {  // Tantas veces como las filas 
			System.out.print("Jugador N°"+(j+1)+": "); 
			for(int i=0;i<matriz[0].length;i++) { // Tantas veces como las columnas 
				System.out.print(matriz[j][i]+" ");} 
			System.out.print("= "+sumas[j]+"\n");}
		int resultado1[]=max(sumas); // Llamamos al método max
		System.out.println("El jugador N°"+resultado1[0]+" ganó con la suma de "+resultado1[1]);
		int resultado2[]=max(contador); // Llamamos al método max
		System.out.println("La mayor frecuencia es de "+resultado2[0]+" con "+resultado2[1]+" apariciones");}
	
	public static int [] max(int vector[]) { // Método max
		int max=0, indice=0; // Inicializamos variables
		for(int i=0;i<vector.length;i++) {
			if(vector[i]>max) { // Si el valor con índice i es mayor que max (0) 
				max=vector[i]; // Se convierte en el nuevo max
				indice=i;}} // Y se guarda el índice
		return new int[] {indice+1,max};} // Retornamos 2 valores
	
	public static void main(String[] args) {
		// Pedimos los dados y los jugadores
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese la cantidad de dados por jugador: ");
		int dados=teclado.nextInt();
		System.out.print("Ingrese los jugadores: ");
		int jugadores=teclado.nextInt();
		lanzamiento(dados,jugadores);
		teclado.close();}}


