package posnet;

public class Persona {
  private String dni;
  private String nombre;
  private String apellido;
  private String telefono;
  private String correo;

  public Persona(String dni, String nombre, String apellido, String telefono, String correo) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
    this.correo = correo;
  }
}
