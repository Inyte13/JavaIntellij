package Actividad6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Cuenta {
  private TipoCuenta tipoCuenta;
  private double saldo;
  private String numeroCuenta;
  private LocalDateTime fechaApertura;
  private ArrayList<Transaccion> transacciones;
  private ArrayList<ClienteCuenta> clienteCuentas;

  private Cuenta(TipoCuenta tipoCuenta, double saldo) {
    this.tipoCuenta = tipoCuenta;
    this.saldo = saldo;
    this.numeroCuenta = generarNumeroCuenta();
    this.fechaApertura = LocalDateTime.now();
    this.transacciones = new ArrayList<>();
    this.clienteCuentas = new ArrayList<>();
  }
  private Cuenta(TipoCuenta tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
    this.saldo = 0.0;
    this.numeroCuenta = generarNumeroCuenta();
    this.fechaApertura = LocalDateTime.now();
    this.transacciones = new ArrayList<>();
    this.clienteCuentas = new ArrayList<>();
  }

  static Cuenta crearCuenta(TipoCuenta tipoCuenta){
    return new Cuenta(tipoCuenta);
  }
  static Cuenta crearCuenta(TipoCuenta tipoCuenta, double saldo){
    return new Cuenta(tipoCuenta,saldo);
  }

  private String generarNumeroCuenta(){
    return "Cuenta-" + UUID.randomUUID();
  }

  private void anadirTransaccion(Transaccion transaccion){
    this.transacciones.add(transaccion);
  }

  public Transaccion retirar(double monto){
    if(0<monto&&monto<=saldo){
      this.saldo-=monto;
    }
    Transaccion transaccion=Transaccion.crearTransaccion(TipoTransaccion.RETIRO,monto);
    anadirTransaccion(transaccion);
    return transaccion;
  }

  public Transaccion depositar(double monto){
    if(monto>0){
      this.saldo+=monto;
    }
    Transaccion transaccion=Transaccion.crearTransaccion(TipoTransaccion.DEPOSITO,monto);
    anadirTransaccion(transaccion);
    return transaccion;
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

  public String mostrarCuenta() {
    return "-------------------\n" +
        "Titulares: "+String.join(", ",getTitulares())+"\n"+
        "Tipo de cuenta: "+tipoCuenta+"\n" +
        "Saldo: S/."+saldo+"\n" +
        "Número de Cuenta: "+numeroCuenta+"\n" +
        "Fecha de apertura: "+fechaApertura+"\n";
  }
}
