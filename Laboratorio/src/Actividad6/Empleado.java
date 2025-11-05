package Actividad6;

public class Empleado extends Persona{
  private String cargo;

  public Empleado(String nombre, String apellido, String dni, String direccion, String nroTelefono, String idPersona, String correo, String cargo) {
    super(nombre, apellido, dni, direccion, nroTelefono, idPersona, correo);
    this.cargo = cargo;
  }
  private Cliente registrarClientes(){

  }
  private Cuenta registrarCuenta(){

  }
}
