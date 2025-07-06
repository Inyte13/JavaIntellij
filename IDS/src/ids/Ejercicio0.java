package ids;

public class Ejercicio0 {
	public static void main(String[] args) {
        for (int x=5;x<=25;x+=5) // Se muestra la 1ra fila 
            	System.out.print("\t"+x);
        System.out.println(); // Salto a la siguiente linea
        for (int y=11;y<=20;y++) {
        	System.out.print(y); // Imprimo el primer valor en la 2da fila
        	for(int x=5;x<=25;x+=5) {
        		int producto=x*y*19;
            	System.out.print("\t"+producto);} // Imprimo los siguientes valores
        	System.out.println(); // Salto de linea
        	}}}
