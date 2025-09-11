package laboratorio;

import java.util.Scanner;

public class Lista {
	private int list[]=new int[5];
	public double promedio() {
		int sum=0;
		for(int li:list) {
			sum+=li;
		}
		return sum*1.0/list.length;
		
	}
	public void agregar() {
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<list.length;i++) {
			System.out.print("Ingrese un número en el índice "+i+": ");
			list[i]=teclado.nextInt();
		}
	}
	public int menoresPromedio() {
		int count=0;
		for(int li:list) {
			if(li<promedio()) {
				count++;
			}
		}
		return count;
	}
	public int mayoresPromedio() {
		int count=0;
		for(int li:list) {
			if(li>promedio()) {
				count++;
			}
		}
		return count;
	}
	public int igualesPromedio() {
		int count=0;
		for(int li:list) {
			if(li==promedio()) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Lista list=new Lista();
		list.agregar();
		System.out.println("El promedio es "+list.promedio()+"\n"
				+ "Por debajo del promedio: "+list.menoresPromedio()+"\n"
				+ "Por encima del promedio: "+list.mayoresPromedio()+"\n"
				+ "Igual que el promedio: "+list.igualesPromedio());
	}
}

