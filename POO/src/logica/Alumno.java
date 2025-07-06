package logica;

public class Alumno { // Clases: La primera en mayúscula y en singular
	
	// Atributos: Minúsculas
	int id;
	String nombre, apellido;
	
	// Métodos/Funciones: Camel case y en infinitivo
	public void mostrarNombre() {
		System.out.println("Hola, mi nombre es ");}

	//Constructor métodos/funciones: Creación de objetos "alt+shift+s"
	
	public Alumno() {} // Empty
	
	public Alumno(int id, String nombre, String apellido) { // With attributes
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;}
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
	
	
	
	
	

}
