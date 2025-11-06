package Actividad6;

public abstract class Persona {
  private String nombre;
  private String apellido;
  private String dni;
  private String direccion;
  private String nroTelefono;
  private String idPersona;
  private String correo;
  private static int count=0;

  public Persona(String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.direccion = direccion;
    this.nroTelefono = nroTelefono;
    count++;
    this.idPersona = "Id-"+count;
    this.correo = correo;
  }
  private Persona buscar(){
    return null;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String mostrarPersona() {
    return "-------------------\n" +
        "Nombre: "+nombre+"\n" +
        "Apellido: "+apellido+"\n" +
        "DNI: "+dni+"\n" +
        "Direccion: "+direccion+"\n" +
        "Número de teléfono: "+nroTelefono+"\n" +
        "ID: "+idPersona+"\n" +
        "Correo: "+correo+"\n";
  }
}
