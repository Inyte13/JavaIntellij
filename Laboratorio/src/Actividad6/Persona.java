package Actividad6;

public abstract class Persona {
  private String nombre;
  private String apellido;
  private String dni;
  private String direccion;
  private String nroTelefono;
  private String idPersona;
  private String correo;

  public Persona(String nombre, String apellido, String dni, String direccion, String nroTelefono, String idPersona, String correo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.direccion = direccion;
    this.nroTelefono = nroTelefono;
    this.idPersona = idPersona;
    this.correo = correo;
  }
  private Cliente buscar(){
    return Cliente;
  }
  private void mostrarDatos(){

  }
}
