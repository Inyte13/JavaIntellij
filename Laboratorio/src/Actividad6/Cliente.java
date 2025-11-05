package Actividad6;

import java.util.ArrayList;

public class Cliente extends Persona{
  private ArrayList<Cuenta> cuentas;

  public Cliente(String nombre, String apellido, String dni, String direccion, String nroTelefono, String idPersona, String correo, ArrayList<Cuenta> cuentas) {
    super(nombre, apellido, dni, direccion, nroTelefono, idPersona, correo);
    this.cuentas = cuentas;
  }
  private ArrayList<Cuenta> mostrarCuentas(){

  }
}
