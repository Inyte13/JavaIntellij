package teoria;

import java.util.*;

public class _Map_ {
	public static void main(String[] args) {
    HashMap<Integer,String> alumnos=new HashMap<>();
    alumnos.put(1,"Mafer");
    alumnos.put(2,"Luis");
    alumnos.put(3,"Lucia");
    alumnos.get(1); // Devuleve el value de la key 1
    alumnos.containsKey(5); // Existe la key 5?
    alumnos.containsValue("Aitana"); // Existe el value Aitana?
    alumnos.isEmpty(); // El HashMap está vacío?
    for(Map.Entry<Integer,String> e: alumnos.entrySet()){
      System.out.println(e.getKey()+"-"+e.getValue());
    }
    alumnos.remove(3); // Al eliminar, solo puede ir la key
    alumnos.remove(2,"Luis"); // Solo elimina si existe una key 2 con el value "Mafer", si es así devuelve true
    System.out.println(alumnos);
  }
}
