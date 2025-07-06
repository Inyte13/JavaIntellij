//Laboratorio Nro 12 - Ejemplo3
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 2:00
package galapagos;

import java.util.Scanner;

public class EjemploTortuga03 {
    public static void main(String[] args) {
    	Turtle t=new Turtle();
    	Scanner teclado=new Scanner(System.in);
    	System.out.println("Ingrese dos valores: ");
    	int n1=teclado.nextInt();
    	int n2=teclado.nextInt();
    	t.speed(500);
    	t.jumpTo(-n1/2, -n1/2);
    	for(int i=1;i<=4;i++) {
    		t.move(n1);
    		t.turn(90);}
    	t.jumpTo(n1/5,0);
    	for(int k=1;k<=4;k++) {
    		t.move(n1*3/14);
    		t.turn(90);}
    	t.jumpTo(-n1/5,0);
    	t.turn(180);
    	for(int k=1;k<=4;k++) {
    		t.move(n1*3/14);
    		t.turn(-90);}
    	t.jumpTo(-n1/8,-n1/2);
    	t.turn(-90);
    	t.move(n1/3);	
    	t.turn(-90);
    	t.move(n1/4);
    	t.turn(-90);
    	t.move(n1/3);
    	t.jumpTo(0,n1/2);
    	t.turn(-90);
    	t.move(n2*4);
    	t.turn(-143);
    	t.move(n2*5);
    	t.turn(-74);
    	t.move(n2*5);
    	t.turn(-143);
    	t.move(n2*4);
    	teclado.close();}}
