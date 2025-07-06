package strings;

public class Strings {
	public static void main(String[] args) {
		String palabra="Hola";
		char unaLetra=palabra.charAt(3); // unaLetra=a (la posicion 3)
		String subPalabra=palabra.substring(0,2); // subPalabra=Ho (funciona [0, 2})
		int posicion=palabra.indexOf("a"); // posicion=3 (la ubicación de a)
		int tamaño=palabra.length(); // tamaño=4 (3-0 +1)
	}
	public String fizzString(String str) {
		  String vacio="";
		  if(str.charAt(0)=='f') return vacio+"Fizz";
		  if(str.charAt(str.length())=='b')return vacio+"Buzz";
		  return str;
		  }
}
