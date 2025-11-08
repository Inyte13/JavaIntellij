package Actividad6;

import java.util.ArrayList;

public class Cliente extends Persona{

  private Persona creador;
  private ArrayList<ClienteCuenta> clienteCuentas;

  private Cliente(Persona creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo) {
    super(nombre, apellido, dni, direccion, nroTelefono, correo);
    this.creador=creador;
    this.clienteCuentas = new ArrayList<>();
  }
  // Un método static se puede usar sin crear un objeto
  static Cliente crearCliente(Persona creador, String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    return new Cliente(creador,nombre,apellido, dni, direccion, nroTelefono, correo);
  }

  public ClienteCuenta registrarClienteCuenta(TipoCuenta tipoCuenta){
    return ClienteCuenta.crearClienteCuenta(this,this,tipoCuenta);
  }

  public ArrayList<ClienteCuenta> getClienteCuentas() {
    return clienteCuentas;
  }
  public void mostrarCuentas(){
    for(ClienteCuenta cc:clienteCuentas){
      System.out.println(cc.getCuenta().mostrarCuenta());
    }
  }

  public Cuenta buscarCuenta(String numeroCuenta){
    return Banco.buscarCuenta(this.clienteCuentas,numeroCuenta);
  }

  public String mostrarCliente() {
    return super.mostrarPersona()+"Registrado por: "+ creador.getNombre()+" "+creador.getApellido();
  }

}
