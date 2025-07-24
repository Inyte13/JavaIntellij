package teoria;

import java.util.*;

public class _Map_ {
	public static void main(String[] args) {
        Map<String, Integer> edades=new HashMap<>();
        edades.put("Luis", 18); // (key, value)
        edades.put("Ana", 17); // (key, value)
        edades.put("Pedro", 74); // (key, value)
        System.out.println(edades.get("Ana")); // Saca el valor del Map (17)
        System.out.println(edades.containsKey("Luis")); // Tiene la key Luis? (true)
        System.out.println(edades.containsValue(18)); // Tiene el value 18? (true)
        System.out.println(edades.isEmpty()); // Está vacío? (false)
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey()+" - "+entrada.getValue());}
        edades.remove("Pedro");
        System.out.println(edades); 
        for(Map.Entry<String, Integer> e:edades.entrySet()) { // Recorrer el Map
        	System.out.println(e.getKey()+" - "+e.getValue());}}}
