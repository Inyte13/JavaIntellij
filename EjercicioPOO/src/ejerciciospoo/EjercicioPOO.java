package ejerciciospoo;

import java.util.Scanner;

public class EjercicioPOO {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String name=teclado.nextLine();
        String espacio1=name.substring(0,name.indexOf(" "));
        String espacio1n=name.substring(name.indexOf(" ")+1,name.length());
        String espacio2=espacio1n.substring(0, espacio1n.indexOf(" "));
        String espacio3=espacio1n.substring(espacio1n.indexOf(" ")+1,espacio1n.length());
        String primera=espacio1.substring(0,1);
        String segunda=espacio2.substring(0,1);
        String tercera=espacio3.substring(0,1);
        String monograma=primera+segunda+tercera;
        System.out.println(monograma);
        teclado.close();}}
