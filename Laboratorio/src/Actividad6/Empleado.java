package Actividad6;

import java.util.ArrayList;

public class Empleado extends Persona implements Submenu{

  private TipoCargo cargo;
  private Persona creador;

  private Empleado(Persona creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, TipoCargo cargo,String contrasena) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo,contrasena);
    this.cargo = cargo;
    this.creador = creador;
  }
  // Constructor controlado
  static Empleado crearEmpleado(Persona creador, String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, TipoCargo cargo,String contrasena){
    return new Empleado(creador,nombre,apellido,dni,direccion,nroTelefono,correo,cargo,contrasena);
  }

  @Override
  public void submenu(Banco banco, Menu menu,Persona persona) {

  }

  public Cliente registrarCliente(Banco banco, String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, String contrasena){
    return banco.registrarCliente(this,nombre,apellido,dni,direccion,nroTelefono,correo,contrasena);
  }

  public Cuenta registrarCuenta(Banco banco,Cliente cliente,TipoCuenta tipoCuenta){
    return banco.registrarCuenta(this,cliente,tipoCuenta);
  }

  public Cuenta registrarCuenta(Banco banco,Cliente cliente,TipoCuenta tipoCuenta,double saldo){
    return banco.registrarCuenta(this,cliente,tipoCuenta,saldo);
  }

//  public ClienteCuenta vincularClienteACuenta(Banco banco,Cliente solicitante, Cliente nuevoTitular, String numeroCuenta){
//    return banco.vincularClienteACuenta(this,solicitante,nuevoTitular,numeroCuenta);
//  }
//
//  public Cuenta buscarCuenta(Banco banco,ArrayList<ClienteCuenta> cuentas, String numeroCuenta){
//    return banco.buscarCuentaPorCliente(cuentas,numeroCuenta);
//  }


  public String mostrarEmpleado() {
    return super.mostrarPersona()+"Cargo: "+cargo+"\nRegistrado por: "+creador.getNombre()+" "+creador.getApellido();
  }

}
