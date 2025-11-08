package Actividad6;

import java.util.ArrayList;

public class Empleado extends Persona{

  private TipoCargo cargo;
  private Persona creador;

  private Empleado(Persona creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, TipoCargo cargo) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo);
    this.cargo = cargo;
    this.creador = creador;
  }
  // Constructor controlado
  static Empleado crearEmpleado(Persona creador, String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, TipoCargo cargo){
    return new Empleado(creador,nombre,apellido,dni,direccion,nroTelefono,correo,cargo);
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

  public Cuenta buscarCuenta(ArrayList<ClienteCuenta> cuentas, String numeroCuenta){
    return Banco.buscarCuenta(cuentas,numeroCuenta);
  }


  public String mostrarEmpleado() {
    return super.mostrarPersona()+"Cargo: "+cargo+"\nRegistrado por: "+creador.getNombre()+" "+creador.getApellido();
  }

}
