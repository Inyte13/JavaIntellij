package Actividad6;

import java.util.ArrayList;

public class Empleado extends Persona{
  private String cargo;

  public Empleado(String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, String cargo) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo);
    this.cargo = cargo;
  }

  public Cliente registrarClientes(Banco banco,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    Cliente cliente=Cliente.crearCliente(this,nombre,apellido,dni, direccion, nroTelefono,correo);
    banco.agregarCliente(cliente);
    return cliente;
  }
  public ClienteCuenta registrarCuenta(Cliente cliente,TipoCuenta tipoCuenta){
    return ClienteCuenta.crearClienteCuenta(this,cliente,Cuenta.crearCuenta(tipoCuenta));
  }
  public ClienteCuenta registrarCuenta(Cliente cliente,TipoCuenta tipoCuenta,double saldo){
    return ClienteCuenta.crearClienteCuenta(this,cliente,Cuenta.crearCuenta(tipoCuenta,saldo));
  }
  public ClienteCuenta vincularClienteACuenta(Cliente solicitante, Cliente nuevoTitular, String numeroCuenta){
    Cuenta cuentaSolicitante=buscarCuenta(solicitante.getClienteCuentas(),numeroCuenta);
    Cuenta cuentaNuevoTitular=buscarCuenta(nuevoTitular.getClienteCuentas(),numeroCuenta);
    if(verificarCuenta(cuentaSolicitante)&&!verificarCuenta(cuentaNuevoTitular)){
      return ClienteCuenta.crearClienteCuenta(this,nuevoTitular,cuentaSolicitante);
    }
    return null;
  }
  public Cuenta buscarCuenta(ArrayList<ClienteCuenta> cuentas, String numeroCuenta){
    for(ClienteCuenta clienteCuenta:cuentas){
      if(clienteCuenta.getCuenta().getNumeroCuenta().equals(numeroCuenta)){
        return clienteCuenta.getCuenta();
      }
    }
    return null;
  }
  private boolean verificarCuenta(Cuenta cuenta){
    return cuenta!=null;
  }

  public String mostrarEmpleado() {
    return super.mostrarPersona()+"Cargo: "+cargo;
  }

}
