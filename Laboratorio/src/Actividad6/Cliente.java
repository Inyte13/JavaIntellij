package Actividad6;

import java.util.ArrayList;

public class Cliente extends Persona{

  private ArrayList<ClienteCuenta> clienteCuentas;

  private Empleado creador;

  private Cliente(Empleado empleado,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo);
    this.clienteCuentas = new ArrayList<>();
    this.creador=empleado;
  }

  static Cliente crearCliente(Empleado empleado, String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    return new Cliente(empleado,nombre,apellido, dni, direccion, nroTelefono, correo);
  }

  public ClienteCuenta registrarClienteCuenta(TipoCuenta tipoCuenta){
    return ClienteCuenta.crearClienteCuenta(this,tipoCuenta);
  }

  public ArrayList<ClienteCuenta> getClienteCuentas() {
    return clienteCuentas;
  }
  public void mostrarCuentas(){
    for(ClienteCuenta cc:clienteCuentas){
      System.out.println(cc.getCuenta().mostrarCuenta());
    }
  }
  public String mostrarCliente() {
    return super.mostrarPersona()+"Registrado por: "+ creador.getNombre()+" "+creador.getApellido();
  }

}
