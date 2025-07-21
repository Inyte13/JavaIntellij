package ids;

import java.util.Scanner;

public class Alumno {
	double promedio; // Declaramos nuestros atributos
	String nombre, apellido; 
	public Alumno() {} // Constructor vacío para después asignarle parámetros
	public Alumno(double promedio, String nombre, String apellido) { // Constructor alt+shift+s
		this.promedio = promedio; // El promedio local es igual ahora al promedio local
		this.nombre = nombre;
		this.apellido = apellido;}
	public double getPromedio() { // Getters - Saco
		return promedio;} 
	public String getNombre() {
		return nombre;}
	public String getApellido() {
		return apellido;}
	public void setPromedio(double promedio) { // Setters - Asigno
		this.promedio = promedio;} 
	public void setNombre(String nombre) {
		this.nombre = nombre;}
	public void setApellido(String apellido) {
		this.apellido = apellido;}
	public String toString() {
		return apellido+", "+nombre+" = "+promedio;}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Alumno al1=new Alumno(); // Creamos nuestro objeto vacío
		System.out.print("Ingrese el nombre: ");
        al1.setNombre(teclado.nextLine());
        System.out.print("Ingrese el apellido: ");
        al1.setApellido(teclado.nextLine());
        System.out.print("Ingrese el promedio: ");
        al1.setPromedio(teclado.nextDouble());
        System.out.println("Datos del alumno:");
        System.out.println(al1.toString());
        teclado.close();}}
	
