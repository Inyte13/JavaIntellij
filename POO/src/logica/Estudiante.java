package logica;

public class Estudiante { // Clases: La primera en mayúscula y en singular
	
	// Atributos: Minúsculas
	int id;
	String nombre, apellido;
	
	// Métodos/Funciones: Camel case y en infinitivo
	public void mostrarNombre() {
		System.out.println("Hola, mi nombre es ");}

	//Constructor métodos/funciones: Creación de objetos "alt+shift+s"
	
	public Estudiante() {} // Constructor vacío
	
	public Estudiante(int id, String nombre, String apellido) { // Constructor con atributos
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;}
	
	//Getter & Setter
	public int getId() {
		return id;}

	public void setId(int id) {
		this.id = id;}

	public String getNombre() {
		return nombre;}

	public void setNombre(String nombre) {
		this.nombre = nombre;}

	public String getApellido() {
		return apellido;}

	public void setApellido(String apellido) {
		this.apellido = apellido;}
	
public static void main(String[] args) {
		
		Estudiante a1=new Estudiante(4,"Luis","García"); // Introduzca variables definidas en Estudiante.java (constructor)
		System.out.println("El id es "+a1.getId());
		System.out.println("El nombre es "+a1.getNombre());
		System.out.println("El apellido es "+a1.getApellido());
		
		Estudiante a2=new Estudiante(); // Objeto vacío
		a2.setId(3); // Le asigno un Id
		a2.setNombre("Italia"); // Le asigno un Nombre
		a2.setApellido("Paula"); // Le asigno un Apellido
		System.out.println("El id es "+a2.getId());
		System.out.println("El nombre es "+a2.getNombre());
		System.out.println("El apellido es "+a2.getApellido());
		
		a1.setId(13); // Con set puedo modificar el valor original
		System.out.println("El id es "+a1.getId());
		System.out.println("El nombre es "+a1.getNombre());
		System.out.println("El apellido es "+a1.getApellido());}}

