package Actividad6;

import java.util.ArrayList;

public class Administrador extends Persona{

  private Administrador creador;

  private Administrador(Administrador creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, String contrasena) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo, contrasena);
    this.creador = creador;
  }

  // El super admin
  static Administrador registrarSuperAdmin(Banco banco,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, String contrasena){
    Administrador admin=new Administrador(null, nombre, apellido, dni, direccion, nroTelefono, correo, contrasena);
    banco.agregarAdmin(admin);
    return admin;
  }

  // Constructor controlado
  private static Administrador crearAdmin(Administrador creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, String contrasena){
    return new Administrador(creador,nombre,apellido,dni,direccion,nroTelefono,correo,contrasena);
  }

  public Administrador registrarAdmin(Banco banco,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo,String contrasena){
    Administrador admin=Administrador.crearAdmin(this,nombre,apellido,dni,direccion,nroTelefono,correo,contrasena);
    banco.agregarAdmin(admin);
    return admin;
  }


  public Empleado registrarEmpleado(String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, TipoCargo cargo,String contrasena){
   return Banco.registrarEmpleado(this,nombre,apellido,dni,direccion,nroTelefono,correo,cargo,contrasena);
  }

  public Cliente registrarCliente(String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo,String contrasena){
    return Banco.registrarCliente(this,nombre,apellido,dni,direccion,nroTelefono,correo,contrasena);
  }

  public Cuenta registrarCuenta(Cliente cliente,TipoCuenta tipoCuenta){
    return Banco.registrarCuenta(this,cliente,tipoCuenta);
  }

  public Cuenta registrarCuenta(Cliente cliente,TipoCuenta tipoCuenta,double saldo){
    return Banco.registrarCuenta(this,cliente,tipoCuenta,saldo);
  }

  public ClienteCuenta vincularClienteACuenta(Cliente solicitante, Cliente nuevoTitular, String numeroCuenta){
    return Banco.vincularClienteACuenta(this,solicitante,nuevoTitular,numeroCuenta);
  }







  public Cuenta buscarCuenta(ArrayList<ClienteCuenta> cuentas, String numeroCuenta){
    return Banco.buscarCuenta(cuentas,numeroCuenta);
  }

  public Administrador getCreador() {
    return creador;
  }

  public String mostrarAdmin(){
    String infoCreador=(creador==null) ? "SuperAdmin (sin creador)" : creador.getNombre()+" "+creador.getApellido();
    return super.mostrarPersona()+"Registrado por: "+infoCreador;
  }


}
