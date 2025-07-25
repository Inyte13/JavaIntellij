package calculadora;

import java.util.*;

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
	
	private static final Map<String, Integer> precedencia = Map.of("+", 1,"-", 1,"*", 2,"/", 2); // Definimos el orden 
	// de importancia de los "+, -, *, /,"
	
	private static boolean esNumero(String str) {
		return str.matches("\\d+(\\.\\d+)?");} // Si es un número positivo válido retorna true
	
	private static boolean esOperador(String str) {
		return "+-*/".contains(str);} // Si hay "+, -, *, /" lo retorna true
	
    public static List<String> convertirAPostfija(List<String> tokens) {
        List<String> salida=new ArrayList<>();
        Stack<String> operadores=new Stack<>();
        for (String c:tokens) {
            if (esNumero(c)) {
                salida.add(c);} // Números van directo a la salida
            else if (esOperador(c)) {
                // Mientras haya operadores con mayor o igual precedencia en la pila
                while (!operadores.isEmpty()&&esOperador(operadores.peek())&&
                        precedencia.get(c) <= precedencia.get(operadores.peek())) {
                    salida.add(operadores.pop());}
                operadores.push(c); // Agregar el nuevo operador a la pila
            } else if (c.equals("(")) {
                operadores.push(c);
            } else if (c.equals(")")) {
                // Sacar operadores hasta encontrar el paréntesis izquierdo
                while (!operadores.isEmpty() && !operadores.peek().equals("(")) {
                    salida.add(operadores.pop());
                }
                operadores.pop(); // quitar el paréntesis izquierdo
            }
        }

        // Agregar cualquier operador que quede en la pila
        while (!operadores.isEmpty()) {
            salida.add(operadores.pop());
        }

        return salida;
    }

	
	public static void main(String[] args) {
		List<String> tokens=tokenizar("4*3+(2+1.5)");
		System.out.println("Tokens: ");
		for(String c : tokens) {
			System.out.println(c);}}}
