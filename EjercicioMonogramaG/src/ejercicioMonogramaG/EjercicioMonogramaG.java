package ejercicioMonogramaG;

import javax.swing.JOptionPane;

public class EjercicioMonogramaG {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog(null,"Cuál es tu nombre?");
		String primera=name.substring(0,1);
		String ultima=name.substring(name.length()-1);
		int lugara=name.indexOf("a");
		String monograma=primera+ultima+lugara;
		JOptionPane.showMessageDialog(null, monograma);}}
