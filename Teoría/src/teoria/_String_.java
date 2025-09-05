package teoria;

public class _String_ {
	public static void main(String[] args) {
		String palabra="Hola";
		char c=palabra.charAt(3); // Devuelve el caracter de la posición 3 (a)
		String str=palabra.substring(0,2); // Devuelve un substring desde [0,2> (Ho)
		int posicion=palabra.indexOf("i"); // Devuelve la posición en la que encontro "a" sino devuelve -1 (3) 
		int size=palabra.length(); // Devuelve el tamaño del string (4)
		System.out.println(palabra.matches("Hola")); // Verífica si cumple el patrón (true)
}}
