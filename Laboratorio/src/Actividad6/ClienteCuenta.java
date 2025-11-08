package Actividad6;

public class ClienteCuenta {
  private Cliente cliente;
  private Cuenta cuenta;

  private ClienteCuenta(Cliente cliente, Cuenta cuenta) {
    this.cliente = cliente;
    this.cuenta = cuenta;
  }
  static ClienteCuenta crearClienteCuenta(Persona creador,Cliente cliente, TipoCuenta tipoCuenta){
    Cuenta nuevaCuenta=Cuenta.crearCuenta(tipoCuenta);
    ClienteCuenta clienteCuenta=new ClienteCuenta(cliente,nuevaCuenta);
    cliente.getClienteCuentas().add(clienteCuenta);
    nuevaCuenta.getClienteCuentas().add(clienteCuenta);
    return clienteCuenta;
  }
  public Cuenta getCuenta() {
    return cuenta;
  }

  public Cliente getCliente() {
    return cliente;
  }
}
