package teoria;

import javax.swing.JOptionPane;

public class Wrapperclasses {
	public static void main(String[] args) {
		//It's always a string
		String num=JOptionPane.showInputDialog(null, "Ingrese el número:");
		//We convert it to an double
		double nume=Double.parseDouble(num);
		//int nume=Integer.parseInt(num);
		System.out.println(nume);}}
