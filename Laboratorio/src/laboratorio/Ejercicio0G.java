//Laboratorio Nro 9 - Ejercicio4
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 1:30
package laboratorio;

import javax.swing.JOptionPane;

public class Ejercicio0G {
	public static void main(String[] args) {
		//El usuario ingresa los datos
		String a=JOptionPane.showInputDialog(null,"Ingrese un rango a:");
		String b=JOptionPane.showInputDialog(null,"Ingrese un rango b:");
		//Convertimos String a Double
		int aI=Integer.parseInt(a);
		int bI=Integer.parseInt(b);
		//Operamos
		int x1=(int)(Math.random()*(bI-aI+1))+aI;
		int y1=(int)(Math.random()*(bI-aI+1))+aI;
		int x2=(int)(Math.random()*(bI-aI+1))+aI;
		int y2=(int)(Math.random()*(bI-aI+1))+aI;	
		String coordenadas="("+x1+","+y1+") y"+"("+x2+","+y2+")";
		String triangulo1="("+x1+","+y1+"), "+"("+x2+","+y2+"), "+"("+x2+","+y1+")";
		String triangulo2="("+x1+","+y1+"), "+"("+x2+","+y2+"), "+"("+x1+","+y2+")";
		int base=Math.abs(y2-y1);
		int altura=Math.abs(x2-x1);
		double diagonal=Math.round((Math.sqrt(base*base+altura*altura))*10)/10.0;
		double area=Math.abs(base*altura/2);
		//Mostramos la respuesta
		JOptionPane.showMessageDialog(null,"Los puntos generados: "+coordenadas+
											"\n1er triángulo rectángulo: "+triangulo1+
											"\n2do triángulo rectángulo: "+triangulo2+
											"\nLa base es: "+base+
											"\nLa altura es: "+altura+
											"\nLa hipotenusa es: "+diagonal+
											"\nEl área es: "+area);}}
