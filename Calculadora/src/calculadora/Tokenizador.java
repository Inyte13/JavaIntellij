package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Tokenizador {
	
	public static List<String> tokenizar(String str){
		List<String> tokens=new ArrayList<>();
		StringBuilder numero=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char temp=str.charAt(i); // Recorremos el String input
			if(Character.isDigit(temp)||temp=='.') { // Si es un dígito o un punto
				numero.append(temp);} // Agregamos a "numero"
			else if("+-*/()".indexOf(temp)>=0) { // Si es cualquiera de estos "+, -, *, /, (, )" 
				if(numero.length()>0) { 
					tokens.add(numero.toString());
					numero.setLength(0);}
				tokens.add(Character.toString(temp));} 
			else if(Character.isWhitespace(temp)) {
				if(numero.length()>0) {
					tokens.add(numero.toString());
					numero.setLength(0);}}
				else {
					throw new IllegalArgumentException("Carácter no válido: "+temp);}}
		if(numero.length()>0) {
			tokens.add(numero.toString());}
		return tokens;}
	
	public static void main(String[] args) {
		String expresion="4*3+(2+1.5)";
		List<String> tokens=tokenizar(expresion);
		System.out.println("Tokens: ");
		for(String token : tokens) {
			System.out.println(token);}}}
