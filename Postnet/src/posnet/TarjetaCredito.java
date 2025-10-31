package posnet;

public class TarjetaCredito {
  private EntidadFinanciera entidadFinanciera;
  private String entidadBancaria;
  private String nroTarjeta;
  private double saldo;
  private Persona titular;

  public TarjetaCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, String nroTarjeta, double saldo, Persona titular) {
    this.entidadFinanciera = entidadFinanciera;
    this.entidadBancaria = entidadBancaria;
    this.nroTarjeta = nroTarjeta;
    this.saldo = saldo;
    this.titular = titular;
  }
}
