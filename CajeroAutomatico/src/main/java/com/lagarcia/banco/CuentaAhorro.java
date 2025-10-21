package com.lagarcia.banco;

public class CuentaAhorro extends CuentaBancaria{
  private final double COMISION=0.12;
  //  Constructor
  public CuentaAhorro(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
    super(titular,tipoDeCuenta,saldo);
  }
  //  Otro constructor, sobrecarga de constructores
  public CuentaAhorro(String titular, double saldo){
    super(titular,saldo); // Usamos this para usar el constructor más completo
  }
  //  Constructor default
  public CuentaAhorro(){
    super();
  }

  @Override
  public void retirarDinero(double cantidad) {
    if(cantidad<0){
      return;
    }
    saldo-=cantidad;
    saldo-=COMISION;
  }

  @Override
  public void informarSobreCondidiconesLegales() {
    System.out.println("Condiciones Legales de la cuenta Ahorro del banco ***\n" +
        "Según el acuerdo firmado por usted...\n" +
        "Las comisiones por retirada de dinero de su cuenta serán de "+COMISION);

  }
}
