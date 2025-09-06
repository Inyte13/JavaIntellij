package teoria;

public class _String_ {
	public static void main(String[] args) {
		String str="Hola";
		str.charAt(3); // Devuelve el caracter de la posición 3 (a)
		str.substring(0,2); // Devuelve un substring desde [0,2> (Ho)
		str.indexOf("i"); // Devuelve la posición en la que encontro "a" sino devuelve -1 (3) 
		str.length(); // Devuelve el tamaño del string (4)
		str.replace("a", ""); // Remplaza todas las "a" y las cambia por ""
		str.toLowerCase(); // Minúsculas
		System.out.println(str); // Verífica si cumple el patrón (true)
}}
