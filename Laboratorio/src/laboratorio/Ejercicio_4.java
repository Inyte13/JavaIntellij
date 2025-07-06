//Laboratorio Nro 11 - Ejercicio1
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 2:00
package laboratorio;
import java.util.Scanner;
public class Ejercicio_4 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//El usuario ingresa los datos
		System.out.print("Ingrese x1: ");
		int x1=teclado.nextInt();
		System.out.print("Ingrese y1: ");
		int y1=teclado.nextInt();
		System.out.print("Ingrese x2: ");
		int x2=teclado.nextInt();
		System.out.print("Ingrese y2: ");
		int y2=teclado.nextInt();
		System.out.print("Ingrese x3: ");
		int x3=teclado.nextInt();
		System.out.print("Ingrese y3: ");
		int y3=teclado.nextInt();
		System.out.print("Ingrese x4: ");
		int x4=teclado.nextInt();
		System.out.print("Ingrese y4: ");
		int y4=teclado.nextInt();
		int maxxa=Math.max(x1, x2);int minxa=Math.min(x1, x2);int maxya=Math.max(y1, y2);
		int minya=Math.min(y1, y2);int maxxb=Math.max(x3, x4);int minxb=Math.min(x3, x4);
		int maxyb=Math.max(y3, y4);int minyb=Math.min(y3, y4);
		System.out.println("Rectangulo A = (["+x1+", "+y1+"], "+"["+x2+", "+y2+"])");
		System.out.println("Rectangulo B = (["+x3+", "+y3+"], "+"["+x4+", "+y4+"])");
		boolean disjuntos=maxxa<minxb||maxxb<minxa||maxya<minyb||maxyb<minya;
		boolean mismox=minxb==maxxa||maxxb==minxa;
		boolean mismoy=minyb==maxya||maxyb==minya;
		if (disjuntos)
			System.out.println("Son disjuntos");
		else {
			boolean tocanx=mismox&&(maxyb>=minya&&minyb<=maxya);
			boolean tocany=mismoy&&(maxxb>=minxa&&minxb<=maxxa);
			if(tocanx||tocany) {
				System.out.println("Se tocan");}		
			else {
				System.out.println("Se traslapan");}}
		teclado.close();}}
