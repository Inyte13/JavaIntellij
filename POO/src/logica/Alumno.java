package logica;
//Class: First with a capital letter
public class Alumno {
	
	//Attributes: Lower case
	int id;
	String nombre;
	String apellido;
	
	//Methods/Function: Camel case
	public void mostrarNombre() {
		System.out.println("Hola, soy un alumno y mi nombre es ");}

	//Constructor methods/function: Object creation "alt+shift+s"
	//Empty
	public Alumno() {}
	//With attributes
	public Alumno(int id, String nombre, String apellido) {
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
