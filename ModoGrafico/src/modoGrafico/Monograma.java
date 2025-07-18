package modoGrafico;

import javax.swing.*;

public class Monograma {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog(null,"Cuál es tu nombre: "); // Guardamos en name
		String pri=name.substring(0,1); // .substring [0,1) 
		char ult=name.charAt(name.length()-1); // .charAt(length-1)
		int lugarA=name.indexOf("a"); // Lugar de la primera "a" que encuentre
		JOptionPane.showMessageDialog(null, pri+ult+lugarA);}}
