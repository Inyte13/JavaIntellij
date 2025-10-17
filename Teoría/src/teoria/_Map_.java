package teoria;

import java.util.*;

public class _Map_ {
  public static void main(String[] args) {
    Map<String, Integer> edades = new HashMap<>();
    edades.put("Luis", 18); // (key, value)
    edades.put("Ana", 17); // (key, value)
    edades.put("Pedro", 74); // (key, value)
    edades.get("Ana"); // Saca el valor del Map (17)
    edades.containsKey("Luis"); // Tiene la key Luis? (true)
    edades.containsValue(18); // Tiene el value 18? (true)
    edades.isEmpty(); // Está vacío? (false)
    for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
      System.out.println(entrada.getKey() + " - " + entrada.getValue());
    }
    edades.remove("Pedro");
    System.out.println(edades);
    for (Map.Entry<String, Integer> e : edades.entrySet()) { // Recorrer el Map
      System.out.println(e.getKey() + " - " + e.getValue());
    }
    HashMap<Integer, String> alumnos = new HashMap<>();
    alumnos.put(1, "Mafer");
    alumnos.put(2, "Luis");
    alumnos.put(3, "Lucia");
    alumnos.get(1); // Devuleve el value de la key 1
    alumnos.containsKey(5); // Existe la key 5?
    alumnos.containsValue("Aitana"); // Existe el value Aitana?
    alumnos.isEmpty(); // El HashMap está vacío?
    for (Map.Entry<Integer, String> e : alumnos.entrySet()) {
      System.out.println(e.getKey() + "-" + e.getValue());
    }
    alumnos.remove(3); // Al eliminar, solo puede ir la key
    alumnos.remove(2, "Luis"); // Solo elimina si existe una key 2 con el value "Mafer", si es así devuelve true
    System.out.println(alumnos);
  }
}
