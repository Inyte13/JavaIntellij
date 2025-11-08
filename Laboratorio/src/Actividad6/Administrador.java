package Actividad6;

import java.util.ArrayList;

public class Administrador extends Persona{

  private Administrador creador;

  private Administrador(Administrador creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo);
    this.creador = creador;
  }
  // Constructor controlado
  static Administrador crearAdmin(Administrador creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    return new Administrador(creador,nombre,apellido,dni,direccion,nroTelefono,correo);
  }


  public Empleado registrarEmpleado(String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, TipoCargo cargo){
   return Banco.registrarEmpleado(this,nombre,apellido,dni,direccion,nroTelefono,correo,cargo);
  }

  public Cliente registrarClientes(String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    return Banco.registrarClientes(this,nombre,apellido,dni,direccion,nroTelefono,correo);
  }

  public ClienteCuenta registrarClienteCuenta(Cliente cliente,TipoCuenta tipoCuenta){
    return Banco.registrarClienteCuenta(this,cliente,tipoCuenta);
  }

  public ClienteCuenta registrarClienteCuenta(Cliente cliente,TipoCuenta tipoCuenta,double saldo){
    return Banco.registrarClienteCuenta(this,cliente,tipoCuenta,saldo);
  }

  public ClienteCuenta vincularClienteACuenta(Cliente solicitante, Cliente nuevoTitular, String numeroCuenta){
    return Banco.vincularClienteACuenta(this,solicitante,nuevoTitular,numeroCuenta);
  }


  // El super admin
  static Administrador crearSuperAdmin(String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    return new Administrador(null, nombre, apellido, dni, direccion, nroTelefono, correo);
  }


  public Administrador registrarAdmin(Banco banco,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    Administrador admin=Administrador.crearAdmin(this,nombre,apellido,dni,direccion,nroTelefono,correo);
    banco.agregarAdmin(admin);
    return admin;
  }
  static Administrador registrarSuperAdmin(Banco banco,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    Administrador admin=Administrador.crearSuperAdmin(nombre,apellido,dni,direccion,nroTelefono,correo);
    banco.agregarAdmin(admin);
    return admin;
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
