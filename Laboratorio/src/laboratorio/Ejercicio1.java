//Laboratorio Nro 23 - Ejercicio 1
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 2:00
package laboratorio;

import java.util.*;

public class Ejercicio1 {
    
    public static ArrayList<String> convertirAArray(String cadena){ // Método convertirAArray
    	ArrayList<String> array=new ArrayList<>(); // Inicializamos nuestro array
    	for(int i=0;i<cadena.length();i++) // Bucle del tamaño de la cadena
    		array.add(cadena.substring(i,i+1)); // Sacamos cada caracter y lo añadimos al array
    	return array;} 
    public static String convertirAString(ArrayList<String> array){ // Método convertirAString
    	String cadena=""; // Inicializamos cadena
    	for(int i=0;i<array.size();i++) // Bucle tamaño del array
    		cadena+=array.get(i); // Agrega cada valor del array a la cadena
    	return cadena;}
    public static ArrayList<String> amp(ArrayList<String> adn,int ini,int fin){ // Método amp
    	ArrayList<String> copy=new ArrayList<>(adn); // Copiamos el adn 
    	ArrayList<String> duplicado=new ArrayList<>(); // Inicializamos duplicado
    	for(int i=ini;i<=fin;i++) // Bucle del tamaño que se desea
    		duplicado.add(copy.get(i)); // Agregamos cada cáracter
    	copy.addAll(ini,duplicado); // Añadimos a la copia
    	return copy;}
    public static ArrayList<String> del(ArrayList<String> adn,int ini,int fin){
    	ArrayList<String> nArray=new ArrayList<>();
    	for(int i=0;i<ini;i++)
    		nArray.add(adn.get(i));
    	for(int j=fin+1;j<adn.size();j++)
    		nArray.add(adn.get(j));
    	return nArray;}
    public static ArrayList<String> inv(ArrayList<String> adn,int ini,int fin){
    	ArrayList<String> copy=new ArrayList<>(adn);
    	ArrayList<String> invertido=new ArrayList<>();
    	for(int i=fin;ini<=i;i--) {
    		invertido.add(adn.get(i));}
    	copy=del(copy,ini,fin);
    	copy.addAll(ini,invertido);
    	return copy;}
    public static void main(String [] args) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese un ADN: ");
    	String cadena=teclado.next();
    	System.out.println(convertirAString(inv(convertirAArray(cadena),1,5)));}}


