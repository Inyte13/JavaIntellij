package teoria;

import java.util.Stack;

public class _Stack_ {
	public static void main(String[] args) {
        Stack<String> pila=new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        System.out.println(pila); // [A, B, C]
        System.out.println(pila.peek()); // C
        System.out.println(pila.pop()); // Elimina el último elemento en este caso C
        System.out.println(pila.isEmpty()); // La pila está vacía? (false)
        pila.push("D");
        System.out.println(pila.size()); // El tamaño de la pila (3)
        System.out.println(pila.search("D")); // Lo busca desde el final (1) si no lo encuentra (-1)
    }

}
