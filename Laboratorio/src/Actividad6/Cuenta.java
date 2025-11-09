package Actividad6;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cuenta {
  private TipoCuenta tipoCuenta;
  private double saldo;
  private String numeroCuenta;
  private LocalDateTime fechaApertura;
  private ArrayList<Transaccion> transacciones;
  private ArrayList<ClienteCuenta> clienteCuentas;
  private Persona creador;
  private static int count=1;

  private String generarNumeroCuenta(){
    return String.format("%06d",count++);
  }
  private Cuenta(Persona creador,TipoCuenta tipoCuenta, double saldo) {
    this.tipoCuenta = tipoCuenta;
    this.saldo = saldo;
    this.numeroCuenta = generarNumeroCuenta();
    this.fechaApertura = LocalDateTime.now();
    this.transacciones = new ArrayList<>();
    this.clienteCuentas = new ArrayList<>();
    this.creador=creador;
  }
  private Cuenta(Persona creador,TipoCuenta tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
    this.saldo = 0.0;
    this.numeroCuenta = generarNumeroCuenta();
    this.fechaApertura = LocalDateTime.now();
    this.transacciones = new ArrayList<>();
    this.clienteCuentas = new ArrayList<>();
    this.creador=creador;
  }


  static Cuenta crearCuenta(Persona creador,TipoCuenta tipoCuenta){
    return new Cuenta(creador,tipoCuenta);
  }
  static Cuenta crearCuenta(Persona creador,TipoCuenta tipoCuenta, double saldo){
    return new Cuenta(creador,tipoCuenta,saldo);
  }

  public Transaccion retirar(Persona creador,double monto){
    if (monto <= 0 || monto > saldo){
      return null;
    }
    saldo -= monto;
    Transaccion transaccion=Transaccion.crearTransaccion(creador,TipoTransaccion.RETIRO,monto);
    anadirTransaccion(transaccion);
    return transaccion;
  }

  public Transaccion deposito(Persona creador,double monto){
    if (monto <= 0){
      return null;
    }
    saldo += monto;
    Transaccion transaccion=Transaccion.crearTransaccion(creador,TipoTransaccion.DEPOSITO,monto);
    anadirTransaccion(transaccion);
    return transaccion;
  }

  public Transaccion transferencia(Persona creador,double monto,Cuenta cuenta){
    if (monto <= 0|| monto > saldo){
      return null;
    }
    saldo -= monto;
    Transaccion transaccion=Transaccion.crearTransaccion(creador,TipoTransaccion.TRANSFERENCIA,monto);
    anadirTransaccion(transaccion);
    cuenta.setSaldo(cuenta.getSaldo()+monto);
    cuenta.anadirTransaccion(transaccion);
    return transaccion;
  }


  private void anadirTransaccion(Transaccion transaccion){
    this.transacciones.add(transaccion);
  }

  public void mostrarMovimientos(){
    System.out.println("Movimientos de la cuenta "+numeroCuenta+": ");
    for(Transaccion transaccion:transacciones){
      System.out.println(transaccion);
    }
  }
  public ArrayList<String> getTitulares(){
    ArrayList<String> titulares=new ArrayList<>();
    for(ClienteCuenta clienteCuenta: clienteCuentas){
      Cliente cliente=clienteCuenta.getCliente();
      titulares.add(cliente.getNombre()+" "+cliente.getApellido());
    }
    return titulares;
  }



  public String getNumeroCuenta() {
    return numeroCuenta;
  }
  public ArrayList<ClienteCuenta> getClienteCuentas() {
    return clienteCuentas;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String mostrarCuenta() {
    StringBuilder sb = new StringBuilder();
    sb.append("-------------------\n")
        .append("Titulares: ").append(String.join(", ", getTitulares())).append("\n")
        .append("Tipo de cuenta: ").append(tipoCuenta).append("\n")
        .append("Saldo: S/.").append(saldo).append("\n")
        .append("Número de Cuenta: ").append(numeroCuenta).append("\n")
        .append("Fecha de apertura: ").append(fechaApertura).append("\n");

    for (ClienteCuenta cc : getClienteCuentas()) {
      sb.append(cc.mostrarClienteCuenta()).append("\n");
    }
    return sb.toString();
  }

}
