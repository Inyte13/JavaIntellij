package Actividad6;

public class Administrador extends Persona{
  public Administrador(String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo);
  }
  public Empleado registrarEmpleado(Banco banco, Administrador admin,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo,String cargo){
    Empleado empleado=Empleado.crearEmpleado(this,nombre,apellido,dni,direccion,nroTelefono,correo,cargo);
    banco.agregarEmpleado(empleado);
    return empleado;
  }

}
