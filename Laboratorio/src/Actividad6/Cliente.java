package Actividad6;

import java.util.ArrayList;

public class Cliente extends Persona implements Submenu{

  private Persona creador;
  private ArrayList<ClienteCuenta> clienteCuentas;

  private Cliente(Persona creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo,String contrasena) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo,contrasena);
    this.creador=creador;
    this.clienteCuentas = new ArrayList<>();
  }

  static Cliente crearCliente(Persona creador, String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo,String contrasena){
    return new Cliente(creador,nombre,apellido, dni, direccion, nroTelefono, correo,contrasena);
  }

  @Override
  public void submenu(Banco banco, Menu menu,Persona persona) {

  }

  public Cuenta registrarCuenta(Banco banco, TipoCuenta tipoCuenta){
    return banco.registrarCuenta(this,this,tipoCuenta);
  }

  public void mostrarCuentas(){
    for(ClienteCuenta cc:clienteCuentas){
      System.out.println(cc.getCuenta().mostrarCuenta());
    }
  }

  public Cuenta buscarCuenta(String nroCuenta){
    Cuenta cuentaBuscada;
    for (ClienteCuenta clienteCuenta : clienteCuentas) {
      cuentaBuscada=clienteCuenta.getCuenta();
      if(cuentaBuscada.getNumeroCuenta().equals(nroCuenta)){
        return cuentaBuscada;
      }
    }
    return null;
  }

  public String mostrarCliente() {
    return super.mostrarPersona()+"Registrado por: "+ creador.getNombre()+" "+creador.getApellido();
  }

  public ArrayList<ClienteCuenta> getClienteCuentas() {
    return clienteCuentas;
  }
}
