package ids;

import java.util.Scanner;

public class EuclidesRecursivo {
	
    public static int mcd(int a, int b) { // Método mcd
        if(b==0){
            return a;} // Caso base
        else{
            return mcd(b, a%b);}} // Usamos el propio Método mcd

    public static void main(String[] args) { // Main
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        int mcd= mcd(Math.max(num1, num2), Math.min(num1, num2));
        System.out.println("El MCD es: " + mcd);
        teclado.close();}}
