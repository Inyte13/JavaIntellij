package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Tokenizador {
	
	public static List<String> tokenizar(String str){
		List<String> tokens=new ArrayList<>();
		StringBuilder temp=new StringBuilder(); // 
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i); // Recorremos el String input
			if(Character.isDigit(c)||c=='.') { // Si es un dígito o un punto
				temp.append(c);} // Agregamos a "temp"
			else if("+-*/()".indexOf(c)>=0) { // Si es cualquiera de estos "+, -, *, /, (, )" 
				if(temp.length()>0) { // Si "temp" tiene dígitos o puntos
					tokens.add(temp.toString()); // Agregamos todo lo anterior a tokens
					temp.setLength(0);} // Y limpiamos el String "temp"
				tokens.add(Character.toString(c));} // Agregamos "+, -, *, /, (, )" a tokens
			else if(Character.isWhitespace(c)) { // Si es un espacio " "
				if(temp.length()>0) { // Si "temp" tiene dígitos o puntos
					tokens.add(temp.toString()); // Agregamos todo lo anterior a tokens
					temp.setLength(0);}} // Y limpiamos el String "temp"
				else {
					throw new IllegalArgumentException("Carácter no válido: "+c);}}
		if(temp.length()>0) { // Si "temp" tiene dígitos y puntos residuales (porque no hubo ningun "+, -, *, /, (, )"
			//o un espacio
			tokens.add(temp.toString());} // Los agrega a tokens
		return tokens;} 
	
	public static void main(String[] args) {
		List<String> tokens=tokenizar("4*3+(2+1.5)");
		System.out.println("Tokens: ");
		for(String token : tokens) {
			System.out.println(token);}}}
