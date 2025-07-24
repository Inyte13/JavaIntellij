package strings;

public class _StringBuilder_ {
	public static void main(String[] args) {
		StringBuilder stringEdit=new StringBuilder();
		stringEdit.append("StrO"); // Agrega a "stringEdit" (Strg)
		stringEdit.insert(3, "ingElimina"); // Inserta en la posición 3 (StringEliminaO)
		stringEdit.delete(6, stringEdit.length()); // Elimina (String)
		stringEdit.setLength(0); // Limpia todo
		System.out.println(stringEdit.toString()); // Para mostrar "stringEdit"
	}

}
