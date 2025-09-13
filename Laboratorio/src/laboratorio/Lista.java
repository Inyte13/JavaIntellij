package laboratorio;

import java.util.Scanner;

public class Lista {
    private int n;
	private int nums[]=new int[n];
	public void agregar() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese el tamaño del arreglo: ");
		n=teclado.nextInt();		
		for(int i=0;i<nums.length;i++) {
			System.out.print("Ingrese un número en el índice "+i+": ");
			nums[i]=teclado.nextInt();
		}
	}
	public void masQueMitad() {
		for(int num:nums) {
			
		}
	}
	public static void main(String[] args) {
		Lista list=new Lista();
		list.agregar();
	}
}

