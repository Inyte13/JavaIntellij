//Laboratorio Nro 9 - Ejercicio8
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 1:30
package laboratorio;

import javax.swing.JOptionPane;

public class Ejercicio_3 {
	public static void main(String[] args) {
		//El usuario ingresa los datos
		String texto=JOptionPane.showInputDialog(null,"Ingrese #x2+#x+#=0");//1x2+0x+-3=0
		//Dividimos el string
		int posx1=texto.indexOf("x",0);
		int posmas1=texto.indexOf("+",0);
		int posx2=texto.indexOf("x",posx1+1);
		int posmas2=texto.indexOf("+",posx2+1);
		int posigual=texto.indexOf("=",0);
		String num1=texto.substring(0,posx1);
		String num2=texto.substring(posmas1+1,posx2);
		String num3=texto.substring(posmas2+1,posigual);
		//Convertimos String a Integer
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		int c=Integer.parseInt(num3);
		double raiz1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		double raiz2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
		//Mostramos la respuesta
		JOptionPane.showMessageDialog(null,"Las raices son: "+raiz1+", "+raiz2);}}
