package com.lagarcia.banco;

public class CuentaNomina extends CuentaBancaria{
  //  Constructor
  public CuentaNomina(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
    super(titular,tipoDeCuenta,saldo);
  }
  //  Otro constructor, sobrecarga de constructores
  public CuentaNomina(String titular, double saldo){
    super(titular,saldo); // Usamos this para usar el constructor más completo
  }
  //  Constructor default
  public CuentaNomina(){
    super();
  }

  @Override
  public void informarSobreCondidiconesLegales() {
    System.out.println("Condiciones Legales de la cuenta Nomina del banco ***\n" +
        "Según el acuerdo firmado por usted...\n" +
        "Mientras se mantengan las condiciones de su cuenta, usted no tedrá comisión");

  }
}
