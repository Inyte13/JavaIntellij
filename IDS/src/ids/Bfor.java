package ids;

import java.util.Scanner;

public class Bfor {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese el límite superior: ");
		int n=teclado.nextInt();
		System.out.print("Ingrese el límite inferior: ");
		int m=teclado.nextInt();
		if(m%2==0) {
			m+=1;}
		for(int i=m;n>=i;i+=2){
			System.out.print(i+", ");}
		teclado.close();}}