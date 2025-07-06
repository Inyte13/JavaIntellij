package ids;

import java.util.Scanner;

public class Bwhile {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese el límite superior: ");
		int n=teclado.nextInt();
		System.out.print("Ingrese el límite inferior: ");
		int m=teclado.nextInt();
		int i=m;
		if(m%2==0) {
			i+=1;}
		while(n>=i){
			System.out.print(i+", ");
			i+=2;}
		teclado.close();}}